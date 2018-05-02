/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab6_3;

/**
 *
 * @author Natali
 */
public class ReverceNumber {

    public static int findReverceNumber(int number) {
        number = number > 0 ? number : -number;
        int x = 0;
        int numberR = 0;
        while (number > 0) {
            x = number % 10;
            numberR = x + numberR * 10;
            number /= 10;

        }
        return numberR;
    }

}
