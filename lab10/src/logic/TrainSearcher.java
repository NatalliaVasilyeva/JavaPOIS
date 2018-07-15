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
import java.util.List;

/**
 *
 * @author Natali
 */
public class TrainSearcher {
    
    public static List<ItemsOfTransport> searchCoachWithInsertNumbersOfPlace(Train train, int number) {
        List<ItemsOfTransport> coach = new ArrayList<>();
          for (int i=0; i<train.size(); i++) {
              if (train.getCoach(i) instanceof PassengerCoaches) {
                  if (number == ((PassengerCoaches) train.getCoach(i)).getNumberOfPassenger()) {
                      coach.add(train.getCoach(i));
                  }
              }
        }        
        return coach;
    }
    
}
