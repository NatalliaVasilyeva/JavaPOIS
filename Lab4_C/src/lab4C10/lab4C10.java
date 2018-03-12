/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C10;

/**
 *
 * @author Natali
 */
public class lab4C10 {
    public static void main(String[] args) {
        
        double x2 = 5.1;
        double x1 = 3.1;
        double y2 = 2.2;
        double y1 = 1.2;
        
        double s = calculateParametrsOfRectangle.calculateSquare(x1, x2, y1, y2);
        double p = calculateParametrsOfRectangle.calculatePerimetr(x1, x2, y1, y2);
        
        System.out.println(" The square of rectangle of "+ s);
          System.out.println(" The perimetr of rectangle of "+ p);
    }
}
