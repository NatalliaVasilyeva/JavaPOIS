/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_7;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 24.03.18
 */
public class Lab6_4_7 {

    public static void main(String[] args) {

        while (true) {
            long a = UserInput.input("Input a first number :");
            long b = UserInput.input("Input a second number :");

            View.print("The NOD is " + NodAndNok.findNOD(a, b));
            View.print("The NOK is " + NodAndNok.findNOK(a, b));
            if (!Complete.complete("Do you want to continue?")) {
                break;
            }
        }
    }
}
