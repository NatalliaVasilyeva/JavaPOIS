/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.Lab4C13;

/**
 *
 * @author Natali
 */
public class lab4C13 {

    public static void main(String[] args) {

        double a = 5.1;
        double b = 350.2;

        double rad = convertorAngle.convertAngleFromDegreeToRadian(b);
        double deg = convertorAngle.convertAngleFromRadianToDegree(a);

        System.out.println(" Radian" + a + " in degree is " + deg);
        System.out.println(" Degree" + b + " in radian is " + rad);
    }
}
