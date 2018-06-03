/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.entity;
import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import java.util.ArrayList;

/**
 *
 * @author Natali
 */
public class Train  {
    
    private String numberOfTrain;
    private String routeOfTrain;
    
    ArrayList<ItemsOfTransport> coaches = new ArrayList<ItemsOfTransport>();

    public Train(String numberOfTrain, String routeOfTrain) {
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

        
    public ArrayList<ItemsOfTransport> getCoaches(){
        return coaches;
    }
    
    public void setCoaches(ArrayList<ItemsOfTransport> coashes){
    this.coaches=coaches;
    }
    
    
    
    public void add(ItemsOfTransport coach){
        coaches.add(coach);
    };


     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about train: " + "\n");
         msg.append("Train contain " + "items of transport " + coaches +  ", " + "number of train " + getNumberOfTrain() + ", "+ "router is " + getRouteOfTrain() + "\n");
        
         
         return msg.toString();
     }
    
    
}
