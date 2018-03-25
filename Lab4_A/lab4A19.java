/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Natali
 */
public class lab4A19 {

    public static void main(String[] args) {

        double a = 3.;
        double b = 4.;
        double c = 5.;

        boolean result = Logik.checkTriangleIs90DegAndTwoSameSide(a, b, c);

        System.out.println("a= " + a + "; b= " + b + "; c= " + c);
        System.out.println("result: " + result);
    }
}
