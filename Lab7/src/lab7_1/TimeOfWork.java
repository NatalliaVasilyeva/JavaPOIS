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
public class TimeOfWork {
    private String beginOfWork;
    private String endOfWork;
    private Boolean isWeekendWork;

    public TimeOfWork() {
    }

    public TimeOfWork(String beginOfWork, String endOfWork, Boolean isWeekendWork) {
        this.beginOfWork = beginOfWork;
        this.endOfWork = endOfWork;
        this.isWeekendWork = isWeekendWork;
    }

    public TimeOfWork(String beginOfWork, String endOfWork) {
        this.beginOfWork = beginOfWork;
        this.endOfWork = endOfWork;
    }

    

    public String getBeginOfWork() {
        return beginOfWork;
    }

    public void setBeginOfWork(String beginOfWork) {
        this.beginOfWork = beginOfWork;
    }

    public String getEndOfWork() {
        return endOfWork;
    }

    public void setEndOfWork(String endOfWork) {
        this.endOfWork = endOfWork;
    }

    public Boolean getIsWeekendWork() {
        return isWeekendWork;
    }

    public void setIsWeekendWork(Boolean isWeekendWork) {
        this.isWeekendWork = isWeekendWork;
    }

  
    
}
