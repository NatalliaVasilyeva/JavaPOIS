/*
 * Develop a program that swaps the contents of two variables 'a" and 'b' without using additional variables
 */
package lab4C.lab4C12;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */

public class changeNumbers {
    public static int change2Numbers( int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        return a;
    }
    public static int change2Numbers1( int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        return b;
    }
    
}
