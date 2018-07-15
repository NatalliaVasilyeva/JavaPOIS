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

    public SVCoach(int id, TypeOfPlace place, int length, String itemsNumber,  int capacityOfPassengerInCoach, int capacityOfLaggageInCoach, int numberOfPassenger, int weightOfLaggage) throws IOException {
        super(id);
        setPlaceType(place);
        setLength(length);
        setItemsNumber(itemsNumber);
        setCapacityOfPassengerInCoach(capacityOfPassengerInCoach);
        setCapacityOfLaggageInCoach(capacityOfLaggageInCoach);    
        setNumberOfPassenger(numberOfPassenger);
        setWeightOfLaggage(weightOfLaggage);
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.countOfKupe;
        hash = 97 * hash + this.numberOfSleepingplace;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SVCoach other = (SVCoach) obj;
        if (this.countOfKupe != other.countOfKupe) {
            return false;
        }
        if (this.numberOfSleepingplace != other.numberOfSleepingplace) {
            return false;
        }
        return true;
    }
    
     
}
    
