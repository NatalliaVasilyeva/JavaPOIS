/*
 * Write a program that determines the mood of the user at the current time. 
 * The application will generate a random number, depending on the value of which the screen displays one of the pseudographic faces,
 * which will display the mood of the user
 */
package com.bsu.VasilyevaN.lab5_2;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 09.03.18
 */
import java.util.Random;

public class MoodSensor {

    public static char getSmile() {

        Random rand = new Random();

        int x = rand.nextInt(9) + 1;
        switch (x) {
            case 1:
                return '\u263a';
            case 2:
                return '\u2639';
            case 3:
                return '\u26F9';
            case 4:
                return '\uDE08';
            default:
                return '\u26C4';

        }
    }

}
