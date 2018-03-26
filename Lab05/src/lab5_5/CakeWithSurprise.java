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

           public static String getSurprise() {
     
         Random rand = new Random();

        int x = rand.nextInt(5) + 1;
        String answer;
        switch (x) {
            case 1:
                answer ="\uD83C\uDF51"; 
            case 2:
                answer = "\uD83C\uDF49";
            case 3:
                answer = "\uD83C\uDF52";
            case 4:
                answer = "\uD83C\uDF4F";
            default:
                answer = "\uD83C\uDF53";

        }
        return answer;
}
           
           public static String getCake() {
         
               Random rand = new Random();

        int b = rand.nextInt(3) + 1;
        String answer;
        
          switch (b) {
            case 1:
                answer ="\uD83C\uDF82"; 
            case 2:
                answer = "\uD83C\uDF70";
            default:
                answer = "\uD83C\uDF69";

        }
        return answer;
               
           }
}
