/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C14;

/**
 *
 * @author Natali
 */
public class lab4C14 {
    public static void main(String[] args) {
        
    
    
    double a = 158;
    double b = 25;
    
    double cel = convertDegree.convertDegreeFromFarentheitToCelsium(a);
    double far = convertDegree.convertDegreeFromCelsiumToFarentheit(b);
    
    System.out.println("The " + a + " degree in farentheit is " + cel + " in celsium");
    System.out.println("The " + b + " degree in celsium is " + far + " in farentheit");
}
}
