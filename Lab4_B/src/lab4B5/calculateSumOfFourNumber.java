/*
 Programm calculate sum of number of four-digit number. Source  info - four-digit number
 */
package lab4B.lab4B5;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 01.03.18
 */

public class calculateSumOfFourNumber {
    public static int getSum(int a) {
        int b = a%10;
        int c = (a/10)%10;
        int d = ((a/10)/10)%10;
        int e = a/1000;
        
      return b+c+d+e;
         }
}
