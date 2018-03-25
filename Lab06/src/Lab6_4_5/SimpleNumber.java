/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.Lab6_4_5;

/**
 *
 * @author Natali
 */
public class SimpleNumber {
    public static boolean isSimpleNumber(long number) {
        
        boolean answer=false;
        if (number < 2) answer= false;
        
        for (int i=2; i<number; i++) {
        
        if (number%i != 0) {
	      answer = true;
           	    }
           else {answer = false; break;
      	}
        
       
    }
         return answer;
}
}
