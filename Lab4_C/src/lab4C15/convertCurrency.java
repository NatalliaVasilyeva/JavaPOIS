/*
 * Develop a program for currency conversion
 */
package lab4C.lab4C15;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */

public class convertCurrency {
    
     public static double convertEuroToDollar (double a) {
        
        double b = a*1.25;
        return b;
    }
    
  public static double convertDollarToEuro(double a) {
        
        double b = a/1.25;
        return b;
    }  
}
