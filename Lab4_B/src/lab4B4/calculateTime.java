/*
 Programm find info about full minute, hour from the beginning of the day. Source  info - full second from beginning of the day
 */
package lab4B.lab4B4;

/**
 *
 * @author Natallia Vasilyeva
 * BSU, group 1709v1, 01.03.18
 */

public class calculateTime {
        public static int calculateMinute(int a) {
        int minute = a/60;
        return minute;
    }
    
    public static int calculateHour( int a) {
        int hour = a/60/60;
        return hour;
    }
    
}
