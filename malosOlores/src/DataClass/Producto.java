/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass;

/**
 *
 * @author Andres G
 */


//este seria el data class que solo contiene informacion y no posee funcionalidad
public class Producto {
    private String COD_Producto;
    private String Categoria;
    private String descripcionP;
    private String Nombre;
    private int cantidad;
    private float precio;

    public Producto(String COD_Producto, String Categoria, String descripcionP, String Nombre, int cantidad, float precio) {
        this.COD_Producto = COD_Producto;
        this.Categoria = Categoria;
        this.descripcionP = descripcionP;
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    

    public String getCOD_Producto() {
        return COD_Producto;
    }

    public void setCOD_Producto(String COD_Producto) {
        this.COD_Producto = COD_Producto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
