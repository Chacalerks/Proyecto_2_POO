/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista;

import AppCliente.conexion.Client;
import general.Peticion;
import general.TipoAccion;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muril
 */
public class PanelEstadisticaNunca extends javax.swing.JPanel {
    
    private JPanel contentPanel;
    private JPanel backPanel;

    /**
     * Creates new form PanelEstadisticaNunca
     */
    public PanelEstadisticaNunca(JPanel content, JPanel back) {
        initComponents();
        contentPanel = content; 
        backPanel = back;
        imgArrowLeft.setIcon(Utilities.loadResizeIcon("src\\img\\arrow-left.png", 50));
    }
    
    public void loadDatos(){        
        Peticion peticion = new Peticion(TipoAccion.NUNCA, "");
        Client conexion = new Client(peticion);     
        
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            tableNuncaSolicitado.setModel((DefaultTableModel)respuesta);
            tableNuncaSolicitado.setDefaultEditor(Object.class, null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNuncaSolicitado = new javax.swing.JTable();
        imgArrowLeft = new javax.swing.JLabel();
        lbSismos14 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableNuncaSolicitado.setBackground(new java.awt.Color(255, 255, 255));
        tableNuncaSolicitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNuncaSolicitado.setOpaque(false);
        tableNuncaSolicitado.setSelectionBackground(new java.awt.Color(86, 73, 64));
        tableNuncaSolicitado.setShowHorizontalLines(true);
        tableNuncaSolicitado.setShowVerticalLines(true);
        tableNuncaSolicitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableNuncaSolicitadoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableNuncaSolicitado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1270, 280));

        imgArrowLeft.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        imgArrowLeft.setForeground(new java.awt.Color(255, 255, 255));
        imgArrowLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO.png"))); // NOI18N
        imgArrowLeft.setText("<");
        imgArrowLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgArrowLeftMouseClicked(evt);
            }
        });
        jPanel1.add(imgArrowLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        lbSismos14.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos14.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbSismos14.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos14.setText("Alimentos que nunca se han solicitado");
        lbSismos14.setToolTipText("");
        jPanel1.add(lbSismos14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 410, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1362, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void tableNuncaSolicitadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNuncaSolicitadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNuncaSolicitadoMousePressed

    private void imgArrowLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgArrowLeftMouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(contentPanel, backPanel);
    }//GEN-LAST:event_imgArrowLeftMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgArrowLeft;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSismos14;
    private javax.swing.JTable tableNuncaSolicitado;
    // End of variables declaration//GEN-END:variables
}
