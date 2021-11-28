/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author muril
 */
public class PMesa extends Pedido {
    
    private int mesa;

    public PMesa(int id, Carrito carrito, double precio, Date date, String name) {
        super(id, carrito, precio, date, name);
    }

    

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "\nNúmero de mesa: \t" + mesa;
    }

    @Override
    public String mostrarDesgloce() {
        super.precio = super.carrito.getTotalPrecio();
        String datos = super.carrito.toString();        
        return datos; 
    }
    
    
}
