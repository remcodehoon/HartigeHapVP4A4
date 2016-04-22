/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.domain;

import java.util.Objects;

/**
 *
 * @author Mirjam
 */
public class Bestelregel {
    
    private Item item;
    private int aantal;
    
    public Bestelregel(Item item){
        this.item = item;
        aantal = 1;
    }
    
    // Getters
    public Item getNaam(){
        return item;
    }
    
    public int getAantal(){
        return aantal;
    }
    
    //Setters
    public void setAantal(int aantal){
        this.aantal = aantal;
    }
    
    public void aantalOmhoog(){
        aantal++;
    }
    
    public String toString(){
        String text = ""+item+"     aantal: "+aantal;
        return text;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bestelregel that = (Bestelregel) o;
        if (!Objects.equals(this.item.getNaam(), that.getNaam().getNaam())) {
            return false;
        }
        return true;
    }
}


