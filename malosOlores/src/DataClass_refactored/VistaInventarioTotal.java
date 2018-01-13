/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass_refactored;


import java.util.List;

/**
 *
 * @author Andres G
 */
public class VistaInventarioTotal {
    List<Producto> productos;
    
    public String verInventarioCompleto(){
        String reporte = "";
        for (Producto producto: productos){
            reporte += getResumenProducto(producto);
        }
        return reporte;
    }
    
    public String getResumenProducto(Producto producto){
        return producto.getResumenProducto();
        
    }
    
}
