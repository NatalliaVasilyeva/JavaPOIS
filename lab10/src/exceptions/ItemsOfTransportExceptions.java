/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.exceptions;

/**
 *
 * @author Natali
 */
public class ItemsOfTransportExceptions extends Exception {
        public ItemsOfTransportExceptions() {
        super();
    }

    public ItemsOfTransportExceptions(String message) {
        super(message);
    }

    public ItemsOfTransportExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ItemsOfTransportExceptions(Throwable cause) {
        super(cause);
    } 
}
