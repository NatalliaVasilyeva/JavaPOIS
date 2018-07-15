/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.logic;

import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.Train;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Natali
 */


public class TrainSorter extends TrainComparator {

    private static final long serialVersionUID = 1L;
    
    public static void sortByNumber(Train train, Comparator<ItemsOfTransport> comparator) {
        Collections.sort(train.coaches, comparator);
    }
    
      public static void sortByPassenger(Train train, Comparator<ItemsOfTransport> comparator) {
        Collections.sort(train.coaches, comparator);
    }
    
    
}
