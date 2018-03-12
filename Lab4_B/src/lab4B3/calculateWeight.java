/*
 Programm calculate dragon's weight in kilogramm, centners and e.c. Source  info - weight in gramm
 */

package lab4B.lab4B3;
/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 01.03.18
 */

public class calculateWeight {
     public static double calculateKilogramm(int a) {
        double kilogramm = a/1000;
        return kilogramm;
    }
    
    public static double calculateCetner( int a) {
        double centner = a/1000/100;
        return centner;
    }
    
}
