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
public abstract class Coaches extends ItemsOfTransport {
    
    private int length;

    public Coaches(int id) throws IOException {
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
}
