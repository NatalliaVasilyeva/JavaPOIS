/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.utilites;

import com.bsu.vasilyeva_n.lab10.entity.Train;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorLocomotives.TypeOfLocomotive;

/**
 *
 * @author Natali
 */
public class CreatorTrain {

    
    public static Train createTrain(String numberOfTrain, String routeOfTrain) {
     
     return new Train(numberOfTrain, routeOfTrain);

    }
}
