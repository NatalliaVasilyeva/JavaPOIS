/*
* Develop a program to find the area and perimeter of a rectangle, which is given on the coordinate plane by two opposite vertices (x1,y1) and (x2,y2). 
* The sides of the rectangle are parallel to the coordinate axes
 */
package lab4C.lab4C10;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 08.03.18
 */
public class calculateParametrsOfRectangle {

    public static double calculateSquare(double x1, double x2, double y1, double y2) {

        double l = x2 - x1;
        double w = y2 - y1;
        return l * w;

    }

    public static double calculatePerimetr(double x1, double x2, double y1, double y2) {

        double l = x2 - x1;
        double w = y2 - y1;
        return l * 2 + w * 2;

    }
}
