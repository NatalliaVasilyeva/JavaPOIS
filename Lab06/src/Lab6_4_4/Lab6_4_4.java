/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_4;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 24.03.18
 */
public class Lab6_4_4 {

    public static void main(String[] args) {
        while (true) {
            long number = UserInput.input("Input a number :");
            View.print("The number is palindrom? " + PalindromNumber.isPalindrom(number));
            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
