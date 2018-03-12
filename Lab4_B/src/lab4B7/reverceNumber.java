/*
Program that reverses a four-digit number N;
 */
package lab4B.lab4B7;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 01.03.18
 */
public class reverceNumber {
      public static int getBackSideNumber(int a) {
        int b = a%10;
        int c = (a/10)%10;
        int d = ((a/10)/10)%10;
        int e = a/1000;
        
       int newNumber = b*1000+c*100+d*10+e;
        return newNumber;
    }
}
