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

    public static final int MOOD_QUANTITY=5;
    public static final char HAPPY = '\u263a';
    public static final char SAD = '\u263a';
    public static final char PLAYFUL = '\u26F9'; 
    public static final char ANGRY = '\uDE08'; 
    public static final char NEUTRAL = '\u26C4'; 
    public static char MOOD=NEUTRAL;
    
    public static char checkMood() {

        switch (new Random().nextInt(MOOD_QUANTITY)) {
            case 1: MOOD = HAPPY; break;
            case 2: MOOD=SAD; break;
            case 3: MOOD=PLAYFUL; break;
            case 4: MOOD=ANGRY; break;
            default: MOOD=NEUTRAL; break;
        }
        return MOOD;
    }

}
