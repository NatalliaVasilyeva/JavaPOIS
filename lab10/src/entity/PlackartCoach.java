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
public class PlackartCoach extends PassengerCoaches {
    
    private int countOfSleepingPlace;

    public PlackartCoach(int id, TypeOfPlace place, int length, String itemsNumber,  int capacityOfPassengerInCoach, int capacityOfLaggageInCoach,  int numberOfPassenger, int weightOfLaggage) throws IOException {
        super(id);
        setPlaceType(place);
        setLength(length);
        setItemsNumber(itemsNumber);
        setCapacityOfPassengerInCoach(capacityOfPassengerInCoach);
        setCapacityOfLaggageInCoach(capacityOfLaggageInCoach);   
        setNumberOfPassenger(numberOfPassenger);
        setWeightOfLaggage(weightOfLaggage);
        }

    public int getCountOfSleepingPlace() {
        return countOfSleepingPlace;
    }

    public void setCountOfSleepingPlace(int countOfSleepingPlace) {
        this.countOfSleepingPlace = countOfSleepingPlace;
    }
    
      
    @Override
     public String connectItems(){return "Pickup coach in the train";};
     public String disconnectItems(){return "Back coach from the train ";};
     
     
     
     
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about plackart coach: " + "\n");
         msg.append("ID is " + getId() + ", " + "\n");
         msg.append("Number of coach is " + getItemsNumber() + ", " + "\n");
         msg.append("Passenger's capacity of coach is " + getCapacityOfPassengerInCoach() + ", " + "The fact quantity of passenger is " + getNumberOfPassenger() + "\n");
         msg.append("Laggage's capacity of coach is " + getCapacityOfLaggageInCoach() + ", " + "The fact quantity of laggage is " + getWeightOfLaggage() + "\n");
         
         return msg.toString();
     }
    
}
