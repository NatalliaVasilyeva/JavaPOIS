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
public abstract class FreightCoaches extends Coaches {
    private int volumeOfLaggageInFreightCoaches;
    private int maxVolumeOfLaggageInFreightCoaches;
    private int weightOfLaggageInFreightCoaches;
    private int maxWeightOfLaggageInFreightCoaches;
    private int widthsOfFreightCoaches;

    public FreightCoaches(int id) throws IOException {
        super(id);
    }

    public int getVolumeOfLaggageInFreightCoaches() {
        return volumeOfLaggageInFreightCoaches;
    }

    public void setVolumeOfLaggageInFreightCoaches(int volumeOfLaggageInFreightCoaches) {
        this.volumeOfLaggageInFreightCoaches = volumeOfLaggageInFreightCoaches;
    }

    public int getMaxVolumeOfLaggageInFreightCoaches() {
        return maxVolumeOfLaggageInFreightCoaches;
    }

    public void setMaxVolumeOfLaggageInFreightCoaches(int maxVolumeOfLaggageInFreightCoaches) {
        this.maxVolumeOfLaggageInFreightCoaches = maxVolumeOfLaggageInFreightCoaches;
    }

    public int getWeightOfLaggageInFreightCoaches() {
        return weightOfLaggageInFreightCoaches;
    }

    public void setWeightOfLaggageInFreightCoaches(int weightOfLaggageInFreightCoaches) {
        this.weightOfLaggageInFreightCoaches = weightOfLaggageInFreightCoaches;
    }

    public int getMaxWeightOfLaggageInFreightCoaches() {
        return maxWeightOfLaggageInFreightCoaches;
    }

    public void setMaxWeightOfLaggageInFreightCoaches(int maxWeightOfLaggageInFreightCoaches) {
        this.maxWeightOfLaggageInFreightCoaches = maxWeightOfLaggageInFreightCoaches;
    }

      public int getWidthsOfFreightCoaches() {
        return widthsOfFreightCoaches;
    }

    public void setWidthsOfFreightCoaches(int widthsOfFreightCoaches) {
        this.widthsOfFreightCoaches = widthsOfFreightCoaches;
    }
    
    
      @Override
     public abstract String connectItems();
     public abstract String disconnectItems();
    
    
}
