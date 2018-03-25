/*
A program that finds the arithmetic and geometric mean of a four-digit number
 */
package lab4B.lab4B6;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 01.03.18
 */
public class calculateSrednee {

    public static int getSredneeArifm(int a) {
        int b = a % 10;
        int c = (a / 10) % 10;
        int d = ((a / 10) / 10) % 10;
        int e = a / 1000;

        return (b + c + d + e) / 4;

    }

    public static double getSredneeGoometr(int a) {
        int b = a % 10;
        int c = (a / 10) % 10;
        int d = ((a / 10) / 10) % 10;
        int e = a / 1000;

        return Math.pow(b * c * d * e, 4);

    }

}
