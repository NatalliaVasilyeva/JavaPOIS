/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4B.lab4B1;

/**
 *
 * @author Natali
 */
public class lab4B1 {

    public static void main(String[] args) {
        int bityk = 256841454;
        System.out.println("Input information in byte = " + bityk);
        int kilobyte = calculateSize.calculateKilobyte(bityk);
        System.out.println("kilobyte = " + kilobyte);
        int megabyte = calculateSize.calculateMegabyte(bityk);
        System.out.println("megabyte = " + megabyte);
        int gigabyte = calculateSize.calculateGigabyte(bityk);
        System.out.println("gigabyte = " + gigabyte);
    }

}
