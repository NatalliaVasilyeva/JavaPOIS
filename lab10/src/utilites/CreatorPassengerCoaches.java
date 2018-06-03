/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.utilites;
import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches.TypeOfPlace;
import com.bsu.vasilyeva_n.lab10.entity.PlackartCoach;
import com.bsu.vasilyeva_n.lab10.entity.SVCoach;
import com.bsu.vasilyeva_n.lab10.entity.RestourantCoach;
import java.io.IOException;

/**
 *
 * @author Natali
 */
public class CreatorPassengerCoaches {
     public enum TypeOfPassengerCoach {
        PLACKART,
        SV,
        RESTAURANT;
     }
     
     public static ItemsOfTransport createCoach (TypeOfPassengerCoach passengerCoachesType, int id, TypeOfPlace place, int length, String itemsNumber,  int capacityOfPassengerInCoach, int capacityOfLaggageInCoach) throws IOException {
         ItemsOfTransport coach = null;
         if (passengerCoachesType == TypeOfPassengerCoach.PLACKART) {
              coach= new PlackartCoach(id, place, length, itemsNumber, capacityOfPassengerInCoach, capacityOfLaggageInCoach );
         }
         else if (passengerCoachesType == TypeOfPassengerCoach.SV) {
             coach= new SVCoach(id, place, length, itemsNumber, capacityOfPassengerInCoach, capacityOfLaggageInCoach );
         }
         else if (passengerCoachesType == TypeOfPassengerCoach.RESTAURANT) {
             coach= new RestourantCoach(id, place, length, itemsNumber, capacityOfPassengerInCoach, capacityOfLaggageInCoach );
         }
         else {
             System.out.println("There are no such passenger coaches");
         }
         
         return coach;
     }
}