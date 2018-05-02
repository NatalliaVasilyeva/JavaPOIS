/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab7_1;

import java.util.Vector;

/**
 *
 * @author Natali
 * group POIS 1709v1, 30.04.2018
 * 
 * Program for make the schedule of transport
 */
public class lab7_1 {
    public static void main(String[] args) {
        // use collection Vector
      Vector buses = new Vector();
      Vector trolleybuses = new Vector();
      
      
           
      // input information about bus throws constructor
      Transport bus1 = new Transport("MAZ", 1 , " Vesnjanka-Railway station" );
      TimeOfWork timeBus1 = new TimeOfWork("6.00 ", "23.00", true);
      Interval intervalOfBus1 = new Interval (2.5);
      
      Transport bus2 = new Transport("MAZ", 29 , " Kyncevshina - Karastajanavai" );
      TimeOfWork timeBus2 = new TimeOfWork("5.00 ", "24.00", true);
      Interval intervalOfBus2 = new Interval (12.5);
     
      
      //add elements into collection "buses"
      buses.addElement(new Schedule("bus", bus1, timeBus1, intervalOfBus1));
      buses.addElement(new Schedule("bus", bus2, timeBus2, intervalOfBus2));
      
      // input information about trolleybus throws constructor
      Transport trolleybus1 = new Transport("MAZ", 33 , " Pushkinskaja - Draznia" );
      TimeOfWork timeTrolleybus1 = new TimeOfWork("5.20 ", "23.00", true);
      Interval intervalOfTrolleybus1 = new Interval (5.5);
      
      //add elements into collection "trolleybuses"
      trolleybuses.addElement(new Schedule("bus", trolleybus1, timeTrolleybus1, intervalOfTrolleybus1));
      
      //print info about transport
      View.print(Schedule.takeInfoBus("bus", bus1, timeBus1, intervalOfBus1));
      View.print(Schedule.takeInfoBus("bus", bus2, timeBus2, intervalOfBus2));
      
      View.print(Schedule.takeInfoTrolleybus("trolleybus", trolleybus1, timeTrolleybus1, intervalOfTrolleybus1));
      
    }
}
