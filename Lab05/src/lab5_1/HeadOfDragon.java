/*
 * The young dragon grows 3 heads each year, but after he turns 200 years -  only 2, 
 * and after 300 year- only 1. Develop a program that calculates how many heads and eyes has the dragon N years old.
 */
package com.bsu.VasilyevaN.lab5_1;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 09.03.18
 */
public class HeadOfDragon {
    
    
     
   public static int countHead (int a) {
         int sum=0;
         final int FIRST_PERIOD = 200;
         final int SECOND_PERIOD = 300;
         
     if ( a>=0&&a<FIRST_PERIOD) {
         
          sum =a*3;
      }   
      
       if ( a>=FIRST_PERIOD&&a<SECOND_PERIOD) {
         
          sum =FIRST_PERIOD*3+(a-FIRST_PERIOD)*2;
      }   
      
       if ( a>=SECOND_PERIOD) {
         
          sum =FIRST_PERIOD*3+(SECOND_PERIOD-FIRST_PERIOD)*2+(a-SECOND_PERIOD);
      }   
      
      return sum;}
   
       
     public static int countEyes(int a) {
         return 2*countHead(a);
         
     }
}