/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession_refactored;

/**
 *
 * @author Andres G
 */
public class Materia {
    Curso[] cursos;
    public int totalAlumnos(){
        int total =0;
        for (Curso curso: this.cursos)
           {
              total+= curso.cantidadAlumnos;
           }
        return total;
    }
    
}

    
