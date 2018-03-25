/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C7;

/**
 *
 * @author Natali
 */
public class lab4C7 {

    public static void main(String[] args) {

        double a = 1.5;
        double b = 8.7;

        double hyp = calculateHypotenuse.findHypotenuse(a, b);
        double per = calculateHypotenuse.findPerimetr(a, b);

        System.out.println("The hypotenuse is " + hyp);
        System.out.println("The perimetr of triangle is " + per);

    }
}
