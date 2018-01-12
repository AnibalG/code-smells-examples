/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatement_refactored;

/**
 *
 * @author Andres G
 */
public class Employee

{    

    public float salary;    

    public float bonusPercentage;    

      

    public Employee(float salary, float bonusPercentage)    

    {        

        this.salary = salary;        

        this.bonusPercentage = bonusPercentage;        

           

    }    

    public float CalculateSalary(){
        return salary;
    };  

    
    public float CalculateYearBonus(){
        return 0;
    }





}


