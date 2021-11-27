/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista;

import AppServidora.modelo.Carrito;
import javax.swing.JPanel;

/**
 *
 * @author erksm
 */
public class PanelPedidoMenu extends javax.swing.JPanel {

    /**
     * Creates new form PanelPedidoMenu
     */
    private JPanel usefulPanel;
    private JPanel contentPanel;
    private JPanel backPanel;
    private PanelPedidoMesa pedidoMesa;    
    
    public PanelPedidoMenu(JPanel useful,JPanel content, JPanel back, Carrito carrito) {
        initComponents();
        usefulPanel = useful;
        contentPanel = content; 
        backPanel = back;
        //panelCatalogo = new PanelCatalogo(useful, content, (JPanel)this);
        
        pedidoMesa = new PanelPedidoMesa(carrito);
        imgExpress.setIcon(Utilities.loadResizeIcon("src\\img\\express.png", 150));        
        imgREcoger.setIcon(Utilities.loadResizeIcon("src\\img\\recoger.png", 150));  
        imgMesa.setIcon(Utilities.loadResizeIcon("src\\img\\mesa.png", 150));  
        
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

        btnSitio = new javax.swing.JPanel();
        imgMesa = new javax.swing.JLabel();
        lbSismos17 = new javax.swing.JLabel();
        btnRecoger = new javax.swing.JPanel();
        imgREcoger = new javax.swing.JLabel();
        lbSismos16 = new javax.swing.JLabel();
        btnExpress = new javax.swing.JPanel();
        imgExpress = new javax.swing.JLabel();
        lbSismos15 = new javax.swing.JLabel();
        imgArrowLeft = new javax.swing.JLabel();
        lbSismos14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSitio.setBackground(new java.awt.Color(212, 212, 212));
        btnSitio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSitioMouseClicked(evt);
            }
        });
        btnSitio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        imgMesa.setToolTipText("");
        imgMesa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imgMesa.setIconTextGap(2);
        imgMesa.setPreferredSize(new java.awt.Dimension(500, 500));
        btnSitio.add(imgMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        lbSismos17.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos17.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbSismos17.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos17.setText("En Sitio");
        lbSismos17.setToolTipText("");
        btnSitio.add(lbSismos17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, 40));

        add(btnSitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 250, 250));

        btnRecoger.setBackground(new java.awt.Color(212, 212, 212));
        btnRecoger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecogerMouseClicked(evt);
            }
        });
        btnRecoger.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgREcoger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgREcoger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        imgREcoger.setToolTipText("");
        imgREcoger.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imgREcoger.setIconTextGap(2);
        imgREcoger.setPreferredSize(new java.awt.Dimension(500, 500));
        btnRecoger.add(imgREcoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        lbSismos16.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos16.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbSismos16.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos16.setText("Recoger");
        lbSismos16.setToolTipText("");
        btnRecoger.add(lbSismos16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, 40));

        add(btnRecoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 250, 250));

        btnExpress.setBackground(new java.awt.Color(212, 212, 212));
        btnExpress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgExpress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgExpress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        imgExpress.setToolTipText("");
        imgExpress.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imgExpress.setIconTextGap(2);
        imgExpress.setPreferredSize(new java.awt.Dimension(500, 500));
        btnExpress.add(imgExpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 150));

        lbSismos15.setBackground(new java.awt.Color(0, 0, 0));
        lbSismos15.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbSismos15.setForeground(new java.awt.Color(0, 0, 0));
        lbSismos15.setText("Express");
        lbSismos15.setToolTipText("");
        btnExpress.add(lbSismos15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, 40));

        add(btnExpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 250, 250));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnSitioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSitioMouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(contentPanel, pedidoMesa);
        pedidoMesa.loadDatos();
    }//GEN-LAST:event_btnSitioMouseClicked

    private void btnRecogerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecogerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecogerMouseClicked

    private void imgArrowLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgArrowLeftMouseClicked
        // TODO add your handling code here:
        Utilities.cargarPanel(contentPanel, backPanel);
        
    }//GEN-LAST:event_imgArrowLeftMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExpress;
    private javax.swing.JPanel btnRecoger;
    private javax.swing.JPanel btnSitio;
    private javax.swing.JLabel imgArrowLeft;
    private javax.swing.JLabel imgExpress;
    private javax.swing.JLabel imgMesa;
    private javax.swing.JLabel imgREcoger;
    private javax.swing.JLabel lbSismos14;
    private javax.swing.JLabel lbSismos15;
    private javax.swing.JLabel lbSismos16;
    private javax.swing.JLabel lbSismos17;
    // End of variables declaration//GEN-END:variables
}
