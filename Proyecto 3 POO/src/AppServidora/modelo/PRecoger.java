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
public class PRecoger extends Pedido {
    
    private String nombre;
    private String celular;
    private int costoEmpaque;

    public PRecoger(String nombre, String celular, int id, ArrayList<Producto> carrito, double precio, String tipoEntrega) {
        super(id, carrito, precio, tipoEntrega);
        this.nombre = nombre;
        this.celular = celular;
        costoEmpaque = ConstanteEmpaque.getContantEmpaque(); 
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "PRecoger: " + "nombre: " + nombre + ", celular: " + celular;
    }
    
    
}
