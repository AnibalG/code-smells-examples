/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps;

/**
 *
 * @author Andres G
 */
public class persona {
    private String ID_Cliente;
    private String nomCliente;
    private String provincia;
    private String pais;
    private String ciudad;
    private String direccion;
    private String telefono;
    
    
    public String mostrarLocation(){
        return pais + ciudad + provincia + direccion;
    }
    
    public void cambiarLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        pais = nuevoPais;
        ciudad = ciudadnueva;
        provincia = provinciaNueva;
        direccion = direccionNueva;
    }
}
