/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigehap.domain;

import hartigehap.datastorage.BestelregelDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Mirjam
 */
public class testdomain extends JFrame {
    public static void main (String[] args){
        JFrame frame = new testdomain();
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test domain");
        frame.setContentPane(new paneel());
        frame.setVisible(true);
    }
}

class paneel extends JPanel{
    private Bestelling bestelling;
    private JTextArea tekstgebied;
    private JButton knop, knop2;
    private JScrollPane scrolltekst;
    
    public paneel(){
        //Maak nieuwe bestelling
        bestelling = new Bestelling(1);
        
        //Maak nieuwe items
        Item cola = new Item(1, "Cola", 1.50);
        Item fanta = new Item(2, "Fanta", 2.50);
        Item cassis = new Item(3, "Cassis", 1.75);
        
        //Voeg 3 items/bestelregels toe
        Bestelregel regel = new Bestelregel(cola);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(fanta);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cassis);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cola);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(fanta);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cassis);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cola);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(fanta);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cassis);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cassis);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cassis);
        bestelling.addBestelregel(regel);
        
        regel = new Bestelregel(cassis);
        bestelling.addBestelregel(regel);
        
        //bestelling.printBestelling();
        
        tekstgebied = new JTextArea(10,30);
        tekstgebied.setEditable(false);
        scrolltekst = new JScrollPane(tekstgebied);
        add(scrolltekst);
        
        knop = new JButton("Bestelling bekijken");
        knop.addActionListener(new KnopHandler());
        add(knop);
        
        knop2 = new JButton("Opslaan in DB");
        knop2.addActionListener(new KnopHandler2());
        add(knop2);
    }
        
        class KnopHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tekstgebied.setText(bestelling.toString());
            }
        }
        class KnopHandler2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            BestelregelDAO iets = new BestelregelDAO();
            tekstgebied.setText(iets.plaatsBestelregels(bestelling));
            }
        }
}
