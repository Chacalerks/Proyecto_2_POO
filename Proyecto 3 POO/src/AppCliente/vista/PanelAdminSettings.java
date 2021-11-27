/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista;

import AppCliente.conexion.Client;
import AppServidora.modelo.Constantes;
import general.Peticion;
import general.TipoAccion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author erksm
 */
public class PanelAdminSettings extends javax.swing.JPanel {

    /**
     * Creates new form PanelAdminSettings
     */
    private JPanel contentPanel;
    private JPanel backPanel;
    public PanelAdminSettings(JPanel content, JPanel back) {
        initComponents();
        contentPanel = content;
        backPanel = back;
      
        imgArrowLeft.setIcon(Utilities.loadResizeIcon("src\\img\\arrow-left.png", 50));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void loadDatos(){
        Peticion peticion = new Peticion(TipoAccion.LOAD_CONST,"");
        Client conexion = new Client(peticion);
        Object respuesta = conexion.getRespuestaServer();
        if(respuesta != null){
            ArrayList array = (ArrayList)respuesta;
            txtPorcentajeEmpaque.setText(String.valueOf((int)array.get(0)));
            txtPorcentajeEnvio.setText(String.valueOf((int)array.get(1)));     
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesgloce = new javax.swing.JTextArea();
        txtPorcentajeEmpaque = new javax.swing.JTextField();
        lbSismos13 = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JLabel();
        txtPorcentajeEnvio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lbSismos14 = new javax.swing.JLabel();
        imgArrowLeft = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(212, 212, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 340, 10));

        jPanel2.setBackground(new java.awt.Color(86, 73, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDesgloce.setEditable(false);
        txtDesgloce.setBackground(new java.awt.Color(86, 73, 64));
        txtDesgloce.setColumns(20);
        txtDesgloce.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDesgloce.setForeground(new java.awt.Color(255, 255, 255));
        txtDesgloce.setRows(5);
        txtDesgloce.setText("asdfasdf");
        txtDesgloce.setToolTipText("");
        jScrollPane1.setViewportView(txtDesgloce);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 590, 450));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 630, 500));

        txtPorcentajeEmpaque.setBackground(new java.awt.Color(212, 212, 212));
        txtPorcentajeEmpaque.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtPorcentajeEmpaque.setForeground(new java.awt.Color(99, 99, 99));
        txtPorcentajeEmpaque.setBorder(null);
        jPanel1.add(txtPorcentajeEmpaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 340, 30));

        lbSismos13.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos13.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbSismos13.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos13.setText("Porcentaje Envio");
        lbSismos13.setToolTipText("");
        jPanel1.add(lbSismos13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 140, 30));

        btnAplicar.setBackground(new java.awt.Color(86, 73, 64));
        btnAplicar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnAplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAplicar.setText("Aplicar");
        btnAplicar.setIconTextGap(20);
        btnAplicar.setOpaque(true);
        btnAplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAplicarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 340, 50));

        txtPorcentajeEnvio.setBackground(new java.awt.Color(212, 212, 212));
        txtPorcentajeEnvio.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtPorcentajeEnvio.setForeground(new java.awt.Color(99, 99, 99));
        txtPorcentajeEnvio.setBorder(null);
        jPanel1.add(txtPorcentajeEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 340, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 340, 10));

        lbSismos14.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos14.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbSismos14.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos14.setText("Porcentaje Empaque");
        lbSismos14.setToolTipText("");
        jPanel1.add(lbSismos14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 1210, 500));

        imgArrowLeft.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        imgArrowLeft.setForeground(new java.awt.Color(255, 255, 255));
        imgArrowLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO.png"))); // NOI18N
        imgArrowLeft.setText("<");
        imgArrowLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgArrowLeftMouseClicked(evt);
            }
        });
        add(imgArrowLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplicarMouseClicked
        // TODO add your handling code here:

        ArrayList numbers = new ArrayList();
        try{
            numbers.add(Integer.parseInt(txtPorcentajeEmpaque.getText()));
            numbers.add(Integer.parseInt(txtPorcentajeEnvio.getText()));

            
            Peticion peticion = new Peticion(TipoAccion.SETTINGS, numbers);
            Client conexion = new Client(peticion);
            Object respuesta = conexion.getRespuestaServer();
            if(respuesta != null){
                if((boolean)respuesta)
                    JOptionPane.showMessageDialog(null, "Se ha aplicados los cambios correctamente!", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "No ha funcionado!", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay datos Incorrectos!", "Error", JOptionPane.ERROR_MESSAGE);
        } 

    }//GEN-LAST:event_btnAplicarMouseClicked

    private void imgArrowLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgArrowLeftMouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(contentPanel, backPanel);
    }//GEN-LAST:event_imgArrowLeftMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAplicar;
    private javax.swing.JLabel imgArrowLeft;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbSismos13;
    private javax.swing.JLabel lbSismos14;
    private javax.swing.JTextArea txtDesgloce;
    private javax.swing.JTextField txtPorcentajeEmpaque;
    private javax.swing.JTextField txtPorcentajeEnvio;
    // End of variables declaration//GEN-END:variables
}