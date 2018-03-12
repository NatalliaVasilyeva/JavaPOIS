/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.Lab4C4;

/**
 *
 * @author Natali
 */
public class lab4C4 {
    public static void main(String[] args) {
        double side = 4.6;
        
        double volume = calculateParametrsOfCube.volumeOfCube(side);
        double square = calculateParametrsOfCube.squareOfCube(side);
        
        System.out.println("The volume of cube is " + volume);
        System.out.println("The square of cube is " + square);
    }
}
