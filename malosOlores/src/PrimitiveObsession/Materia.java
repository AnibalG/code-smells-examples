/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession;

/**
 *
 * @author Andres G
 */
public class Materia {
    Integer[] alumnosPorCurso = {20, //paralelo1
                                18,//parelelo2
                                15, //parelelo3
                                23 //paralelo4
                                };
    public int totalAlumnos(){
        int total =0;
        for (Integer alumnos: this.alumnosPorCurso)
           {
              total += alumnos;
           }
        return total;
    }
    
}

    
