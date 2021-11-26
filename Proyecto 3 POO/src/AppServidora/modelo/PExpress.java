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
public class PExpress {
    
    private String númeroTelefono;
    private String direccion;
    private int costoEmpaque;
    private int costoExpress;
    
    public PExpress(String númeroTelefono, String direccion) {
        this.númeroTelefono = númeroTelefono;
        this.direccion = direccion;
        costoEmpaque = ConstanteEmpaque.getContantEmpaque();
        costoExpress = ConstanteEntrega.getContanteEntrega();
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

    @Override
    public String toString() {
        return "PExpress:" + "numero de telefono: " + númeroTelefono + ", direccion: " + direccion;
    }
    
    
    
    
}
