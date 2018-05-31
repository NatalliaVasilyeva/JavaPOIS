/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab8;

/**
 *
 * @author Natallia Vasilyeva pois1709v1 09.05.2018
 */
import java.util.Arrays;
import java.lang.Math;

public class ArrayWorker {

    public static int findMaxElement(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int findMinElement(int[] array) {
      
        Arrays.sort(array);
        return array[0];
    }

    public static double findAverageAriphm(int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double findAverageGeometr(int[] array) {
        double subs = 1;

        for (int i = 0; i < array.length; i++) {
            subs *= array[i];
        }

        return Math.pow(subs, 1.0 / array.length);
    }

    public static boolean isRightOrderFromMinToMax(int[] array) {
        boolean order = true;
       if (array.length == 0 || array.length == 1) {
           order = false;
       }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]< array[i + 1]) {
                order=false;
                break;
            }
        }
        return order;  
    }
    
    public static boolean isRightOrderFromMaxToMin(int[] array) {
        boolean order = true;
       if (array.length == 0 || array.length == 1) {
           order = false;
       }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                 order=false;
                 break;
            }
        }
      return order;
    }

    public static int findFirstLocalMinimum(int[] array) {
       
        if (array.length != 0 && array.length != 1) {
            for (int i = 1; i < array.length-2; i++) {
                if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                                        
                    return i;             
                }   
           }
        }
        return -1;      
    } 
  
    
    
    public static int[] reverceElement (int[] array) {
        int tmp=0;
        for (int i = 0; i < array.length/2; i++){
            tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
                    
    }
         return  array;
}

    
       
  
}