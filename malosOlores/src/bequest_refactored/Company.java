/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bequest_refactored;



/**
 *
 * @author Andres G
 */
public class Company {
    Government gov;
    private double computeInitialTax() {
        return 1000;
    }

    
    public double getTax() {
        double tax = computeInitialTax();
        return gov.addPersonalTax(tax);
    }
}
