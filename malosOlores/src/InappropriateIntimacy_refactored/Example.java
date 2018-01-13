/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropriateIntimacy_refactored;


import java.util.List;



/**
 *
 * @author Andres G
 */


public class Example {
    
    public List<Cliente> clientes;
    
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        Cliente.validarInformacion(Nombre, Apellido, Cedula);
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");
        
    }
    
    
    
    
    
}
