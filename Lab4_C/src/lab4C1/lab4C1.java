/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C1;

/**
 *
 * @author Natali
 */
public class lab4C1 {

    public static void main(String[] args) {
        double side = 15.4;

        double perimetr = SquareCalculator.CalculatePerimetr(side);
        double square = SquareCalculator.CalculateSquare(side);

        System.out.println("The side of kvadrat is " + side);
        System.out.println("The perimetr of kvadrat is " + perimetr);
        System.out.println("The square of kvadrat is " + square);
    }
}
