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
public class Manager extends Employee{
    
    public Manager(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
    }
    
    @Override
    public float CalculateSalary()

    {             

                return salary + (bonusPercentage * 0.7F); 
    }
    
    @Override
    public float CalculateYearBonus(){
        return salary + salary * 1.0F; 
    }
}
