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
public class PassengerExceptions extends Exception{

    private static final long serialVersionUID = 1L;
        public PassengerExceptions() {
        super();
    }

    public PassengerExceptions(String message) {
        super(message);
    }

    public PassengerExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    public PassengerExceptions(Throwable cause) {
        super(cause);
    } 
}
