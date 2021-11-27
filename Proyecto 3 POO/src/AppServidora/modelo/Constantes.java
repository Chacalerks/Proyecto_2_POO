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
public abstract class Constantes{
    
     public static int contanteEntrega =321;
     public static int contantEmpaque;

    public static int getContanteEntrega() {
        return contanteEntrega;
    }

    public static void setContanteEntrega(int contanteEntrega) {
        Constantes.contanteEntrega = contanteEntrega;
    }

    public static int getContantEmpaque() {
        return contantEmpaque;
    }

    public static void setContantEmpaque(int contantEmpaque) {
        Constantes.contantEmpaque = contantEmpaque;
    }
     
     
}
