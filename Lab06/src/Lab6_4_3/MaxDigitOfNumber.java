/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_3;

/**
 *
 * @author Natali
 */
public class MaxDigitOfNumber {
     public static int countNumberQuantity(long number) {
        int count = 1;
        number = number>0?number:-number;
        while (number>9){
            count++;
            number/=10;
        }
        return count;
    }
     
     public static int getMaxNumberDigit(long number) {
         int size = countNumberQuantity(number);
         int[] mas = new int[size];
         
          for(int i=0; i<size; i++) {
            mas[i]=(int)number%10;
            number/=10; 
          }
          
          int max = mas[0];
          for(int j=1; j<size; j++) {
              if (mas[j]>mas[0])
                  max = mas[j];
          }
          return max;
     }
}
