/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C19;

import lab4C.lab4C18.calculateDistanceBetweenAuto;

/**
 *
 * @author Natali
 */
public class lab4C19 {
     public static void main(String[] args) {
        
        double speed1 = 45.8;
          double speed2 = 60.3;
          double sourceDistance = 1588.6;
          double time = 2.5;
          
          double newDistance = calculateDistanceBetweenAuto2.findDistance2(speed1, speed2, sourceDistance, time);
          
          System.out.println(" New distance after "+ time + " hour " + "= " + newDistance + " km");
    }
}
