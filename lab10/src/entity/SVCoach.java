/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.entity;

import java.io.IOException;

/**
 *
 * @author Natali
 */
public class SVCoach extends PassengerCoaches {
    
    private int countOfKupe;
    private int numberOfSleepingplace;

    public SVCoach(int id, TypeOfPlace place, int length, String itemsNumber,  int capacityOfPassengerInCoach, int capacityOfLaggageInCoach) throws IOException {
        super(id);
        setPlaceType(place);
        setLength(length);
        setItemsNumber(itemsNumber);
        setCapacityOfPassengerInCoach(capacityOfPassengerInCoach);
        setCapacityOfLaggageInCoach(capacityOfLaggageInCoach);      
    }

    public int getCountOfKupe() {
        return countOfKupe;
    }

    public void setCountOfKupe(int countOfKupe) {
        this.countOfKupe = countOfKupe;
    }

    public int getNumberOfSleepingplace() {
        return numberOfSleepingplace;
    }

    public void setNumberOfSleepingplace(int numberOfSleepingplace) {
        this.numberOfSleepingplace = numberOfSleepingplace;
    }

    
      
    @Override
     public String connectItems(){return "Pickup coach in the train";};
     public String disconnectItems(){return "Back coach from the train ";};
     
     
     
     
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about sv coach: " + "\n");
         msg.append("ID is " + getId() + ", " + "\n");
         msg.append("Number of coach is " + getItemsNumber() + ", " + "\n");
         msg.append("Passenger's capacity of coach is " + getCapacityOfPassengerInCoach() + ", " + "The fact quantity of passenger is " + getNumberOfPassenger() + "\n");
         msg.append("Laggage's capacity of coach is " + getCapacityOfLaggageInCoach() + ", " + "The fact quantity of laggage is " + getWeightOfLaggage() + "\n");
         
         return msg.toString();
     }
    
}
    
