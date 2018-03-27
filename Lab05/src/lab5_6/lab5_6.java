/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_6;

/**
 *
 * @author Natali
 */
public class lab5_6 {
    public static void main(String[] args) {
        
        int day;
        int month;
        int year;
        View.print("Now we find next day of your date");
      
       do {
            day = UserInput.input("Input the day of date ");
	} while (day > 31 || day < 1);


	do {
	     month = UserInput.input("Input the month of date ");

	} while (month > 12 || month < 1);
        
        
         year = UserInput.input("Input the year of date ");
       	         
        View.print("The next day is - " + NextDate.getNextDay(day, month, year));
        
    }
}
