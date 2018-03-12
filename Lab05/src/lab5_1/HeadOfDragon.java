/*
 * The young dragon grows 3 heads each year, but after he turns 200 years -  only 2, 
 * and after 300 year- only 1. Develop a program that calculates how many heads and eyes has the dragon N years old.
 */
package lab5.lab5_1;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 09.03.18
 */
public class HeadOfDragon {
    
    
     
   public static int countHead (int a) {
         int sum=0;
         
     if ( a>=0&&a<200) {
         
          sum =a*3;
      }   
      
       if ( a>=200&&a<300) {
         
          sum =200*3+(a-200)*2;
      }   
      
       if ( a>=300) {
         
          sum =200*3+100*2+(a-300)*1;
      }   
      
      return sum;}
   
       
     public static int countEyes(int a) {
         int x = 2*countHead(a);
         return x;
     }
}