/*
*Program for finding the maximum and minimum value of two numbers 'a' and 'b';
 */
package lab4C.lab4C6;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 08.03.18
 */
public class maxOrMinOf2Numbers {

    public static double findMax(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static double findMin(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

}
