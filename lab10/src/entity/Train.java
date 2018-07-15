/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Natali
 */
public class Train  {
    
    private String numberOfTrain;
    private String routeOfTrain;
    
    public static final int DEFAULT_CAPACITY = 10;
    
    public List<ItemsOfTransport> coaches;
             
    
    public Train(String numberOfTrain, String routeOfTrain) {
        coaches = new ArrayList<>(DEFAULT_CAPACITY);
        this.numberOfTrain = numberOfTrain;
        this.routeOfTrain = routeOfTrain;
    }

    public String getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(String numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public String getRouteOfTrain() {
        return routeOfTrain;
    }

    public void setRouteOfTrain(String routeOfTrain) {
        this.routeOfTrain = routeOfTrain;
    }

        
    public ItemsOfTransport getCoach(int i){
        return coaches.get(i);
    }
    
    public void setCoaches(ArrayList<ItemsOfTransport> coashes){
        this.coaches=coaches;
    }
    
    
    
    public void add(ItemsOfTransport coach){
        coaches.add(coach);
    };


    public List<ItemsOfTransport> getCoaches(){
        return coaches;
    }
   
    public Train() {
        coaches = new ArrayList<>(DEFAULT_CAPACITY);
    }
    
    
    public int size() {
        return coaches.size();
    }
    
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about train: " + "\n");
         msg.append("Train contain: " + getCoaches() +  ", " + "number of train " + getNumberOfTrain() + ", "+ "router is " + getRouteOfTrain() + "\n");
        
         
         return msg.toString();
     }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.numberOfTrain);
        hash = 19 * hash + Objects.hashCode(this.routeOfTrain);
        hash = 19 * hash + Objects.hashCode(this.coaches);
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
        final Train other = (Train) obj;
        if (!Objects.equals(this.numberOfTrain, other.numberOfTrain)) {
            return false;
        }
        if (!Objects.equals(this.routeOfTrain, other.routeOfTrain)) {
            return false;
        }
        if (!Objects.equals(this.coaches, other.coaches)) {
            return false;
        }
        return true;
    }
    
    
}
