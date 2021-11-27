/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.negocio;

import AppCliente.vista.Utilities;
import AppServidora.modelo.Alimento;
import AppServidora.modelo.Constantes;
import AppServidora.modelo.Pedido;
import AppServidora.modelo.Producto;
import AppServidora.modelo.TVisibilidad;
import general.Peticion;
import general.TipoAccion;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ersolano
 */
public class Controlador {
    
    private AdmUsuarios admUsr = new AdmUsuarios();
    private AdminAlimentos adminAlimentos = new AdminAlimentos();
    private FileControl fileControl = new FileControl(); 
    private AdminPedidos adminPedidos = new AdminPedidos();

    public Controlador() {
    }
    
    /**
     * Se encarga de procesar el tipo de peticion
     * @param peticionRecibida la peticion hecha por el cliente
     * @return La peticion con los datos de salida seteados
     */
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        TipoAccion accion = peticionRecibida.getAccion();

        if(accion == TipoAccion.CARGAR_ALIMENTOS){ 
            ArrayList arrayDatos = (ArrayList) peticionRecibida.getDatosEntrada(); 
            List<Object> datosProductos = fileControl.loadFile("src\\AppServidora\\files\\"+((String)arrayDatos.get(0)));
            for (Object i: datosProductos)                    
                adminAlimentos.agregar((Alimento)i); 
            peticionRecibida.setDatosSalida(cargarAlimentos());

        }else if( accion== TipoAccion.INGRESAR){ 
            String credenciales = (String) peticionRecibida.getDatosEntrada();
            String [] partes  = credenciales.split("-"); 
            boolean admOK = admUsr.validarAdm(partes[0], partes[1]);

            List<Object> numbers = fileControl.loadFile("src\\AppServidora\\files\\numbers.dat");
            if(numbers != null){
                Constantes.setContantEmpaque((int)numbers.get(0));
                Constantes.setContanteEntrega((int)numbers.get(1));
            }
            
            List<Object> datosProductos = fileControl.loadFile("src\\AppServidora\\files\\pedidos.dat");
            if(datosProductos != null){
                for (Object i: datosProductos){                    
                    adminPedidos.agregar((Pedido)i);
                }
            }
            topTEN();
             peticionRecibida.setDatosSalida(admOK);

        }else if( accion== TipoAccion.VER_PRODUCTOS){
            ArrayList arrayDatos = (ArrayList) peticionRecibida.getDatosEntrada();                

            ArrayList<Alimento> alimentosFiltrados = new ArrayList();               

            if(arrayDatos.size() > 1){
                if((int)arrayDatos.get(3) == 0){
                    alimentosFiltrados = filtrarAlimentos((String)arrayDatos.get(1),(TVisibilidad)arrayDatos.get(2));
                    peticionRecibida.setDatosSalida(cargarAlimentos(alimentosFiltrados));
                }else{
                    alimentosFiltrados = filtrarAlimentos((String)arrayDatos.get(1),(TVisibilidad)arrayDatos.get(2));
                    peticionRecibida.setDatosSalida(cargarAlimentosCliente(alimentosFiltrados));
                }
                
            }else{
                peticionRecibida.setDatosSalida(cargarAlimentos());
            }

        }else if( accion== TipoAccion.AGREGAR_CATALOGO){
            Alimento alimento = (Alimento) peticionRecibida.getDatosEntrada();
            peticionRecibida.setDatosSalida(agregarAlimentoCatalogo(alimento));
            fileControl.writeFile("src\\AppServidora\\files\\catalogoAlimentos.dat", adminAlimentos.getAllAlimentos());

        }else if( accion== TipoAccion.MODIFICAR_CATALOGO){
           Alimento alimento = (Alimento) peticionRecibida.getDatosEntrada();
           peticionRecibida.setDatosSalida(modificarAlimentoCatalogo(alimento));
           fileControl.writeFile("src\\AppServidora\\files\\catalogoAlimentos.dat", adminAlimentos.getAllAlimentos());

        }else if( accion== TipoAccion.CONSULTAR_PRODUCTO){
           String codigo = (String) peticionRecibida.getDatosEntrada();
           peticionRecibida.setDatosSalida(consultarAlimento(codigo));                

        }else if( accion== TipoAccion.AGREGAR_PEDIDO){
            Pedido pedido = (Pedido) peticionRecibida.getDatosEntrada();            
            peticionRecibida.setDatosSalida(agregarPedido(pedido));
            fileControl.writeFile("src\\AppServidora\\files\\pedidos.dat", adminPedidos.getAllPedidos());
            
        }else if( accion== TipoAccion.SETTINGS){
            ArrayList numbers = (ArrayList) peticionRecibida.getDatosEntrada();
            System.out.println("\n\nConstante recibida por el servidor "+(int)numbers.get(0));
            Constantes.setContantEmpaque((int)numbers.get(0));
            Constantes.setContanteEntrega((int)numbers.get(1));
            fileControl.writeFile("src\\AppServidora\\files\\numbers.dat", numbers);
            peticionRecibida.setDatosSalida(true);
            
        }else if( accion== TipoAccion.LOAD_CONST){
            ArrayList numbers = new ArrayList();
            
            numbers.add(Constantes.getContantEmpaque());
            numbers.add(Constantes.getContanteEntrega());
            peticionRecibida.setDatosSalida(numbers);
        }
        
        
                
        
        return peticionRecibida;
    }
    
    /**
     * Filtra la busque de a limentos 
     * @param tipo valiabre de los alimentos que se quieren filtrar
     * @param visibilidad varaible de los alimentos que se quieren filtrar
     * @return ArrayList de los alimentos filtrados
     */
    public ArrayList<Alimento> filtrarAlimentos(String tipo,TVisibilidad visibilidad ){
        return adminAlimentos.consultarAlimentos(tipo, visibilidad);
    }
    
    public boolean modificarAlimentoCatalogo(Alimento a) {        
        if(adminAlimentos.validarExisteAlimento(a))         
            return adminAlimentos.modificar(a);
        
        return false;
    }
    
    /**
     * método del controlador para una instancia de un sismo al adminSismos
     * @param nuevoAlimento El alimento a agregar
     * @return true/false si se agregó el sismo
     */    
    public boolean agregarAlimentoCatalogo(Alimento nuevoAlimento) {
        if(!adminAlimentos.validarExisteAlimento(nuevoAlimento))      
            return adminAlimentos.agregar(nuevoAlimento);        
        return false;
    }
    
    /**
     * método del controladora para consultar un alimento
     * @param id valor entero que identifica el alimento
     * @return  el obejto sismo encontrado
     */
    public Alimento consultarAlimento(String id) {
        return adminAlimentos.consultar(id);
    }
    
    public DefaultTableModel cargarAlimentos() {
        return Cargador.cargarAlimentos(adminAlimentos.getAllAlimentos());
    }
    
    /**
     * método del controlador para una instancia de un pedido al pedido
     * @param nuevoPedido El pedido a agregar
     * @return true/false si se agregó el sismo
     */    
    public boolean agregarPedido(Pedido nuevoPedido) {        
        return adminPedidos.agregar(nuevoPedido);        

    }
    /**
     * Obtiene el top ten de los alimentos más pedidos
     * @return  ArrayList de lso 10 alimentos más peiddos
     */
    public ArrayList<Alimento> topTEN(){
        Producto lista[] = new Producto[adminAlimentos.getContadorAlimentos()];
        ArrayList<Alimento> alimentosTop = new ArrayList();
        int index = 0;
        for(Alimento i: adminAlimentos.getAllAlimentos()){
            lista[index] = new Producto(i,adminPedidos.contarAlimento(i));            
            index++;
        }
        Utilities.sortProductos(lista);
        for (int i = 0; i < 10; i++) {
             alimentosTop.add(lista[i].getProducto());
        } 
        return alimentosTop;
    }
    
    public DefaultTableModel cargarAlimentosCliente(ArrayList<Alimento> alimentos) {
        return Cargador.cargarAlimentosCliente(alimentos);
    }
    
    public DefaultTableModel cargarAlimentos(ArrayList<Alimento> alimentos) {
        return Cargador.cargarAlimentos(alimentos);
    }
}
