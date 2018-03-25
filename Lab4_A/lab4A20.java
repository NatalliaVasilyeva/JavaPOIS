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
public class lab4A20 {

    public static void main(String[] args) {

        double a = 3.;
        double b = 4.;
        double c = 1.;
        double d = 2.;
        double e = 5.;
        double f = 5.;

        boolean result = Logik.checkPointInArea(a, b, c, d, e, f);

        System.out.println("a= " + a + "; b= " + b + "; c= " + c + "; d= " + d + "; e= " + e + "; f= " + f);
        System.out.println("result: " + result);
    }
}
