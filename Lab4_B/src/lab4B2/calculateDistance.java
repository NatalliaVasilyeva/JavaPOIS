/*
 Programm calculate distance between city in kilometers, meters and e.c. Source  info - distance in santimeters
 */

package lab4B.lab4B2;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 01.03.18
 */

public class calculateDistance {
    public static double calculateMeters(int a) {
        double meters = a/100;
        return meters;
    }
    
    public static double calculateKilometers( int a) {
        double kilometers = a/100/1000;
        return kilometers;
    }
    
}
