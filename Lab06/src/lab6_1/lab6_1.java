/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab6_1;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 24.03.18
 */
public class lab6_1 {

    public static void main(String[] args) {
        View.print("The programm find count of Heads or Tails");
        int a = UserInput.input("Input number of repeats: ");

        View.print("We has next information: ");
        Coin.findCountOfCoinHeads(a);

    }
}
