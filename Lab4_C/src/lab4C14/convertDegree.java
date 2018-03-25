/*
 * Develop a program for transferring temperatures from degrees Celsius to degrees Fahrenheit and vice versa;
 */
package lab4C.lab4C14;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */

public class convertDegree {
    public static double convertDegreeFromCelsiumToFarentheit(double a) {
        
        return a*9/5+32;
  
    }
    
  public static double convertDegreeFromFarentheitToCelsium(double a) {
        
     return (a-32)*5/9;
     
    }  
    
}
