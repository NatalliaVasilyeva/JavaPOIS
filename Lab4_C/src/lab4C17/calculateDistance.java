/*
 * Develop a program for calculating the distance traveled by a boat that 
 * moved initially along the river T1 h, and then against the current T2 h. 
 * Speed of a boat in standing water V km / h, the speed of the river U km / h
 */
package lab4C.lab4C17;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */

public class calculateDistance {
    public static double findDistances (double t1, double t2, double v, double u) {
        
       return t1/(v+u)+t2/(v-u);
           }
}
