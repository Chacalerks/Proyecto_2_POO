/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

import java.io.Serializable;

/**
 *
 * @author muril
 */
public class Producto implements Serializable{
    
    private Alimento producto;
    private int cantidadSeleccionada;

    public Producto(Alimento producto, int cantidadSeleccionada) {
        this.producto = producto;
        this.cantidadSeleccionada = cantidadSeleccionada;
    }

    public Alimento getProducto() {
        return producto;
    }

    public int getCantidadSeleccionada() {
        return cantidadSeleccionada;
    }

    public void setProducto(Alimento producto) {
        this.producto = producto;
    }

    public void setCantidadSeleccionada(int cantidadSeleccionada) {
        this.cantidadSeleccionada = cantidadSeleccionada;
    }

    @Override
    public String toString() {
        return "Producto; " + "producto: " + producto + ", cantidadSeleccionada: " + cantidadSeleccionada;
    }
    
    
    
}
