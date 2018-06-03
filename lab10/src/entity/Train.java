/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.entity;
import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.ElectricLocomotive;
import com.bsu.vasilyeva_n.lab10.entity.UgolniyLocomotive;
import java.io.IOException;
import java.util.ArrayList;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches;
import com.bsu.vasilyeva_n.lab10.entity.PassengerCoaches.TypeOfPlace;
import com.bsu.vasilyeva_n.lab10.entity.PlackartCoach;
import com.bsu.vasilyeva_n.lab10.entity.SVCoach;
import com.bsu.vasilyeva_n.lab10.entity.RestourantCoach;
import com.bsu.vasilyeva_n.lab10.entity.FreightCoaches;
import com.bsu.vasilyeva_n.lab10.entity.ConteinerFreightCoach;
import com.bsu.vasilyeva_n.lab10.entity.CisternaFreightCoach;
import com.bsu.vasilyeva_n.lab10.entity.PlatformaFreightCoach;
/**
 *
 * @author Natali
 */
public class Train {
    
    private String numberOfTrain;
    private String routeOfTrain;
    
    ArrayList<ItemsOfTransport> coashes = new ArrayList<ItemsOfTransport>();

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

      
    public void add(ItemsOfTransport coach){
        coashes.add(coach);
    };


   
    
    
}
