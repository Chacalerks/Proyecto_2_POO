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
public class PExpress extends Pedido{
    
    private String númeroTelefono;
    private String direccion;
    private static int costoEmpaque = Constantes.getContantEmpaque();
    private static int costoExpress  = Constantes.getContanteEntrega();
    
    public PExpress(int id, Carrito carrito, double precio) {
        super(id, carrito, precio);
    }

    public PExpress(String númeroTelefono, String direccion, int id, Carrito carrito, double precio) {
        super(id, carrito, precio);
        this.númeroTelefono = númeroTelefono;
        this.direccion = direccion;
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

    public static int getCostoEmpaque() {
        return costoEmpaque;
    }

    public static void setCostoEmpaque(int costoEmpaque) {
        PExpress.costoEmpaque = costoEmpaque;
    }

    public static int getCostoExpress() {
        return costoExpress;
    }

    public static void setCostoExpress(int costoExpress) {
        PExpress.costoExpress = costoExpress;
    }

    @Override
    public String toString() {
        return "PExpress:" + "numero de telefono: " + númeroTelefono + ", direccion: " + direccion;
    }

    @Override
    public String mostrarDesgloce() {
        String datos = "";
        return datos;
    }
    
    
    
    
}
