/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_1;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 09.03.18
 */
public class lab5_1 {

    public static void main(String[] args) {

        View.print("The programm count how many heads and eyes has dragon");

        int a = UserInput.input("Input a how old the dragon: ");

        int head = HeadOfDragon.countHead(a);
        int eyes = HeadOfDragon.countEyes(a);

        View.print("The dragon has " + head + " heads" + " and " + eyes + " eyes");
    }
}
