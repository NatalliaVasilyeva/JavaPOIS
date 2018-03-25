/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C11;

/**
 *
 * @author Natali
 */
public class lab4C11 {

    public static void main(String[] args) {

        double x1 = 1.1;
        double x2 = 5.8;
        double x3 = 2.8;
        double y1 = 2.8;
        double y2 = 6.7;
        double y3 = 3.8;

        double p = calculateSquareOrPerimetrTriangle.findPerimetr(x1, x2, x3, y1, y2, y3);
        double s = calculateSquareOrPerimetrTriangle.findSquare(x1, x2, x3, y1, y2, y3);

        System.out.println("The perimetr of triangle is " + p);
        System.out.println("The square of triangle is " + s);
    }
}
