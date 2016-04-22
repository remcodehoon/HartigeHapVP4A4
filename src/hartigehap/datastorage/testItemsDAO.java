/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.datastorage;

/**
 *
 * @author Mirjam
 */
public class testItemsDAO {
    public static void main(String[] args) {
        ItemDAO test = new ItemDAO();
        System.out.println(test.getItem(6));
    }
}
