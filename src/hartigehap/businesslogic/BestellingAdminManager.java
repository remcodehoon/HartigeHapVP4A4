/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.businesslogic;

import hartigehap.datastorage.BestelregelDAO;
import hartigehap.datastorage.BestellingDAO;
import java.util.ArrayList;
import java.util.HashMap;
import hartigehap.domain.Bestelling;
import hartigehap.domain.Bestelregel;

/**
 *
 * @author Mirjam
 */
public class BestellingAdminManager {
    
    public Bestelling vindBestelling()
    {
        Bestelling bestelling = null;
        
        if(bestelling == null)
        {
            BestellingDAO bestellingDAO = new BestellingDAO();
            bestelling = bestellingDAO.getBestelling();
        }
        return bestelling;
    }
}
