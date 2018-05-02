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
public class Schedule {

  
    private String nameOfTransport;
    Transport transport;
    TimeOfWork time;
    Interval interval;

    public Schedule() {
    }

    public Schedule(String nameOfTransport, Transport transport, TimeOfWork time, Interval interval) {
        this.nameOfTransport = nameOfTransport;
        this.transport = transport;
        this.time = time;
        this.interval = interval;
    }


    public String getNameOfTransport() {
        return nameOfTransport;
    }

    public void setNameOfTransport(String nameOfTransport) {
        this.nameOfTransport = nameOfTransport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public TimeOfWork getTime() {
        return time;
    }

    public void setTime(TimeOfWork time) {
        this.time = time;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

     public static String infoBus(String nameOfTransport, Transport transport, TimeOfWork timeOfWork, Interval interval) {

       return "Schedule: " + "name of transport - " + " bus" + ", number of transport - " + transport.getNumber() + ", routre is " + transport.getRouter()+ ", time of begin work is " + timeOfWork.getBeginOfWork() + ", time of end work is " + timeOfWork.getEndOfWork()+ ", interval is " + interval.getIntervalOfMovement() + " minute";

    }
   
    public static String infoTrolleybus(String nameOfTransport, Transport transport, TimeOfWork timeOfWork, Interval interval) {

       return "Schedule: " + "name of transport - " + " trolleybus" + ", number of transport - " + transport.getNumber() + ", routre is " + transport.getRouter()+ ", time of begin work is " + timeOfWork.getBeginOfWork() + ", time of end work is " + timeOfWork.getEndOfWork()+ ", interval is " + interval.getIntervalOfMovement()+ " minute";

    }
    
}
      