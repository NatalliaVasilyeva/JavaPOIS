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
public class PlatformaFreightCoach extends FreightCoaches {
    
    private String type;

    public PlatformaFreightCoach (int id, String itemsNumber,  int maxVolumeOfLaggageInFreightCoaches, 
            int maxWeightOfLaggageInFreightCoaches, int length, int widthsOfFreightCoaches) throws IOException {
            super(id);   
            setItemsNumber(itemsNumber);
            setMaxVolumeOfLaggageInFreightCoaches(maxVolumeOfLaggageInFreightCoaches);
            setMaxWeightOfLaggageInFreightCoaches(maxWeightOfLaggageInFreightCoaches);
            setLength(length);
            setWidthsOfFreightCoaches(widthsOfFreightCoaches);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

     
     
    @Override
     public String connectItems(){return "Pickup coach in the train";};
     public String disconnectItems(){return "Back coach from the train ";};
     
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about platforma freight coach: " + "\n");
         msg.append("ID is " + getId() + ", " + "\n");
         msg.append("Number of coach is " + getItemsNumber() + ", " + "\n");
         msg.append("Maximum volume of platforma coach is " + getMaxVolumeOfLaggageInFreightCoaches() + ", " + "The fact  volume is " + getVolumeOfLaggageInFreightCoaches() + "\n");
         msg.append("Maximum weight of platforma coach is " + getMaxWeightOfLaggageInFreightCoaches() + ", " + "The fact weight is " + getWeightOfLaggageInFreightCoaches() + "\n");
         msg.append("The length of platforma coach is " + getLength() +  "\n");
         msg.append("The widths of platforma coach is " + getWidthsOfFreightCoaches() +  "\n");
         
         return msg.toString();
     }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.type);
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
        final PlatformaFreightCoach other = (PlatformaFreightCoach) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
