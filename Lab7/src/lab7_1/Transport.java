/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab7_1;

/**
 *
 * @author Natali
 */
public class Transport {
    private String name;
    private int number;
    private String router;

     
    public Transport() {
    }
    
     public Transport(String name, int number, String router) {
        this.name = name;
        this.number = number;
        this.router = router;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

   
   
    
}
