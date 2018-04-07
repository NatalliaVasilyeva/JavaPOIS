/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_5;
 

import java.util.Random;

/**
 *
 * @author Natali
 */
public class  CakeWithSurprise {

    public static final int SUPRISE_QUANTITY = 5;
    public static final String PEACH = "\uD83C\uDF51";
    public static final String WATERMELON = "\uD83C\uDF49";
    public static final String CHERRY = "\uD83C\uDF52";
    public static final String APPLE = "\uD83C\uDF4F";
    public static final String STRAWBERRY = "\uD83C\uDF53";
    public static String SURPRISE = STRAWBERRY;
    
    public static final int CAKE_QUANTITY = 3;
    public static final String BIRTHDAY_CAKE = "\uD83C\uDF82";
    public static final String SHORTCAKE = "\uD83C\uDF70"; 
    public static final String DOUGHNUT = "\uD83C\uDF69"; 
    public static String CAKE = DOUGHNUT;
    
    public static String chooseSurprise() {
            
        switch (new Random().nextInt(SUPRISE_QUANTITY)+1) {
            case 1: SURPRISE=PEACH; break;
            case 2: SURPRISE=WATERMELON; break;
            case 3: SURPRISE=CHERRY; break;
            case 4: SURPRISE=APPLE; break;
        }
        return SURPRISE;
}
           
    public static String chooseCake() {     
          switch (new Random().nextInt(CAKE_QUANTITY)+1) {
            case 1: CAKE=BIRTHDAY_CAKE; break;
            case 2: CAKE=SHORTCAKE; break;
        }
        return CAKE;
               
           }
}
