/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.datastorage;

import java.sql.ResultSet;
import java.sql.SQLException;
import hartigehap.domain.Bestelling;
/**
 *
 * @author Mirjam
 */
public class BestellingDAO {
    public Bestelling getBestelling() {
        Bestelling bestelling = null;
        // Instantiate
        DatabaseConnection connection = new DatabaseConnection();
        // Open connection
        connection.openConnection();
        // Query
        String selectSQL = "SELECT * FROM bestelling WHERE bestellingID = 1";
        // Execute query
        ResultSet resultset = connection.executeSQLSelectStatement(selectSQL);
        
        if(resultset != null)
            {
                try
                {
                    if(resultset.next())
                    {
                        int bestellingID = resultset.getInt("bestellingID");

                        bestelling = new Bestelling(
                            bestellingID);
                    }
                }
        catch (SQLException e) {
            System.out.println(e);
        } finally {
            // Close the connection to the database
            connection.closeConnection();
        }
    }
        return bestelling;

    /**
     * Gets the product from a result set
     * 
     * @param resultset
     * @return item
     */
    //private Bestelling fetchBestelling(ResultSet resultset) {
    //    // Instantiate
    //    Bestelling bestelling = null;
    //    try {
    //        // Get all data
    //        int bestellingID = resultset.getInt("bestellingID");
    //
    //        // Create product
    //        bestelling = new Bestelling(bestellingID);
    //
    //    } catch (SQLException e) {
    //        System.out.println(e);
    //    }
    //    return bestelling;
    }
}
