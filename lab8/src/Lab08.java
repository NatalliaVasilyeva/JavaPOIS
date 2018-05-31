/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab8;
import java.util.Arrays;
/**
 *
 * @author Natallia Vasilyeva pois1709v1
 * 09.05.2018
 */
public class Lab08 {
    public static void main(String[] args) {
    
        int size = UserInput.input("Input the size of array ");
        
        int[] array = ArrayCreator.createArray(size);
        
        ArrayInitializer.rndInit(array, 0, 10);
        
        View.print("This is our array of integer numbers " + Arrays.toString(array) +"\n");
          
        View.print("The average ariphmetical of array is " + ArrayWorker.findAverageAriphm(array)+"\n");
        
        View.print("The average geometrical of array is " + ArrayWorker.findAverageGeometr(array)+"\n");
        
        View.print("Now we check is the array has right order from minimum to maximum : " + ArrayWorker.isRightOrderFromMinToMax(array)+"\n"); 
     
        View.print("Now we check is the array has right order from maximum to minimum : " + ArrayWorker.isRightOrderFromMaxToMin(array)+"\n"); 
         
        View.print("First local minimum in our array is  " + ArrayWorker.findFirstLocalMinimum(array)+"\n");
        
        View.print("The reverce array is " + Arrays.toString(ArrayWorker.reverceElement(array)) + "\n");
        
        View.print("The max element of array is " + ArrayWorker.findMaxElement(array) + "\n");
        
        View.print("The min element of array is " + ArrayWorker.findMinElement(array)+"\n");
               
        
}

}