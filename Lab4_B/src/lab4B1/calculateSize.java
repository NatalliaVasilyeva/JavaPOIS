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
        int kilobyte = a/1024;
        return kilobyte;
    }
    
    public static int calculateMegabyte( int a) {
        int megabyte = calculateKilobyte(a)/1024;
        return megabyte;
    }
    
    public static int calculateGigabyte( int a){
        int gigabyte = calculateMegabyte(a)/1024;
        return gigabyte;
    }
}
