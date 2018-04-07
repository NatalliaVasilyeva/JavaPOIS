/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_3;

import java.util.Random;

/**
 *
 * @author Natali
 */
public class diceLogic {
    
    public static final int SIDE_NUMBERS=6;

    public static String Counting() {
        Random rn1 = new Random();
        int sum = 0;
      
        int dice1 = rn1.nextInt(SIDE_NUMBERS) + 1;
        int dice2 = rn1.nextInt(SIDE_NUMBERS) + 1;
        sum=dice1+dice2;
        
                
         return  "The first bonds has " + dice1 + " points, the second bonds has " + dice2 + " points, " + " the sum of 2 bonds is " + sum + " points ";

    }
}
