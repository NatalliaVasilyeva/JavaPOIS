/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab6_1;

/**
 *
 * @author Natali
 */
import java.util.Random;
public class Coin {

    public static void findCountOfCoinHeads(int a) {
       Random random = new Random();
        int countH = 0;
        for (int i = 0; i < a; i++) {
          //  int x = (int) (Math.random() * 2);
            if (random.nextBoolean()) {
                countH++;
                   }
    }
     System.out.println("The number of heads is " + countH);
   }
}
