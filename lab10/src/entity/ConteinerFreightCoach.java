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
public class ConteinerFreightCoach extends FreightCoaches {
    
    private int heigthOfFreightCoaches;

    public ConteinerFreightCoach(int id, String itemsNumber,  int maxVolumeOfLaggageInFreightCoaches, 
            int maxWeightOfLaggageInFreightCoaches, int length, int widthsOfFreightCoaches) throws IOException {
            super(id);   
            setItemsNumber(itemsNumber);
            setMaxVolumeOfLaggageInFreightCoaches(maxVolumeOfLaggageInFreightCoaches);
            setMaxWeightOfLaggageInFreightCoaches(maxWeightOfLaggageInFreightCoaches);
            setLength(length);
            setWidthsOfFreightCoaches(widthsOfFreightCoaches);
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
         msg.append("The information about conteiner freight coach: " + "\n");
         msg.append("ID is " + getId() + ", " + "\n");
         msg.append("Number of coach is " + getItemsNumber() + ", " + "\n");
         msg.append("Maximum volume of conteiner coach is " + getMaxVolumeOfLaggageInFreightCoaches() + ", " + "The fact  volume is " + getVolumeOfLaggageInFreightCoaches() + "\n");
         msg.append("Maximum weight of conteiner coach is " + getMaxWeightOfLaggageInFreightCoaches() + ", " + "The fact weight is " + getWeightOfLaggageInFreightCoaches() + "\n");
         msg.append("The length of conteiner coach is " + getLength() +  "\n");
         msg.append("The widths of conteiner coach is " + getWidthsOfFreightCoaches() +  "\n");
         
         return msg.toString();
     }
    
    
}
