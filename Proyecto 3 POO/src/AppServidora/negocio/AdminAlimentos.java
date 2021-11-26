/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.negocio;

import AppServidora.modelo.Alimento;
import AppServidora.modelo.TVisibilidad;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author erksm
 */
public class AdminAlimentos {
    private ArrayList<Alimento> allAlimentos = new ArrayList();
    private int contadorAlimentos = 0;
    
    public AdminAlimentos(){
        allAlimentos = new ArrayList<>();
    }
    
    
    /**
     * Agrega un Alimento al registro controlando los repetidos
     * @param alimento el Alimento a agregar
     * @return true: lo agrego, false: no se agrego
     */
    public boolean agregar(Alimento alimento){
        for (Alimento a : allAlimentos) {
           if (a.getCodigo().equals(alimento.getCodigo()))
                return false;
        }
        allAlimentos.add(alimento);
        contadorAlimentos++;
        return true;
    }
    
    /**
     * Busca un entre los Alimentos bajo el id y lo retorna si lo encuentra
     * @param codigo el id del Alimento a consultar
     * @return Alimento: el objeto Alimento si lo encuentra, null: si no encuentra una coincidencia
     */
    public Alimento consultar(String codigo){  
        for (Alimento a : allAlimentos) {
            if (a.getCodigo().equals(codigo))
                return a;
        }
        return null;
    }
    /**
     * Valida si ya existe un Alimento con esos mismos datos
     * @param obj el Alimento que se quiere comparar 
     * @return  true/false de la condicion dada
     */
    public boolean validarExisteAlimento(Alimento obj){  
        for (Alimento a : allAlimentos) {
            if (a.equals(obj) || a.getCodigo().equals(obj.getCodigo()))
                return true;
        }
        return false;
    }
    
    /**
     * Busca un Alimento bajo el id y lo sobreescribe con el nuevo Alimento que tiene nuevos valores
     * @param nuevosDatos el Alimento con los nuevos datos para modificar
     * @return true: en caso de encontrar el Alimento y cambiar los datos, false:  en caso de no encontrar el Alimento
     */
    public boolean modificar(Alimento nuevosDatos){
        for (int i = 0; i < allAlimentos.size(); i++) {
            Alimento actual = allAlimentos.get(i);
            if (actual.getCodigo().equals(nuevosDatos.getCodigo())){
                allAlimentos.set(i, nuevosDatos);
                return true;            
            }
        }
        return false;
    }
    
    
    /**
     * busca un Alimento por id y si lo encuentra lo elimina del array
     * @param id el id del Alimento a eliminar
     * @return true: si existe un match y se elimina, false: si no se encuentran coincidencias
     */
    public boolean eliminar(String id){    
        for (int i = 0; i < allAlimentos.size(); i++) {
            Alimento actual = allAlimentos.get(i);
            if (actual.getCodigo().equals(id)){
                allAlimentos.remove(i);
                return true;            }
        }             
        return false;
    }

    /**
     * Retorna el contador de Alimentos, el cual almacena la cantidad total de Alimentos registrados
     * @return un int de cantidad de Alimentos total
     */
    public int getContadorAlimentos() {
        return contadorAlimentos;
    }
    /**
     * Retorna la cantidad de Alimentos registrados en un provincia especifica
     * @param provincia es la provincia en la que se desea contar los Alimentos
     * @return un int de cantidad de Alimentos filtrados
     */
    /*public int consultarAlimentos(NProvincia provincia){
        int cant = 0;
        for (Alimento Alimento : allAlimentos){
            if(Alimento.getProvincia() == provincia){
                cant++;
            }
        }
        return cant;
    }*/
    /**
     * Retorna la cantidad de Alimentos con un tipo de origen especifico
     * @param origen es el origen de los Alimentos que se quiere contar
     * @return un int de cantidad de Alimentos filtrados
     */
    /*public int consultarAlimentos(TOrigen origen){
        int cant = 0;
        for (Alimento Alimento : allAlimentos){
            if(Alimento.getOrigen() == origen){
                cant++;
            }
        }
        return cant;
    }*/   
   
    /**
     * Retorna un arraylist de Alimentos que se encuentren entre dos fechas indicadas
     * @param tipo el tipo de donde se quieren los Alimentos
     * @param visibilidad la visibilidad de donde se quieren extraer los Alimentos
     * @return arraylist de Alimentos filtrados
     */
    public ArrayList<Alimento> consultarAlimentos(String tipo,TVisibilidad visibilidad){
        ArrayList<Alimento> alimentosConultados = new ArrayList();
        for (Alimento a : allAlimentos){
            String codigo = a.getTipo();

            if(!tipo.equals("") && visibilidad != null){                
                if(codigo.equals(tipo) && a.getVisibilidad().equals(visibilidad))
                    alimentosConultados.add(a);
                
            }else if(!tipo.equals("")){
                if(codigo.equals(tipo))
                    alimentosConultados.add(a);
                
            }else if(visibilidad != null){
                if(a.getVisibilidad().equals(visibilidad))
                    alimentosConultados.add(a);
            }else{
                alimentosConultados.add(a);
            }
        }
        return alimentosConultados;
    }
    /**
     * Retorna la cantidad de Alimentos de un mes especifico y un año especifico
     * @param mes el mes del que se desean los Alimentos
     * @param annio el año de donde se desean los Alimentos
     * @return int: cantidad de Alimentos filtrados
     */
    /*public int consultarAlimentos(int mes, int annio){
        int cant = 0;
        for (Alimento Alimento : allAlimentos){
            if(Alimento.getFecha().get(Calendar.MONTH) == mes && Alimento.getFecha().get(Calendar.YEAR) == annio){
                cant++;
            }
        }
        return cant;
    }*/   
    
   
    
    @Override
    public String toString() {
        return "AdmiAlimentos{" + "allAlimentos=" + allAlimentos + '}';
    }
    /**
     * retorna un arraylist de todos los Alimentos registrados
     * @return arralist de Alimentos
     */
    public ArrayList<Alimento> getAllAlimentos() {
        return allAlimentos;
    }
}
