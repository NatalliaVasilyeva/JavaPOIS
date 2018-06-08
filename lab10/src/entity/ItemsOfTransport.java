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
public abstract class ItemsOfTransport {
     private final int id;
     private String itemsNumber;
     int n;

    public ItemsOfTransport(int id) throws IOException {
        this.id = id;
    }   

    public int getId() {
        return id;
    }

    public String getItemsNumber() {
        return itemsNumber;
    }

    public void setItemsNumber(String itemsNumber) {
        this.itemsNumber = itemsNumber;
    }
   
    
     public abstract String connectItems();
     public abstract String disconnectItems();

   }


