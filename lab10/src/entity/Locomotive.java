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
public abstract class Locomotive extends ItemsOfTransport {
    
    private int power;

    public Locomotive(int id) throws IOException {
        super(id);
        }
    
    

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    @Override
     public abstract String connectItems();
     public abstract String disconnectItems();
    
}
