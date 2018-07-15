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
public class ElectricLocomotive extends Locomotive {
     private int batteryCapacity;

    public ElectricLocomotive(int id, String itemsNumber, int power) throws IOException {
        super(id);
        setItemsNumber(itemsNumber);
        setPower(power);
       }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

      @Override
     public String connectItems(){return "Pickup locomotive to the train";};
     public String disconnectItems(){return "Back locomotive from the train ";};
     
     
      @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about electric locomotive: " + "\n");
         msg.append("ID is " + getId() + ", " + "\n");
         msg.append("Number of locomotive is " + getItemsNumber() + ", " + "\n");
         msg.append("Power of the locomotive is  " + getPower() + "\n");
         
         
         return msg.toString();
     }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.batteryCapacity;
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
        final ElectricLocomotive other = (ElectricLocomotive) obj;
        if (this.batteryCapacity != other.batteryCapacity) {
            return false;
        }
        return true;
    }
   
     
    
}
