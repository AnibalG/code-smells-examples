/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bequest;

/**
 *
 * @author Andres G
 */
public class Government {
    protected double computeBaseTax() {
        return 1000;
    }

    protected double addPersonalTax(double tax) { 
     return 200;   
    }

    public double getTax() {
        double tax = computeBaseTax();
        return addPersonalTax(tax);
    }
}
