/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_5;
/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 24.03.18
 */
public class Lab6_5 {
    public static void main(String[] args) {
        View.print("Now yot will play with computer");
        View.print("Try to guess a number");
        
       
        int b = UserInput.input("Please, set low bound of range ");
        int c = UserInput.input("Please, set upper bound of range ");
        int d = UserInput.input("Please, set attemps to win ");
        
        GuessNumber.tryGuessNumber(b, c, d);
    
    }
}
