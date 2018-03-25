/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_2;

/**
 *
 * @author Natali
 */
public class DifferencesDigitsOfNumber {

    public static int countQuantity(long number) {
        int count = 1;
        number = number > 0 ? number : -number;
        while (number > 9) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int QuantityDigits(long number) {

        int size = countQuantity(number);
        int[] mas = new int[size];

        int quantity = 0;

        for (int i = 0; i < size; i++) {
            mas[i] = (int) number % 10;
            number /= 10;

        }

        for (int i = 0; i < size; i++) {
            for (int k = i + 1; k < size; k++) {
                if (mas[i] == mas[k]) {
                    quantity++;
                    break;
                }

            }
        }

        return size - quantity;
    }

}
