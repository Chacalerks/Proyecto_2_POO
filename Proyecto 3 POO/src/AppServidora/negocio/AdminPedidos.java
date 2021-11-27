/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.negocio;

import AppServidora.modelo.Alimento;
import AppServidora.modelo.Pedido;
import AppServidora.modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author erksm
 */
public class AdminPedidos {
    private ArrayList<Pedido> allPedidos = new ArrayList();
    private int contadorAlimentos = 0;

    public AdminPedidos() {
    }

    public ArrayList<Pedido> getAllPedidos() {
        return allPedidos;
    }

    public void setAllPedidos(ArrayList<Pedido> allPedidos) {
        this.allPedidos = allPedidos;
    }

    public int getContadorAlimentos() {
        return contadorAlimentos;
    }

    public void setContadorAlimentos(int contadorAlimentos) {
        this.contadorAlimentos = contadorAlimentos;
    }
    
    /**
     * Agrega un pedido al registro controlando los repetidos
     * @param pedido el pedido a agregar
     * @return true: lo agrego, false: no se agrego
     */
    public boolean agregar(Pedido pedido){
        for (Pedido p : allPedidos) {
           if (p.equals(pedido))
                return false;
        }
        allPedidos.add(pedido);
        contadorAlimentos++;
        return true;
    }
    
    /**
     * Busca un entre los pedido bajo el id y lo retorna si lo encuentra
     * @param codigo el id del pedido a consultar
     * @return Alimento: el objeto Alimento si lo encuentra, null: si no encuentra una coincidencia
     */
    public Pedido consultar(int codigo){  
        for (Pedido p : allPedidos) {
            if (p.getId()== codigo)
                return p;
        }
        return null;
    }
    
    /**
     * busca un pedido por id y si lo encuentra lo elimina del array
     * @param id el id del pedido a eliminar
     * @return true: si existe un match y se elimina, false: si no se encuentran coincidencias
     */
    public boolean eliminar(int id){    
        for (int i = 0; i < allPedidos.size(); i++) {
            Pedido actual = allPedidos.get(i);
            if (actual.getId() == id){
                allPedidos.remove(i);
                return true;            
            }
        }             
        return false;
    }
    
    /**
     * Cuenta las veces que se repite un alimento entre todos los pedidos
     * @param alimento, el alimento a contar
     * @return la cantidadd de veces que se repite el alimento
     */
    public int contarAlimento(Alimento alimento){ 
        int cont = 0;
        for (Pedido p : allPedidos) {
            for(Producto producto: p.getCarrito().getAllProducto()){
                if(producto.getProducto().getCodigo().equals(alimento.getCodigo()))
                    cont++;                
            }            
        }
        return cont;
    }

}
