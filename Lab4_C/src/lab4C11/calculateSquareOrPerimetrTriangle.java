/*
 * Develop a program to find the area and perimeter of the triangle, which is given on the coordinate plane by three vertices (x1,y1), (x2,y2), (x3,y3).
 */
package lab4C.lab4C11;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 08.03.18
 */

public class calculateSquareOrPerimetrTriangle {
    
    
    
    public static double findPerimetr(double x1, double x2, double x3, double y1, double y2, double y3) {
          double side1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
         double side2 = Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
          double side3 = Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
        
         return side1+side2+side3;
       
    }
    
    public static double findSquare(double x1, double x2, double x3, double y1, double y2, double y3 ) {
        double side1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
         double side2 = Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
          double side3 = Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
          
          double pp = (side1+side2+side3)/2;
          
         return Math.sqrt(pp*(pp-side1)*(pp-side2)*(pp-side3));
          
             
    }
}
