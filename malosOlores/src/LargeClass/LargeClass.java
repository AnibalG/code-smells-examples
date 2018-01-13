package LargeClass;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres G
 */
public class LargeClass {
    public List<String> nombres;
    public List<String> Apellidos;
    public List<String> cedulas;
    
    public void MostrarInformacion(String Nombre, String Apellido, String Cedula){
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
        System.out.println("Nombre: " + Nombre + ", Apellido: " + Apellido + ", con numero de cedula: " + Cedula );
        
    }
    
    public void Guardarcliente(String Nombre, String Apellido, String Cedula){
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
        
        this.nombres.add(Nombre);
        this.Apellidos.add(Apellido);
        this.cedulas.add(Cedula);
        System.out.println( Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");
        
    }
}
