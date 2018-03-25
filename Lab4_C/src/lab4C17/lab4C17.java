/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C17;

/**
 *
 * @author Natali
 */
public class lab4C17 {

    public static void main(String[] args) {

        double timeWithTheFlow = 2.1;
        double timeAgainstTheFlow = 3.8;
        double speedBoat = 5.8;
        double speedRiver = 1.2;

        double distance = calculateDistance.findDistances(timeWithTheFlow, timeAgainstTheFlow, speedBoat, speedRiver);

        System.out.println("The distance is " + distance);
    }
}
