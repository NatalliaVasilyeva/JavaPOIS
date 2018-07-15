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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.volumeOfLaggageInFreightCoaches;
        hash = 43 * hash + this.maxVolumeOfLaggageInFreightCoaches;
        hash = 43 * hash + this.weightOfLaggageInFreightCoaches;
        hash = 43 * hash + this.maxWeightOfLaggageInFreightCoaches;
        hash = 43 * hash + this.widthsOfFreightCoaches;
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
        final FreightCoaches other = (FreightCoaches) obj;
        if (this.volumeOfLaggageInFreightCoaches != other.volumeOfLaggageInFreightCoaches) {
            return false;
        }
        if (this.maxVolumeOfLaggageInFreightCoaches != other.maxVolumeOfLaggageInFreightCoaches) {
            return false;
        }
        if (this.weightOfLaggageInFreightCoaches != other.weightOfLaggageInFreightCoaches) {
            return false;
        }
        if (this.maxWeightOfLaggageInFreightCoaches != other.maxWeightOfLaggageInFreightCoaches) {
            return false;
        }
        if (this.widthsOfFreightCoaches != other.widthsOfFreightCoaches) {
            return false;
        }
        return true;
    }
    
    
}
