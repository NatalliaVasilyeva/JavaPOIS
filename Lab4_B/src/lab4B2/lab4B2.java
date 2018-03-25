/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4B.lab4B2;

/**
 *
 * @author Natali
 */
public class lab4B2 {

    public static void main(String[] args) {
        int distanceInSantimeters = 15525630;

        double meters = calculateDistance.calculateMeters(distanceInSantimeters);
        double kilometers = calculateDistance.calculateKilometers(distanceInSantimeters);

        System.out.println(distanceInSantimeters + " santimeters " + "is " + meters + " meters " + " or " + kilometers + " kilometers");
    }
}
