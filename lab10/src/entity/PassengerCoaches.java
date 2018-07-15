/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.entity;

import java.io.IOException;
import java.util.Objects;



/**
 *
 * @author Natali
 */
public abstract class PassengerCoaches extends Coaches {
    
    public enum TypeOfPlace {
    ECONOM,
    ECONOMPLUS,
    BUSINESS;
}
    
    private int numberOfPassenger;
    private int weightOfLaggage;
    private int capacityOfPassengerInCoach;
    private int capacityOfLaggageInCoach;
    private TypeOfPlace placeType;

    public PassengerCoaches(int id) throws IOException {
        super(id);
    }

    public TypeOfPlace getPlaceType() {
        return placeType;
    }

    public void setPlaceType(TypeOfPlace placeType) {
        this.placeType = placeType;
    }

  
    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getWeightOfLaggage() {
        return weightOfLaggage;
    }

    public void setWeightOfLaggage(int weightOfLaggage) {
        this.weightOfLaggage = weightOfLaggage;
    }

    public int getCapacityOfPassengerInCoach() {
        return capacityOfPassengerInCoach;
    }

    public void setCapacityOfPassengerInCoach(int capacityOfPassengerInCoach) {
        this.capacityOfPassengerInCoach = capacityOfPassengerInCoach;
    }

    public int getCapacityOfLaggageInCoach() {
        return capacityOfLaggageInCoach;
    }

    public void setCapacityOfLaggageInCoach(int capacityOfLaggageInCoach) {
        this.capacityOfLaggageInCoach = capacityOfLaggageInCoach;
    }
    
    

    
    
    @Override
     public abstract String connectItems();
     public abstract String disconnectItems();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numberOfPassenger;
        hash = 89 * hash + this.weightOfLaggage;
        hash = 89 * hash + this.capacityOfPassengerInCoach;
        hash = 89 * hash + this.capacityOfLaggageInCoach;
        hash = 89 * hash + Objects.hashCode(this.placeType);
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
        final PassengerCoaches other = (PassengerCoaches) obj;
        if (this.numberOfPassenger != other.numberOfPassenger) {
            return false;
        }
        if (this.weightOfLaggage != other.weightOfLaggage) {
            return false;
        }
        if (this.capacityOfPassengerInCoach != other.capacityOfPassengerInCoach) {
            return false;
        }
        if (this.capacityOfLaggageInCoach != other.capacityOfLaggageInCoach) {
            return false;
        }
        if (this.placeType != other.placeType) {
            return false;
        }
        return true;
    }

     
  
}
