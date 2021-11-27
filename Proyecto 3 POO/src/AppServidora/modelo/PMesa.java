/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

import java.util.ArrayList;

/**
 *
 * @author muril
 */
public class PMesa extends Pedido {
    
    private int mesa;

    public PMesa(int id, Carrito carrito, double precio) {
        super(id, carrito, precio);
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "PMesa: " + "número de mesa:" + mesa;
    }

    @Override
    public String mostrarDesgloce() {
        String datos = super.carrito.toString();        
        return datos; 
    }
    
    
}
