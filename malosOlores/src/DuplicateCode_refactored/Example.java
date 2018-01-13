/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode_refactored;


import java.util.List;



/**
 *
 * @author Andres G
 */

//se ha disminuido mas la clase pero todavia quedan mas malos olores
//se continua el ejercicio en LongMethod
public class Example {
    
    public List<Cliente> clientes;
    
    public void MostrarInformacion(Cliente cliente){
        validarInformacion(cliente.Nombre, cliente.Apellido, cliente.Cedula);
        System.out.println("Nombre: " + cliente.Nombre + ", Apellido: " + cliente.Apellido + ", con numero de cedula: " + cliente.Cedula );
        
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        validarInformacion(Nombre, Apellido, Cedula);
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");
        
    }
    
    
    //Todavia existe un mal olor: longMethod
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        if(Nombre.equals("") && Nombre.length()> 16){
            System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");
            
        }
        if(Apellido.equals("") && Apellido.length()> 16){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");
            
        }
        if(!Cedula.equals("") && Cedula.length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");
            
        }
        
    }
    
    
}
