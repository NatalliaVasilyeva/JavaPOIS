/*
* There are 2 circles with a common center and radius R1 and R2 (R1>R2). 
* Develop a program for finding the area of a ring whose outer radius R1, and the inner radius R2
 */
package lab4C.lab4C8;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */

public class calculateRingBetweenTwoCircle {
    
    final static double PI  = 3.141593;
    
    public static double findSquare(double a, double b) {
        double s1 = PI*a*a;
        double s2 = PI*b*b;
        
        double newS = s1-s2;
        return newS;
        
    }
}
