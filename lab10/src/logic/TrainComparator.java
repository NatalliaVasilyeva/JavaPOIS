/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.logic;

import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches;
import com.bsu.vasilyeva_n.lab10.entity.FreightCoaches;
import com.bsu.vasilyeva_n.lab10.entity.Locomotive;
import java.util.Comparator;

/**
 *
 * @author Natali
 */
public class TrainComparator {
    
    public static Comparator<ItemsOfTransport> numberComparator = new Comparator<ItemsOfTransport>() {

    @Override
    public int compare(ItemsOfTransport ob1, ItemsOfTransport ob2) {
        return ob1.getItemsNumber().compareTo(ob2.getItemsNumber());
    }
};
    
    public static Comparator<ItemsOfTransport> passengerComparator = new Comparator<ItemsOfTransport>() {

    @Override
    public int compare(ItemsOfTransport ob1, ItemsOfTransport ob2) {
        
        if (ob1 instanceof PassengerCoaches) {
           if (ob2 instanceof PassengerCoaches) {
            return compPass(
                    ((PassengerCoaches)ob1).getNumberOfPassenger(),
                    ((PassengerCoaches)ob2).getNumberOfPassenger());
        }
           else if (ob2 instanceof FreightCoaches) {
               return 1;
           }
           else if (ob2 instanceof Locomotive) {
               return -1;
           }
        }
        else if (ob1 instanceof FreightCoaches){
            if (ob2 instanceof FreightCoaches) {
                return 0;
            }
             else {
                return 1;
            }
        }
        else {
            if (ob2 instanceof Locomotive) {
                return 0;
            } else {
                return -1;
            }
        }
        
       return 0;
    }
};
    
    
    
    
    private static int compPass(int a, int b) {
        return (a<b)? 1: (a==b)? 0:-1; 
    }
}
            