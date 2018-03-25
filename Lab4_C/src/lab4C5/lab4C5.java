/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C5;

/**
 *
 * @author Natali
 */
public class lab4C5 {

    public static void main(String[] args) {

        double a = 5.4;
        double b = 7.8;

        double ar = findArithmAndGeometrMean.ArithmeticalMean(a, b);
        double geom = findArithmAndGeometrMean.GeometricMean(a, b);

        System.out.println("The arithmetical mean is " + ar);
        System.out.println("The geometric mean is " + geom);
    }
}
