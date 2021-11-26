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
    
    private int id;
    private ArrayList<Producto> carrito; 
    private double precio;
    private String tipoEntrega; 

    public Pedido(int id, ArrayList<Producto> carrito, double precio, String tipoEntrega) {
        this.id = id;
        this.carrito = carrito;
        this.precio = precio;
        this.tipoEntrega = tipoEntrega;
    }


    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    @Override
    public String toString() {
        return "Pedido: " + "id: " + id + ", carrito: " + carrito + ", precio: " + precio + ", tipo de entrega: " + tipoEntrega;
    }
}
