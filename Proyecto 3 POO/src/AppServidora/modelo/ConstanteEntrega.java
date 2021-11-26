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
public abstract class ConstanteEntrega {
    
     public static int contanteEntrega;

    public static int getContanteEntrega() {
        return contanteEntrega;
    }

    public static void setContanteEntrega(int contanteEntrega) {
        ConstanteEntrega.contanteEntrega = contanteEntrega;
    }
     
     
}
