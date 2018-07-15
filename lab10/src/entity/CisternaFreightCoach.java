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
public class CisternaFreightCoach extends FreightCoaches {
    
    private String tentConstraction;
    private int heigthOfFreightCoaches;
    
    public CisternaFreightCoach(int id, String itemsNumber,  int maxVolumeOfLaggageInFreightCoaches, 
            int maxWeightOfLaggageInFreightCoaches, int length, int widthsOfFreightCoaches) throws IOException {
            super(id);   
            setItemsNumber(itemsNumber);
            setMaxVolumeOfLaggageInFreightCoaches(maxVolumeOfLaggageInFreightCoaches);
            setMaxWeightOfLaggageInFreightCoaches(maxWeightOfLaggageInFreightCoaches);
            setLength(length);
            setWidthsOfFreightCoaches(widthsOfFreightCoaches);
    }

    public String getTentConstraction() {
        return tentConstraction;
    }

    public void setTentConstraction(String tentConstraction) {
        this.tentConstraction = tentConstraction;
    }

    public int getHeigthOfFreightCoaches() {
        return heigthOfFreightCoaches;
    }

    public void setHeigthOfFreightCoaches(int heigthOfFreightCoaches) {
        this.heigthOfFreightCoaches = heigthOfFreightCoaches;
    }

   
     
    @Override
     public String connectItems(){return "Pickup coach in the train";};
     public String disconnectItems(){return "Back coach from the train ";};
     
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about cisterna freight coach: " + "\n");
         msg.append("ID is " + getId() + ", " + "\n");
         msg.append("Number of coach is " + getItemsNumber() + ", " + "\n");
         msg.append("Maximum volume of cisterna coach is " + getMaxVolumeOfLaggageInFreightCoaches() + ", " + "The fact  volume is " + getVolumeOfLaggageInFreightCoaches() + "\n");
         msg.append("Maximum weight of cisterna coach is " + getMaxWeightOfLaggageInFreightCoaches() + ", " + "The fact weight is " + getWeightOfLaggageInFreightCoaches() + "\n");
         msg.append("The length of cisterna coach is " + getLength() +  "\n");
         msg.append("The widths of cisterna coach is " + getWidthsOfFreightCoaches() +  "\n");
         
         return msg.toString();
     }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.tentConstraction);
        hash = 97 * hash + this.heigthOfFreightCoaches;
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
        final CisternaFreightCoach other = (CisternaFreightCoach) obj;
        if (this.heigthOfFreightCoaches != other.heigthOfFreightCoaches) {
            return false;
        }
        if (!Objects.equals(this.tentConstraction, other.tentConstraction)) {
            return false;
        }
        return true;
    }
    
    
}
