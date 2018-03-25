/*
*A program for finding the arithmetic mean and geometric mean of two nonnegative numbers 'a' and 'b';
 */
package lab4C.lab4C5;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 08.03.18
 */
public class findArithmAndGeometrMean {

    public static double ArithmeticalMean(double a, double b) {
        return (a + b) / 2;
    }

    public static double GeometricMean(double a, double b) {
        return Math.sqrt(a * b);
    }
}
