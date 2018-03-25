/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab6_2;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 24.03.18
 */
public class Lab6_2 {
    public static void main(String[] args) {
        View.print("Check is the number perfect or not");
       int number =  UserInput.input("Please, input the number");
        View.print("If number is perfect you will see -  true, if non-perfect  - false" );
        View.print("Is " + PerfectNumber.PerNumberLogic(number));
        
    }
}
