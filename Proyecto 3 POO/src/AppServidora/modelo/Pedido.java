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
public abstract class Pedido implements Serializable{
    
    protected int id;
    protected Carrito carrito; 
    protected double precio;

    public Pedido(int id, Carrito carrito, double precio) {
        this.id = id;
        this.carrito = carrito;
        this.precio = precio;
    }


    public Carrito getCarrito() {
        return carrito;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract String mostrarDesgloce();   

    @Override
    public String toString() {
        return "Pedido: " + "id: " + id + ", carrito: " + carrito + ", precio: " + precio + ", tipo de entrega: " ;
    }
}
