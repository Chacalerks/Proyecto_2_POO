/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

/**
 *
 * @author muril
 */
public class PRecoger extends Pedido {
    
    private String nombre;
    private String celular;
    private static int costoEmpaque;

    public PRecoger(int id, Carrito carrito, double precio) {
        super(id, carrito, precio);
    }
    
    
    public PRecoger(String nombre, String celular, int id, Carrito carrito, double precio, String tipoEntrega) {
        super(id, carrito, precio);
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

    @Override
    public String mostrarDesgloce() {
        String datos = "";
        
        return datos;        
    }
    
    
}
