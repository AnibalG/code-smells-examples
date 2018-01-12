/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod;

/**
 *
 * @author Andres G
 */
public class LongMethodExample {
    
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
