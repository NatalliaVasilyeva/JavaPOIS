/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4B.lab4B4;

/**
 *
 * @author Natali
 */
public class lab4B4 {
    public static void main(String[] args) {
        int second = 35641;
        
        int minute = calculateTime.calculateMinute(second);
        int hour = calculateTime.calculateHour(second);
        
        System.out.println(second + " seconds "+ "is " + minute + " minutes " + " or " + hour + " hours");
    }
}
