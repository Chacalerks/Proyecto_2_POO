/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

import AppServidora.modelo.Alimento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muril
 */
public class Pedido implements Serializable{
    
    private ArrayList<Alimento> alimentos; 
    private int id;
    private int precio;
    private String lugar; 

    public Pedido(ArrayList<Alimento> alimentos, int id, int precio, String lugar) {
        this.alimentos = alimentos;
        this.id = id;
        this.precio = precio;
        this.lugar = lugar;
    }

    public List<Alimento> getPedido() {
        return alimentos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setPedido(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public int getId() {
        return id;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "alimentos=" + alimentos + ", id=" + id + ", precio=" + precio + ", lugar=" + lugar + '}';
    }


    
}
