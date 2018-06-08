/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.logic;

import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches;
import com.bsu.vasilyeva_n.lab10.entity.Train;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Natali
 */
public abstract class Sorter implements Comparator {
   
    
     private static Comparator<ItemsOfTransport> cs = new Comparator<ItemsOfTransport>() {

       @Override
        public int compare(ItemsOfTransport cs1, ItemsOfTransport cs2) {
            
            return ((PassengerCoaches) cs1).getNumberOfPassenger() - ((PassengerCoaches) cs2).getNumberOfPassenger();
        }

   };

       
    
}
