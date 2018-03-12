/*
* Develop a program for finding the distance between two points with coordinates (x1, y1) and (x2, y2) in the plane
 */
package lab4C.lab4C9;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */

public class distanceBetweenTwoPoints {
    
    public static double calcalateDistance(double x1, double x2, double y1, double y2 ) {
    
        double dis =Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return dis;
}
}
