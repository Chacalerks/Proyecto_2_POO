/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista;

import static AppCliente.vista.MainWindow.last;
import AppServidora.modelo.TPlatillo;
import AppServidora.modelo.TVisibilidad;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author erksm
 */
public abstract class Utilities {
    
    public static Color overedColor = new Color(136, 123, 114);
    public static Color normalColor = new Color(86,73,64);
    public static Color grayColor = new Color(212, 212, 212);
    public static Color blanco = new Color(255,255,255);
    
    public static ImageIcon loadResizeIcon(String name, int newHeigth){
        ImageIcon icon = new ImageIcon(name);
        Image image  = icon.getImage();
        
        int height = icon.getIconHeight(),  width = icon.getIconWidth();
        int newHeight = (newHeigth*height)/width;
        
        Image modifiedImage = image.getScaledInstance(newHeigth, newHeight, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiedImage);
        return icon;
    }
    
    public static void cargarPanel(JPanel contentPanel, JPanel panel) {  
        contentPanel.removeAll();
        contentPanel.add(panel);
        contentPanel.repaint();
        contentPanel.revalidate();
    }
    
    public static String convertNameToT(TPlatillo tipo){
        
        if (tipo == null){
            return "";
        }
        return switch (tipo) {
            case ENTRADA -> "ENT";
            case FUERTE -> "PRN";
            case BEBIDA -> "BEB";
            case POSTRE -> "PTR";
            default -> "";
        };
    }
    
    public static String convertNameToTPlatillo(String tipo){        
        return switch (tipo.charAt(0)) {
            case 'E' -> "ENT";
            case 'F' -> "PRN";
            case 'B' -> "BEB";
            case 'P' -> "PTR";
            default -> "";
        };
    }
    
    public static TVisibilidad convertNameToVisible(String visible){        
        return switch (visible.charAt(0)) {
            case 'V' -> TVisibilidad.VISIBLE;
            case 'N' -> TVisibilidad.NO_VISIBLE;
            case 'A' -> null;
            default -> null;
        };
    }

    
}
