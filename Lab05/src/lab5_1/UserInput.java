/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_1;
import java.util.Scanner;
/**
 *
 * @author Natali
 */
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    
    public static int input(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }
}
