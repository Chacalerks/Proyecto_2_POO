/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.negocio;

import AppServidora.modelo.Alimento;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erksm
 */
public class Cargador {
    
    /**
     * Carga los datos para ser visualizados en una tabla
     * @param array arrayList de los datos que se van a mostrar
     * @return tableModel con los datos a mostrar
     */
    public static DefaultTableModel cargarAlimentos(ArrayList<Alimento> array){
        Object [] encabezado = {"Código", "Nombre", "Tamaño", "Piezas", "Calorías x Porcion", "Precio"};
        DefaultTableModel dtm = new DefaultTableModel(encabezado, array.size());
        
        for (int i = 0; i < dtm.getRowCount(); i++) {
            Alimento alimento = array.get(i);
            dtm.setValueAt(alimento.getCodigo(), i, 0);
            dtm.setValueAt(alimento.getNombre(), i, 1);
            dtm.setValueAt(alimento.getSizePorcion()+" g", i, 2);
            dtm.setValueAt(alimento.getPiezasPorcion(),i, 3);
            dtm.setValueAt(alimento.getCaloriasPorcion(), i, 4);
            dtm.setValueAt(String.format("%.3f", alimento.getPrecio()), i, 5);
            
        }
        return dtm;
    }
    
     /**
     * Carga los datos para ser visualizados en una tabla
     * @param array arrayList de los datos que se van a mostrar
     * @return tableModel con los datos a mostrar
     */
    public static DefaultTableModel cargarAlimentosCliente(ArrayList<Alimento> array){
        Object [] encabezado = {"Código","Nombre", "Tamaño", "Piezas", "Calorías x Porcion","Calorías x Pieza", "Precio"};
        DefaultTableModel dtm = new DefaultTableModel(encabezado, array.size());
        
        for (int i = 0; i < dtm.getRowCount(); i++) {
            Alimento alimento = array.get(i);
            dtm.setValueAt(alimento.getCodigo(), i, 0);
            dtm.setValueAt(alimento.getNombre(), i, 1);
            dtm.setValueAt(alimento.getSizePorcion()+" g", i, 2);
            dtm.setValueAt(alimento.getPiezasPorcion(),i, 3);
            dtm.setValueAt(alimento.getCaloriasPorcion(), i, 4);
            dtm.setValueAt(alimento.getCaloriasPieza(), i, 5);
            dtm.setValueAt(String.format("%.3f", alimento.getPrecio()), i, 6);
            
        }
        return dtm;
   }
}
