/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4B.lab4B3;

import lab4B.lab4B2.calculateDistance;

/**
 *
 * @author Natali
 */
public class lab4B3 {
      public static void main(String[] args) {
        int gramm = 5612317;
        
        double kilogramm = calculateWeight.calculateKilogramm(gramm);
        double centner = calculateWeight.calculateCetner(gramm);
        
        System.out.println(gramm + " gramm "+ "is " + kilogramm + " kilogramm " + " or " + centner + " centner");
    }
}
