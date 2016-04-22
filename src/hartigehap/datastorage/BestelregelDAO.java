/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.datastorage;

import hartigehap.domain.Bestelling;
import hartigehap.domain.Bestelregel;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Mirjam
 */
public class BestelregelDAO 
{
    private int bestellingID = 1;
    private String bestellingGelukt = "De bestelling is geplaatst!";
    private String bestellingMislukt = "Database error. Roep een medewerker.";
    
    public String plaatsBestelregels(Bestelling bestelling){
        // Instantiate
        DatabaseConnection connection = new DatabaseConnection();
        // Open connection
        connection.openConnection();
        ArrayList<Bestelregel> bestelregels = bestelling.getBestelling();
        boolean gelukt = false;
        for(Bestelregel x : bestelregels){
            String sql = "INSERT INTO `bestelregel` (`bestellingID`, `itemID`, `Aantal`) VALUES (" + bestellingID +","+ x.getNaam().getItemID() +","+ x.getAantal() + ")";
            gelukt = connection.executeSQLInsertStatement(sql);
        }
        if(gelukt){
            return bestellingGelukt;
        }
        return bestellingMislukt;
     }
}
        