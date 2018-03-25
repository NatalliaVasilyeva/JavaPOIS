/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4B.lab4B9;

/**
 *
 * @author Natali
 */
public class lab4B9 {

    public static void main(String[] args) {
        int a = 7;
        int b = 20;
        int c = 25;

        int countOfKvadrat = findCountOfKvadrat.findCountOfKvadrats(a, b, c);
        int leaveSquare = findCountOfKvadrat.findLeaveSquare(a, b, c);

        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println("The count of kvadrats is " + countOfKvadrat);
        System.out.println("The square leaves is " + leaveSquare);
    }

}
