/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.utilites;
import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.ElectricLocomotive;
import com.bsu.vasilyeva_n.lab10.entity.UgolniyLocomotive;
import java.io.IOException;

/**
 *
 * @author Natali
 */
public class CreatorLocomotives {
     
     public static ItemsOfTransport createCoach (String locomotiveType, int id, String itemsNumber, int power) throws IOException {
         ItemsOfTransport coach = null;
         if (locomotiveType.equalsIgnoreCase("ELECTRIC")) {
              coach= new ElectricLocomotive(id, itemsNumber, power);
        }
         else if (locomotiveType.equalsIgnoreCase("UGOLNIY")) {
             coach= new UgolniyLocomotive(id, itemsNumber, power );
         }
         else {
             System.out.println("There are no such locomotives");
         }
         
         return coach;
     }
     
   }
