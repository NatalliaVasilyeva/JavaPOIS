/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4B.lab4B6;

/**
 *
 * @author Natali
 */
public class lab4B6 {

    public static void main(String[] args) {
        int number = 1565;

        int sredneeArifm = calculateSrednee.getSredneeArifm(number);
        System.out.println("Srednee ariphmeticheskoe = " + sredneeArifm);
        double sredneeGeometr = calculateSrednee.getSredneeGoometr(number);
        System.out.println("Srednee geometricheskoe = " + sredneeGeometr);

    }
}
