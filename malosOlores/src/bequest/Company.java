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
public class Company extends Government {
    private double computeInitialTax() {
        return 1000;
    }

    @Override 
    public double getTax() {
        double tax = computeInitialTax();
        return addPersonalTax(tax);
    }
}
