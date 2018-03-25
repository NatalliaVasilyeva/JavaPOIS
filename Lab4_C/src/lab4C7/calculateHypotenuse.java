/*
* The program for finding the hypotenuse of a right-angled triangle defined by the sides 'a' and 'b',
* and the perimeter of this triangle;
 */
package lab4C.lab4C7;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */
public class calculateHypotenuse {
    
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a*a+b*b);
          }
    
    public static double findPerimetr(double a, double b) {
        return a+b+ findHypotenuse(a,b);
          }
}
