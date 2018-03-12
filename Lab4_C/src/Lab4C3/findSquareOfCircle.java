/*
*A program for finding the area and the length of a circle with a radius R;
 */
package lab4C.Lab4C3;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */
public class findSquareOfCircle {
    
   final static double PI = 3.1415926536;
    
    public static double calculateSquare( double a) {
        double s = 2*PI*a*a;
        return s;
    }
    
      public static double calculateLenght( double a) {
        double l = 2*PI*a;
        return l;
    }
}
