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
public class IOReadExceptions extends Exception {

  
    public IOReadExceptions() {
        super();
    }

    public IOReadExceptions(String message) {
        super(message);
    }

    public IOReadExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
