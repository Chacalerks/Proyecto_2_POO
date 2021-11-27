/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author erksm
 */
public class Carrito implements Serializable{
    private ArrayList<Producto> carrito = new ArrayList(); 

    public Carrito() {
        
    }

    public Carrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }
    
    public boolean agregarCarrito(Producto p){
        carrito.add(p);
        return true;
    }
    public double getTotalPrecio(){
        Double dato =0.0;
        for(Producto i: carrito)
            dato += (double)i.getProducto().getPrecio()*i.getCantidadSeleccionada();
        
        return dato;
    }
    
    public boolean eliminarCarrito(Producto p){
        for(Producto i: carrito){
            if(i.equals(p) || (i.getCantidadSeleccionada() == p.getCantidadSeleccionada() && i.getProducto().getCodigo().equals(p.getProducto().getCodigo()))){
                carrito.remove(p);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Producto> getAllProducto(){
        return carrito;
    }
    @Override
    public String toString() {
        String datos ="";
        for(Producto i: carrito){            
            datos += "\nNombre: "+i.getProducto().getNombre();
            datos += "\nCantidad: "+String.valueOf(i.getCantidadSeleccionada());
            datos += "\nPrecio Unidad: "+String.valueOf(i.getProducto().getPrecio());
            datos += "\n";
        }
        datos += "\nTotal: "+String.valueOf(getTotalPrecio());
        return datos;
    }
}
