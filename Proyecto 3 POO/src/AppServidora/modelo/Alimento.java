/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.modelo;

import java.io.Serializable;

/**
 *
 * @author muril
 */
public class Alimento implements Serializable {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private TVisibilidad visibilidad;   
    private String img;
    private int sizePorcion;
    private int piezasPorcion;
    private int caloriasPorcion;
    private int caloriasPieza;
    private double precio;

    public Alimento(String codigo, String nombre, String descripcion, int tamañoPorcion,
            int piezasPorcion, int caloriasPorcion, int caloriasPieza, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sizePorcion = tamañoPorcion;
        this.piezasPorcion = piezasPorcion;
        this.caloriasPorcion = caloriasPorcion;
        this.caloriasPieza = caloriasPieza;
        this.precio = precio;
        visibilidad = TVisibilidad.VISIBLE;
        img = "src\\img\\catalago\\empty.png";
    }
    
    public Alimento(String codigo, String nombre, String descripcion, int tamañoPorcion,
        int piezasPorcion, int caloriasPorcion, int caloriasPieza, double precio, String img) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sizePorcion = tamañoPorcion;
        this.piezasPorcion = piezasPorcion;
        this.caloriasPorcion = caloriasPorcion;
        this.caloriasPieza = caloriasPieza;
        this.precio = precio;
        visibilidad = TVisibilidad.VISIBLE;
        this.img = img;
    }
    
    public String getTipo(){
        String codigoTipo= "";
        for(int i = 0; i<3; i++){
            codigoTipo += codigo.charAt(i);
        }
        return codigoTipo;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getSizePorcion() {
        return sizePorcion;
    }

    public int getPiezasPorcion() {
        return piezasPorcion;
    }

    public int getCaloriasPorcion() {        
        return caloriasPorcion;
    }

    public int getCaloriasPieza() {
        if(caloriasPieza == 0){
            return caloriasPorcion/2;
        }
        return caloriasPieza;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSizePorcion(int tamañoPorcion) {
        this.sizePorcion = tamañoPorcion;
    }

    public void setPiezasPorcion(int piezasPorcion) {
        this.piezasPorcion = piezasPorcion;
    }

    public void setCaloriasPorcion(int caloriasPorcion) {
        this.caloriasPorcion = caloriasPorcion;
    }

    public void setCaloriasPieza(int caloriasPieza) {
        this.caloriasPieza = caloriasPieza;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TVisibilidad getVisibilidad() {
        return visibilidad;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setVisibilidad(TVisibilidad visibilidad) {
        this.visibilidad = visibilidad;
    }

    @Override
    public String toString() {
        return "Alimento: " + "código: " + codigo + ", nombre: " + nombre + ", descripcion: " + descripcion + 
                ", tamaño de porcion: " + sizePorcion + ", piezas por porcion: " + piezasPorcion +
                ", calorias por porcion: " + caloriasPorcion + ", calorias por pieza:" + caloriasPieza + ", precio: " + precio + "/n";
    }
    
}
