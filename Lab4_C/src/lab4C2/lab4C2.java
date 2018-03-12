/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C2;

/**
 *
 * @author Natali
 */
public class lab4C2 {
    public static void main(String[] args) {
        double a = 15.2;
        double b = 10.5;
        
        double perimetr = calculatorPrjamoygolnic.calculatePerimetrPrjam(a, b);
        double square = calculatorPrjamoygolnic.calculateSquarePrjam(a,b);
        
        System.out.println("The side of prjamougolnic is "+ a+ ", "+ b);
        System.out.println("The perimetr of prjamougolnic is "+ perimetr);
        System.out.println("The square of prjamougolnic is "+ square);
}
}
