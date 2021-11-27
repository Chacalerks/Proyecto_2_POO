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
    private static int costoEmpaque = Constantes.getContantEmpaque();

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
    public double getCostoEmpaque() {
        Double dato = (double)carrito.getTotalPrecio()*((double)Constantes.getContantEmpaque()/100);
        return dato;
    }

    @Override
    public String toString() {
        return "PRecoger: " + "nombre: " + nombre + ", celular: " + celular;
    }

    @Override
    public String mostrarDesgloce() {
        String datos = super.carrito.toString(); 
        double total = carrito.getTotalPrecio(), empaque = getCostoEmpaque();
        
        datos += "\n + empaque:            \t"+String.format("%.2f", empaque);
        datos += "\n\nTOTAL:               \t\t"+String.format("%.2f", total+empaque);
        return datos;       
    }

    
}
