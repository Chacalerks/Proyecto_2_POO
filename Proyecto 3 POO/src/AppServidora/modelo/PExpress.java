/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

import java.util.Date;

/**
 *
 * @author muril
 */
public class PExpress extends Pedido{
    
    private String númeroTelefono;
    private String direccion;
    private static int costoEmpaque = Constantes.getContantEmpaque();
    private static int costoExpress  = Constantes.getContanteEntrega();

    public PExpress(int id, Carrito carrito, double precio, Date date, String name) {
        super(id, carrito, precio, date, name);
    }
    
     

    public String getNúmeroTelefono() {
        return númeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNúmeroTelefono(String númeroTelefono) {
        this.númeroTelefono = númeroTelefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCostoEmpaque() {
        Double dato = (double)carrito.getTotalPrecio()*((double)Constantes.getContantEmpaque()/100);
        return dato;
    }

    public static void setCostoEmpaque(int costoEmpaque) {
        PExpress.costoEmpaque = costoEmpaque;
    }

    public double getCostoExpress() {
        Double dato = (double)carrito.getTotalPrecio()*((double)Constantes.getContanteEntrega()/100);
        return dato;
    }

    public static void setCostoExpress(int costoExpress) {
        PExpress.costoExpress = costoExpress;
    }

    @Override
    public String toString() {
        return "\nCelular: \t" + númeroTelefono + "\nDirección: \t" + direccion;
    }

    @Override
    public String mostrarDesgloce() {
        String datos = super.carrito.toString(); 
        double total = carrito.getTotalPrecio(), empaque = getCostoEmpaque(), envio = getCostoExpress();
        
        datos += "\n + empaque:            \t"+String.format("%.2f", empaque);
        datos += "\n + envio:              \t\t"+String.format("%.2f", envio);
        datos += "\n\nTOTAL:               \t\t"+String.format("%.2f", total+envio+empaque);
        super.precio = total+envio+empaque;
        return datos; 
    }
    
    
    
    
}
