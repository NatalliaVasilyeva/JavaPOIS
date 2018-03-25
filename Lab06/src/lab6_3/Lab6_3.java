/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab6_3;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 24.03.18
 */
public class Lab6_3 {

    public static void main(String[] args) {
        int number = UserInput.input("Input a number");
        View.print("The reverse number is " + ReverceNumber.findReverceNumber(number));

    }
}
