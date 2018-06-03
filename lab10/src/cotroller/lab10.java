/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.cotroller;

import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorTrain;
import com.bsu.vasilyeva_n.lab10.entity.Train;
import com.bsu.vasilyeva_n.lab10.entity.Locomotive;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches;
import com.bsu.vasilyeva_n.lab10.entity.Train;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorLocomotives;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorLocomotives.TypeOfLocomotive;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorPassengerCoaches;
import com.bsu.vasilyeva_n.lab10.utilites.CreatorPassengerCoaches.TypeOfPassengerCoach;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches.TypeOfPlace;
import com.bsu.vasilyeva_n.lab10.entity.ElectricLocomotive;
import com.bsu.vasilyeva_n.lab10.entity.PlackartCoach;


import java.io.IOException;

/**
 *
 * @author Natali
 */
public class lab10 {
   public static void main(String[] args) throws IOException {
    
       Train passengerTrain = CreatorTrain.createTrain("5051m", "Minsk-Moskva");
      
       ElectricLocomotive locomotive = (ElectricLocomotive) CreatorLocomotives.createCoach(TypeOfLocomotive.ELECTRIC, 1, "1541m", 100);
       PlackartCoach plackart1 =  (PlackartCoach) CreatorPassengerCoaches.createCoach(TypeOfPassengerCoach.PLACKART, 2, TypeOfPlace.ECONOM, 15, "1569m", 53, 1200);
       
           
       locomotive.setBatteryCapacity(10000);
       plackart1. setNumberOfPassenger(40);
       
       
       
       
      passengerTrain.add(locomotive);
      passengerTrain.add(plackart1);
       
       System.out.println(locomotive);
       System.out.println(plackart1);
       System.out.println(passengerTrain);
          
          
        
}
}
