/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.logic;

import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches;
import com.bsu.vasilyeva_n.lab10.entity.FreightCoaches;
import com.bsu.vasilyeva_n.lab10.entity.PlackartCoach;
import com.bsu.vasilyeva_n.lab10.entity.SVCoach;
import com.bsu.vasilyeva_n.lab10.entity.Train;
import java.lang.Iterable;
/**
 *
 * @author Natali
 */
public class TrainCounter {
    
    public static int countTrainPassengers(Train train) {
        int count = 0;
        for (int i=0; i<train.size(); i++)
          if (train.getCoach(i) instanceof PassengerCoaches) {
                count += ((PassengerCoaches) train.getCoach(i)).getNumberOfPassenger();
            }
        
        return count;
    }
    
     public static int countTrainLaggage(Train train) {
        int count = 0;
        for (int i=0; i<train.size(); i++)
          if (train.getCoach(i) instanceof PassengerCoaches) {
                count += ((PassengerCoaches) train.getCoach(i)).getWeightOfLaggage();
            }
         else if (train.getCoach(i) instanceof FreightCoaches) {
                count += ((FreightCoaches) train.getCoach(i)).getWeightOfLaggageInFreightCoaches();
            }
        return count;
    }
    
      public static int countTrainSleepingPlaces(Train train) {
        int count = 0;
        for (int i=0; i<train.size(); i++)
          if (train.getCoach(i) instanceof PassengerCoaches) {
                count += ((PlackartCoach) train.getCoach(i)).getQuantityOfSleepingPlace();
            }
        else if (train.getCoach(i) instanceof FreightCoaches) {
                count += ((SVCoach) train.getCoach(i)).getNumberOfSleepingplace();
            }
        return count;
    }
     
}
