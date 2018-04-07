/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_7;

/**
 *
 * @author Natali
 */
public class NodAndNok {

    public static long findNOD(long a, long b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }

        }
        return a + b;
    }

    public static long findNOK(long a, long b) {

        return a * b / findNOD(a, b);

    }

}
