/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.cotroller;

import com.bsu.vasilyeva_n.lab10.entity.ElectricLocomotive;
import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorTrain;
import com.bsu.vasilyeva_n.lab10.entity.Train;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorLocomotives;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorPassengerCoaches;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches.TypeOfPlace;
import com.bsu.vasilyeva_n.lab10.entity.PlackartCoach;



import java.io.IOException;
import java.util.Collections;

/**
 *
 * @author Natali
 */
public class lab10 {
   public static void main(String[] args) throws IOException {
    
       Train passengerTrain = CreatorTrain.createTrain("5051m", "Minsk-Moskva");
      
       ItemsOfTransport locomotive = CreatorLocomotives.createCoach("ELECTRIC", 1, "1541m", 100);
       ItemsOfTransport plackart1 = CreatorPassengerCoaches.createCoach("PLACKART", 2, TypeOfPlace.ECONOM, 15, "1569m", 53, 1200, 49, 1000);
       ItemsOfTransport plackart2 = CreatorPassengerCoaches.createCoach("PLACKART", 3, TypeOfPlace.BUSINESS, 14, "1567m", 35, 1500, 33, 1400);
       ItemsOfTransport plackart3 = CreatorPassengerCoaches.createCoach("PLACKART", 4, TypeOfPlace.ECONOM, 15, "1580m", 53, 1200, 45, 850);

       ((ElectricLocomotive) locomotive).setBatteryCapacity(150000);
       ((PlackartCoach) plackart1).setCountOfSleepingPlace(35);
       ((PlackartCoach) plackart2).setCountOfSleepingPlace(35);
       ((PlackartCoach) plackart3).setCountOfSleepingPlace(35);
       
       passengerTrain.add(locomotive);
       passengerTrain.add(plackart1);
       passengerTrain.add(plackart2);
       passengerTrain.add(plackart3);
       
       System.out.println(passengerTrain);
          
  
        
}
}
