/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_4;

import java.util.Scanner;

/**
 *
 * @author Natali
 */
public class Complete {

    public static boolean complete(String quation) {
        System.out.println(quation + "YES or NO?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().toLowerCase();
        return answer.equals("yes");
    }
}
