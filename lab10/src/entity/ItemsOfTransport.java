/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.entity;

import com.bsu.vasilyeva_n.lab10.exceptions.*;
import java.io.IOException;
import java.util.Objects;


/**
 *
 * @author Natali
 */
public abstract class ItemsOfTransport {

    private final int id;
    private String itemsNumber;
    int n;

    public ItemsOfTransport(int id) throws ItemsOfTransportExceptions {
        if (id<=0) {
            throw new ItemsOfTransportExceptions("ID must be above 0");
        }
        else {
        this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public String getItemsNumber() {
        return itemsNumber;
    }

    public void setItemsNumber(String itemsNumber) throws ItemsOfTransportExceptions {
        
        if (itemsNumber == null) {
            throw new ItemsOfTransportExceptions("Number must be above 0");
        }
        else {
            this.itemsNumber = itemsNumber;
        }
    }

    public abstract String connectItems();

    public abstract String disconnectItems();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.itemsNumber);
        hash = 59 * hash + this.n;
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
        final ItemsOfTransport other = (ItemsOfTransport) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.n != other.n) {
            return false;
        }
        if (!Objects.equals(this.itemsNumber, other.itemsNumber)) {
            return false;
        }
        return true;
    }

    
    
}
