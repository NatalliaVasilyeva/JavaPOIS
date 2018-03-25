/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_1;

/**
 *
 * @author Natali
 */
public class countNaturalNumber {
    public static int countQuantityOfNumberDigit(long number) {
        int count = 1;
        number = number>0?number:-number;
        while (number>9){
            count++;
            number/=10;
        }
        return count;
    }
    
     public static int countSumOfNumberDigit(long number) {
        int sum = 0;
        number = number>0?number:-number;
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
