/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.lab5_2;

import lab5.lab5_1.HeadOfDragon;
import lab5.lab5_1.UserInput;

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
