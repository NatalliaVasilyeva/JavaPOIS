/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.utilites;

/**
 *
 * @author Natallia Vasilyeva pois1709v1 09.05.2018
 */
import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static int input(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }
    
    
    public static int inputInt(int msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }
    
    
     public static String inputString(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }
}
