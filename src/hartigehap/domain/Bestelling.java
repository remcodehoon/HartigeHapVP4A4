/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.domain;

import java.util.ArrayList;
/**
 *
 * @author Mirjam
 */
public class Bestelling {
    private ArrayList<Bestelregel> bestelling;
    private int bestellingID = 1;
            
    public Bestelling(int bestellingID)
    {
        this.bestellingID = bestellingID;
        bestelling = new ArrayList<Bestelregel>();
    }
    
    public void addBestelregel(Bestelregel regel){
        boolean help = false;
        if(bestelling.isEmpty()){
            bestelling.add(regel);
            help = true;
        } else { for(Bestelregel x : bestelling){
                if(x.equals(regel)){
                    x.aantalOmhoog();
                    help = true;
                }
            }
        }
        if(help == false){
            bestelling.add(regel);
        }
    }
    
    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        for(Bestelregel x : bestelling){
            buffer.append(x);
            buffer.append("\n");
        }
        return buffer.toString();
    }
    
    public ArrayList getBestelling(){
        return bestelling;
    }
    
    public int getSize(){
        return bestelling.size();
    }
    
    public int getBestellingID(){
        return bestellingID;
    }
    
    public double getTotalPrice(){
        double c = 0;
        for(int i=0;i<bestelling.size();i++){
            double a = bestelling.get(i).getNaam().getPrijs();
            int b = bestelling.get(i).getAantal();
            c+=a*b;
        }
        return c;
    }
}

