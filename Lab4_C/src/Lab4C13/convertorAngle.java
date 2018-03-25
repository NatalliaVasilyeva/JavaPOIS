/*
 * Develop a program-converter of angular values from degrees to radians and vice versa;
 */
package lab4C.Lab4C13;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 08.03.18
 */
public class convertorAngle {

    final static double PI = 3.141596;

    public static double convertAngleFromRadianToDegree(double a) {
        return (a * 180) / PI;

    }

    public static double convertAngleFromDegreeToRadian(double a) {
        return (a * PI) / 180;

    }
}
