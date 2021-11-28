/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista;

import static AppCliente.vista.MainWindow.last;
import AppServidora.modelo.PExpress;
import AppServidora.modelo.PMesa;
import AppServidora.modelo.PRecoger;
import AppServidora.modelo.Pedido;
import AppServidora.modelo.Producto;
import AppServidora.modelo.TPlatillo;
import AppServidora.modelo.TVisibilidad;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
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
    
    public static String convertTipoPlatilloToName(String tipo){
        String tipoPlato = "";
        if (tipo == null){
            return "";
        }
        for(int i = 0; i<3; i++)
            tipoPlato += tipo.charAt(i);
        
        if(tipoPlato.equals("ENT"))
            return "Entrada";
        else if(tipoPlato.equals("PRN"))
            return "Fuerte";
        else if(tipoPlato.equals("BEB"))
            return "Bebida";
        else if(tipoPlato.equals("PTR"))
            return "Postre";
        return "";
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
    
    public static String convertVisibleToString(TVisibilidad visible){        
        return switch (visible) {
            case VISIBLE -> "Visible";
            case NO_VISIBLE -> "No visible";
            default -> "Ambos";
        };
    }
    
    public static int convertVisibleToInt(TVisibilidad visible){        
        return switch (visible) {
            case VISIBLE -> 0;
            case NO_VISIBLE -> 1;
            default -> -1;
        };
    }
    
    public static void sortProductos(Producto arr[]){
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            Producto key = arr[i];
            int j = i - 1;
            
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j].getCantidadSeleccionada() < key.getCantidadSeleccionada()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static String getTipoPedidoToString(Pedido p){
        if(p instanceof PMesa)
            return "En Sitio";
        else if(p instanceof PExpress)
            return "Express";
        else if(p instanceof PRecoger)
            return "Recoger";
        
        return "";
    }

    
}
