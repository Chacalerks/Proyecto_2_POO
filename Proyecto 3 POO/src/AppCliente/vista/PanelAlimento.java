/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista;

import AppServidora.modelo.Alimento;
import AppServidora.modelo.Carrito;
import AppServidora.modelo.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erksm
 */
public class PanelAlimento extends javax.swing.JPanel {

    /**
     * Creates new form PanelAlimento
     */
    private PanelCarrito carritoPanel;
    private Carrito carrito;
    private Producto producto;
    public PanelAlimento(PanelCarrito car, int cantidad, Alimento alimento, Carrito carrito, Producto producto) {
        initComponents();
        carritoPanel = car;
        this.carrito = carrito;
        this.producto = producto;
        imgDelete.setIcon(Utilities.loadResizeIcon("src\\img\\clear.png", 30));
        lbName.setText(alimento.getNombre());
        lbCant.setText(String.valueOf(cantidad));
        lbPrecio.setText("C "+String.format("%.3f", alimento.getPrecio()*cantidad));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPrecio = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbCant = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        imgDelete = new javax.swing.JLabel();

        setBackground(new java.awt.Color(86, 73, 64));
        setPreferredSize(new java.awt.Dimension(320, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPrecio.setBackground(new java.awt.Color(0, 0, 0));
        lbPrecio.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecio.setText("c 25355");
        lbPrecio.setToolTipText("");
        add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 30));

        lbName.setBackground(new java.awt.Color(0, 0, 0));
        lbName.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Username");
        lbName.setToolTipText("");
        add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 30));

        lbCant.setBackground(new java.awt.Color(0, 0, 0));
        lbCant.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbCant.setForeground(new java.awt.Color(255, 255, 255));
        lbCant.setText("10");
        lbCant.setToolTipText("");
        lbCant.setName(""); // NOI18N
        add(lbCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 40, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 10));

        imgDelete.setText("jLabel1");
        imgDelete.setName(""); // NOI18N
        imgDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgDeleteMouseClicked(evt);
            }
        });
        add(imgDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void imgDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgDeleteMouseClicked
        // TODO add your handling code here:
        lbName.setText("Estos precionando");
        carrito.eliminarCarrito(producto);
        carritoPanel.mainList.remove(this);
        
        carritoPanel.validate();
        carritoPanel.repaint();
        
    }//GEN-LAST:event_imgDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgDelete;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCant;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPrecio;
    // End of variables declaration//GEN-END:variables
}