/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_4;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 26.03.18
 */
public class lab5_4 {
    public static void main(String[] args) {
        View.print("Try to use four method to find vowel letter ");
        
        
        char ch = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterFirstMethod(ch));
       
       char ch1 = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterSecondMethod(ch1));
       
       char ch2 = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterThirdMethod(ch2));
       
       char ch3 = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterFourthMethod(ch3));
       
    }
}
