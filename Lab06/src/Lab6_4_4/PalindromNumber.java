/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_4;

/**
 *
 * @author Natali
 */
public class PalindromNumber {
    
     public static int countQuantityOfNumber(long number) {
        int count = 1;
        number = number>0?number:-number;
        while (number>9){
            count++;
            number/=10;
        }
        return count;
    }
      
    
    public static boolean isPalindrom(long number) {
            
      int size = countQuantityOfNumber(number);
      int[] mas = new int[size];
    
    //  int quantity=0;
        
     for(int i=0; i<size; i++) {
            mas[i]=(int)number%10;
            number/=10; 
         }           
            
            boolean answer =false ;
            
         for(int i = 0; i<size; i++)  {
             
                if( mas[i]==mas[size-i-1])
                    answer = true;
                else answer = false;
             
           
             
         }
         
     return answer; 
}
}
