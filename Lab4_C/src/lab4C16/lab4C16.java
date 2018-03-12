/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4C.lab4C16;

/**
 *
 * @author Natali
 */
public class lab4C16 {
    public static void main(String[] args) {
        
     double weightOfSweets = 15.4;
     double allCostsOfSweets = 254.8;
     double weightOfGelatins = 11.4;
     double allCostsOfGelatins = 113.8; 
     
     double cost1KgOfSweet = calculateCostsOfSweets.findCostSweet(weightOfSweets, allCostsOfSweets);
     double cost1KgOfGelatins = calculateCostsOfSweets.findCostGElatins(weightOfGelatins, allCostsOfGelatins);
     
     double differenceBetwwenCocsts = calculateCostsOfSweets.findDifferenceBetweenCosts(weightOfSweets, allCostsOfSweets, weightOfGelatins, allCostsOfGelatins);
     
     System.out.println("The 1 kg of sweets cost " + cost1KgOfSweet);
     System.out.println("The 1 kg of gelatins cost " + cost1KgOfGelatins);
     System.out.println(" The diffences between cost of sweets and gelatins is " + differenceBetwwenCocsts + " times");
    }
}
