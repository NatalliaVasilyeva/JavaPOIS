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
public class lab4A3 {

    public static void main(String[] args) {

        double a = 5.8;
        double b = 5.1;
        double c = -16.2;

        boolean result = Logik.checkPositiveNumber(a, b, c);

        System.out.println("a= " + a + "; b= " + b + "; c= " + c);
        System.out.println("result: " + result);

    }
}
