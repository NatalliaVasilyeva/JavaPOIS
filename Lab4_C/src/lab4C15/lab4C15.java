/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C15;

import lab4C.lab4C14.convertDegree;

/**
 *
 * @author Natali
 */
public class lab4C15 {
    public static void main(String[] args) {
    double a = 158.1;
    double b = 259.9;
    
    double dollar = convertCurrency.convertEuroToDollar(a);
    double euro = convertCurrency.convertDollarToEuro(b);
    
    System.out.println("The " + a + " euro is " + dollar + " dollars");
    System.out.println("The " + b + " dollars is " + euro + " euros");
        
    }
}