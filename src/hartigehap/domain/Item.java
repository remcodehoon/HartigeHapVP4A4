/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.domain;

import java.text.NumberFormat;

/**
 *
 * @author Mirjam
 */
public class Item {
    
    private int itemID;
    private String naam;
    private double prijs;
    
    public Item(int itemID, String naam, double prijs) {
        this.itemID = itemID;
        this.naam = naam;
        this.prijs = prijs;
    }
    
    public double getPrijs() {
        return prijs;
    }
    
    public int getItemID() {
        return itemID;
    }

    public String getNaam() {
        return naam;
    }
    
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return naam + "     " + formatter.format(prijs);
    }
}