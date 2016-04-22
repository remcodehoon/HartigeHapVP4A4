/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.datastorage;

import java.sql.ResultSet;
import java.sql.SQLException;
import hartigehap.domain.Item;
/**
 *
 * @author Mirjam
 */
public class ItemDAO {
    public Item getItem(int a) {
        Item item = null;
        // Instantiate
        DatabaseConnection connection = new DatabaseConnection();
        // Open connection
        connection.openConnection();
        // Query
        String selectSQL = "SELECT * FROM item WHERE itemID = " + a;
        // Execute query
        ResultSet resultset = connection.executeSQLSelectStatement(selectSQL);
        try {
            if (resultset.first()) {
                item = fetchItem(resultset);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            // Close the connection to the database
            connection.closeConnection();
        }
        return item;
    }

    /**
     * Gets the product from a result set
     * 
     * @param resultset
     * @return item
     */
    private Item fetchItem(ResultSet resultset) {
        // Instantiate
        Item item = null;
        try {
            // Get all data
            int itemID = resultset.getInt("itemID");
            String itemNaam = resultset.getString("itemNaam");
            double itemPrijs = resultset.getDouble("itemPrijs");

            // Create product
            item = new Item(itemID, itemNaam, itemPrijs);

        } catch (SQLException e) {
            System.out.println(e);
        }
        return item;
    }
}
