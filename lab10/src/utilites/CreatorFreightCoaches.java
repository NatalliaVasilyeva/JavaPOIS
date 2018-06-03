/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsu.vasilyeva_n.lab10.utilites;
import com.bsu.vasilyeva_n.lab10.entity.ItemsOfTransport;
import com.bsu.vasilyeva_n.lab10.entity.FreightCoaches;
import com.bsu.vasilyeva_n.lab10.entity.ConteinerFreightCoach;
import com.bsu.vasilyeva_n.lab10.entity.CisternaFreightCoach;
import com.bsu.vasilyeva_n.lab10.entity.PlatformaFreightCoach;
import java.io.IOException;
/**
 *
 * @author Natali
 */
public class CreatorFreightCoaches {
    public enum TypeOfFreightCoach {
        CONTEINER,
        CISTERNA,
        PLATFORM;
     }
     
     public static ItemsOfTransport createCoach (TypeOfFreightCoach freightCoachesType, int id, String itemsNumber,  int maxVolumeOfLaggageInFreightCoaches, 
            int maxWeightOfLaggageInFreightCoaches, int length, int widthsOfFreightCoaches) throws IOException {
         ItemsOfTransport coach = null;
         if (freightCoachesType == TypeOfFreightCoach.CONTEINER) {
              coach= new ConteinerFreightCoach(id, itemsNumber, maxVolumeOfLaggageInFreightCoaches, maxWeightOfLaggageInFreightCoaches, length, widthsOfFreightCoaches);
         }
         else if (freightCoachesType == TypeOfFreightCoach.CISTERNA) {
              coach= new CisternaFreightCoach(id, itemsNumber, maxVolumeOfLaggageInFreightCoaches, maxWeightOfLaggageInFreightCoaches, length, widthsOfFreightCoaches);
         }
         else if (freightCoachesType == TypeOfFreightCoach.PLATFORM) {
              coach= new PlatformaFreightCoach(id, itemsNumber, maxVolumeOfLaggageInFreightCoaches, maxWeightOfLaggageInFreightCoaches, length, widthsOfFreightCoaches);
         }
         else {
             System.out.println("There are no such freifht coaches");
         }
         
         return coach;
     }
}
