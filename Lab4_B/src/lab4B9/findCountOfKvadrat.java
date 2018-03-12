/*
*Program for finding the number of squares with side a, placed on a rectangle with sides b and c, 
* and also the area of the unoccupied part of the rectangle
 */
package lab4B.lab4B9;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 01.03.18
 */
public class findCountOfKvadrat {
    public static int findCountOfKvadrats(int a, int b, int c) {
        
        int countOfKvadrat = b/a+c/a;
        
        return countOfKvadrat;
    }
        
        public static int findLeaveSquare(int a, int b, int c) {
      
    
        int leaveSquare = b*c - (b/a+c/a)*(a*a);
        return   leaveSquare;

    }
}
