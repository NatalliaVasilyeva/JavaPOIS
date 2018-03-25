/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_5;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Natali
 */
public class GuessNumber {
    
    public static void tryGuessNumber(int b, int c, int d) {
    Random rand = new Random();
    int number = rand.nextInt(c-b+1)+b;
    int count=0;
    boolean win = false;
    Scanner sc = new Scanner(System.in);
    int a=0;
    while (win==false&&count<d) {
        System.out.println( "Type number:" );
        a = sc.nextInt();
        count++;  
               
        if(a==number) {
        
         win=true;
     }   
        else if (a<number) {
           System.out.println("You number lower than need number"); }       
         else if(a>number) {
           System.out.println("You number higher then need number");
           }       
       }
    if (a==number) {
          System.out.println("YOU WIN");
         System.out.println("The right number is " + number);
         System.out.println("You did " + count + " attemps");
    }
    else System.out.println("GAME OVER");
    }
   
}
    



   

