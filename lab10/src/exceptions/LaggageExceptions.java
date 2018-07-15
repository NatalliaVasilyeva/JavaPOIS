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
public class LaggageExceptions extends Exception{

    private static final long serialVersionUID = 1L;
        public LaggageExceptions() {
        super();
    }

    public LaggageExceptions(String message) {
        super(message);
    }

    public LaggageExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    public LaggageExceptions(Throwable cause) {
        super(cause);
    }
}
