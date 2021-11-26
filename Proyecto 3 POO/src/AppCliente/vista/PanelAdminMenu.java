/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista;

import javax.swing.JPanel;

/**
 *
 * @author erksm
 */
public class PanelAdminMenu extends javax.swing.JPanel {

    /**
     * Creates new form AdminPanelMenu
     */
    private JPanel usefulPanel;
    private JPanel contentPanel;
    private JPanel back;
    private PanelCatalogo panelCatalogo;
    public PanelAdminMenu(JPanel panel, JPanel content, JPanel backPanel) {
        initComponents();
        usefulPanel = panel;
        contentPanel = content; 
        back = backPanel;
        panelCatalogo = new PanelCatalogo(panel, content, (JPanel)this);
        
        imgCatalogo.setIcon(Utilities.loadResizeIcon("src\\img\\catalogo.png", 150));
        imgPedidos.setIcon(Utilities.loadResizeIcon("src\\img\\pedidos.png", 150));        
        imgEstadisticas.setIcon(Utilities.loadResizeIcon("src\\img\\stadistics.png", 150));  
        
        imgArrowLeft.setIcon(Utilities.loadResizeIcon("src\\img\\arrow-left.png", 50));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgArrowLeft = new javax.swing.JLabel();
        lbSismos14 = new javax.swing.JLabel();
        btnCatalogo = new javax.swing.JPanel();
        imgCatalogo = new javax.swing.JLabel();
        lbSismos13 = new javax.swing.JLabel();
        btnPedidos = new javax.swing.JPanel();
        imgPedidos = new javax.swing.JLabel();
        lbSismos15 = new javax.swing.JLabel();
        btnEstadisticas = new javax.swing.JPanel();
        imgEstadisticas = new javax.swing.JLabel();
        lbSismos16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lbSismos14.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos14.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        lbSismos14.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos14.setText("Choose an option");
        lbSismos14.setToolTipText("");
        add(lbSismos14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 280, 40));

        btnCatalogo.setBackground(new java.awt.Color(212, 212, 212));
        btnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogoMouseClicked(evt);
            }
        });
        btnCatalogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        imgCatalogo.setToolTipText("");
        imgCatalogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imgCatalogo.setIconTextGap(2);
        imgCatalogo.setPreferredSize(new java.awt.Dimension(500, 500));
        btnCatalogo.add(imgCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        lbSismos13.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos13.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbSismos13.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos13.setText("Catálogo");
        lbSismos13.setToolTipText("");
        btnCatalogo.add(lbSismos13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 120, 40));

        add(btnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 250, 250));

        btnPedidos.setBackground(new java.awt.Color(212, 212, 212));
        btnPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        imgPedidos.setToolTipText("");
        imgPedidos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imgPedidos.setIconTextGap(2);
        imgPedidos.setPreferredSize(new java.awt.Dimension(500, 500));
        btnPedidos.add(imgPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        lbSismos15.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos15.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbSismos15.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos15.setText("Pedidos");
        lbSismos15.setToolTipText("");
        btnPedidos.add(lbSismos15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, 40));

        add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 250, 250));

        btnEstadisticas.setBackground(new java.awt.Color(212, 212, 212));
        btnEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseClicked(evt);
            }
        });
        btnEstadisticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        imgEstadisticas.setToolTipText("");
        imgEstadisticas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imgEstadisticas.setIconTextGap(2);
        imgEstadisticas.setPreferredSize(new java.awt.Dimension(500, 500));
        btnEstadisticas.add(imgEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        lbSismos16.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos16.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbSismos16.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos16.setText("Estadisticas");
        lbSismos16.setToolTipText("");
        btnEstadisticas.add(lbSismos16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 40));

        add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 250, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void imgArrowLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgArrowLeftMouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(contentPanel, back);
    }//GEN-LAST:event_imgArrowLeftMouseClicked

    private void btnCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoMouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(contentPanel, panelCatalogo);
    }//GEN-LAST:event_btnCatalogoMouseClicked

    private void btnEstadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCatalogo;
    private javax.swing.JPanel btnEstadisticas;
    private javax.swing.JPanel btnPedidos;
    private javax.swing.JLabel imgArrowLeft;
    private javax.swing.JLabel imgCatalogo;
    private javax.swing.JLabel imgEstadisticas;
    private javax.swing.JLabel imgPedidos;
    private javax.swing.JLabel lbSismos13;
    private javax.swing.JLabel lbSismos14;
    private javax.swing.JLabel lbSismos15;
    private javax.swing.JLabel lbSismos16;
    // End of variables declaration//GEN-END:variables
}
