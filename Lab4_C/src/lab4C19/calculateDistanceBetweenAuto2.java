/*
 * Develop a program to calculate the distance between 2 cars after T hours 
 * if they move away from each other at speeds of V1 km/h and V2 km/h, and the initial distance between them was S km
 */
package lab4C.lab4C19;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 08.03.18
 */
public class calculateDistanceBetweenAuto2 {

    public static double findDistance2(double v1, double v2, double s, double t) {
        return s + ((v1 + v2) * t);

    }
}
