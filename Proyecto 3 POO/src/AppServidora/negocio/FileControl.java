/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.negocio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author muril
 */
public class FileControl {
    
    public FileControl() {
    }
    
      public int writeFile(String nombreArchivo, ArrayList lista){

        FileOutputStream archivoEscritura = null;
        ObjectOutputStream manejadorEscritura = null;
        try {
            // apertura del archivo
            manejadorEscritura  = new ObjectOutputStream(new FileOutputStream (nombreArchivo));
            
            //procesamiento
            for (Object lista1 : lista) {
                manejadorEscritura.writeObject(lista1);
            }
            
            
            //cierre
            return 0;

        } catch (FileNotFoundException ex) {
            System.out.println("No se pudo crear el archivo " + nombreArchivo);
            return 1;
        } catch (IOException ex) {
            System.out.println("Tengo problemas para escribir el archivo " + nombreArchivo);
            return 1;
        } 
        finally {
            try {
                if (manejadorEscritura != null)
                    manejadorEscritura.flush();  // asegurarse que todos los datos abandonen el stream
                    manejadorEscritura.close();
            } catch (IOException ex) {
                return 1;
            }
        }
    }
    
    public ArrayList loadFile(String nombreArchivo){

        ObjectInputStream manejadorLectura = null;
        ArrayList lista = null;
        
        try {
            // apertura del archivo
            manejadorLectura = new ObjectInputStream(new FileInputStream (nombreArchivo));
            
            //procesamiento
            lista = new ArrayList();
            Object obj = manejadorLectura.readObject() ;          
            while (obj != null){
                lista.add(obj);
                obj = manejadorLectura.readObject() ;
            }
            
            //cierre
            return lista;

        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo cargar el registro del archivo " + nombreArchivo);
            return null;
        } catch (FileNotFoundException ex) {
            System.out.println("No se pudo cargar el archivo " + nombreArchivo);
            return null;
        } catch (IOException ex) {
            System.out.println("fin del archivo" + nombreArchivo);
            return lista;
        } 
        finally {
            try {
                if (manejadorLectura != null)
                    manejadorLectura.close();
            } catch (IOException ex) {
                return null;
            }
        }
    } 
    
}
