/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.VasilyevaN.lab5_4;

/**
 *
 * @author Natali
 */
public class VowelOrConsonantLetter {
    public static boolean getVowelLetterFirstMethod(char q) {
        char a , e, y, u, i, o;
        boolean answer;
     return answer=(q=='A'||q=='E'||q=='Y'||q=='U'||q=='I'||q=='O'||q=='a'||q=='e'||q=='y'||q=='i'||q=='o'||q=='u');
    }
    
    public static boolean getVowelLetterSecondMethod(char q) {
        char a , e, y, u, i, o;
        boolean answer=false;
        q=Character.toUpperCase(q);
     switch(q) {
         case 'A': answer = true; break;
         case 'E': answer = true; break;
         case 'Y': answer = true; break;
         case 'U': answer = true; break;
         case 'I': answer = true; break;
         case 'O': answer = true; break;
         default: answer=false; break;
        
     }
      return answer;
    }
    
     public static boolean getVowelLetterThirdMethod(char q) {
        String s=("aeyuioAEYUIO");
        String ch = Character.toString(q);
       // boolean answer=false;
        return s.contains(ch);
    }
     
       public static boolean getVowelLetterFourthMethod(char q) {
           boolean answer = false;
       char[] letters={'a','e','y','u','i','o','A','E','Y','U','I','O'};
          for (int i=0; i<letters.length; i++ ) {
              if (q==letters[i]) {
                  answer = true;
              }
              else {
                  answer = false;
              }
          }
          return answer;
    }
}
