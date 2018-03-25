/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab6_2;

/**
 *
 * @author Natali
 */
public class PerfectNumber {

    public static boolean PerNumberLogic(int number) {
        int sum = 0;
        boolean answer;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (number == sum) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

}
