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
public class lab4A15 {

    public static void main(String[] args) {

        double a = 2.3;
        double b = 3.2;
        double c = 5.0;

        boolean result = Logik.checkIsSideOfTriangle(a, b, c);

        System.out.println("a= " + a + "; b= " + b + "; c= " + c);
        System.out.println("result: " + result);
    }
}
