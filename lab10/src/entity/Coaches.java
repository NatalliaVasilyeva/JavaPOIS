/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.entity;

import com.bsu.vasilyeva_n.lab10.exceptions.ItemsOfTransportExceptions;
import java.io.IOException;


/**
 *
 * @author Natali
 */
public abstract class Coaches extends ItemsOfTransport {
    
    private int length;

    public Coaches(int id) throws ItemsOfTransportExceptions {
        super(id);
      }
    
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
     public abstract String connectItems();
     public abstract String disconnectItems();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.length;
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
        final Coaches other = (Coaches) obj;
        if (this.length != other.length) {
            return false;
        }
        return true;
    }
     
}
