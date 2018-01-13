/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod_refactored;



import java.util.List;



/**
 *
 * @author Andres G
 */


public class Example {
    //Todavia existe un mal olor: InapropiateIntimacy
    //hay un metodo que utiliza variables de cliente que seria mejor que estuviera en esa clase
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
    
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        validarNombre(Nombre);
        validarApellido(Apellido);
        validarCedula(Cedula);
    }
    public void validarNombre(String Nombre){
        if(Nombre.equals("") && Nombre.length()> 16){
            System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");
            
        }
    }
    public void validarApellido(String Apellido){
        if(Apellido.equals("") && Apellido.length()> 16){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");
            
        }
    }
    public void validarCedula(String Cedula){
        if(!Cedula.equals("") && Cedula.length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");
            
        }
    }
    
    
}
