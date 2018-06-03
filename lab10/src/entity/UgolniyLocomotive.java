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
public class UgolniyLocomotive extends Locomotive {
     private int volumeOfCoal;

    public UgolniyLocomotive(int id, String itemsNumber, int power) throws IOException {
        super(id);
        setItemsNumber(itemsNumber);
        setPower(power);
    }

    public int getVolumeOfCoal() {
        return volumeOfCoal;
    }

    public void setVolumeOfCoal(int volumeOfCoal) {
        this.volumeOfCoal = volumeOfCoal;
    }

    

      @Override
     public String connectItems(){return "Pickup locomotive to the train";};
     public String disconnectItems(){return "Back locomotive from the train ";};
     
     
      @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about coal locomotive: " + "\n");
         msg.append("ID is " + getId() + ", " + "\n");
         msg.append("Number of locomotive is " + getItemsNumber() + ", " + "\n");
         msg.append("Power of the locomotive is  " + getPower() + "\n");
         
         
         return msg.toString();
     }
   
     
    
}