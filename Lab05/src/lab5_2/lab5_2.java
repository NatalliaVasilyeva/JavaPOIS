/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_2;


/**
 *
 * @author Natali
 */
public class lab5_2 {
     public static void main(String[] args) {
        
       View.print("The programm view your mood");
       
     
        
      char b = MoodSensor.getSmile();
        
       View.print("Your mood is  " + b);
    }
}
