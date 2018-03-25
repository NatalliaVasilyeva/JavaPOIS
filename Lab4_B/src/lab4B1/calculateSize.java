/*
 Programm calculate information about size of file in megabyte, kilobyte and e.c. Source  info - size of file in byte
 */
package lab4B.lab4B1;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 01.03.18
 */
public class calculateSize {
    public static int calculateKilobyte(int a) {
     return a/1024;
      }
    
    public static int calculateMegabyte( int a) {
        return calculateKilobyte(a)/1024;
           }
    
    public static int calculateGigabyte( int a){
        return calculateMegabyte(a)/1024;
         }
}
