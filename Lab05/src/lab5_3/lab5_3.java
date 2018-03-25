/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_3;

import java.util.Random;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 09.03.18
 */
public class lab5_3 {
    public static void main(String[] args) {
        
       View.previewShow();
      
       Random rn1 = new Random();
    
      int dice1 = rn1.nextInt(6)+1;
      int dice2 = rn1.nextInt(6)+1;
      int sum = diceLogic.Counting(dice1, dice2);
      
      View.showBonesOne(dice1);
      View.showBonesTwo(dice2);
      
      View.showSum(sum);
    }
}
