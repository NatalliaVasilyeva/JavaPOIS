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

    public static boolean isPerfect(int number) {
        
        int sum = 1;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
            return number == sum; 
        }
    }

