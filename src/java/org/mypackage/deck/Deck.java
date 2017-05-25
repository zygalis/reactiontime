/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.deck;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author n5leee00
 */
public class Deck {
    private final String[] suits = {"Hertta", "Pata", "Ruutu", "Risti"};
    
    private final ArrayList <Card> cards = new ArrayList();
    
    private final byte NBR_OF_CARDS_IN_SUIT = 13;
    
    public Deck(){ 
        makeDeck();
    }
    
    private int randomNumber = 0;
    
    private void makeDeck(){
        // Maat
        for (byte i=0; i < suits.length; i++)
        {
            // Arvot
            for(byte j=1; j <= NBR_OF_CARDS_IN_SUIT; j++) {
            
                Card card = new Card();
                card.setNumber(j);
                card.setSuit(suits[i]); 
                cards.add(card);
                
            }
        } 
    }
    public Card getRandomCard(){
        
        Random randomGenerator = new Random();
        
        randomNumber = randomGenerator.nextInt(cards.size());
        
        Card card = cards.get(randomNumber);
        
        return card;
    }
    
    public void removeRandomCard() {
        
        cards.remove(randomNumber);
        
    }
    public int getSizeOfDeck() {
        return cards.size();
        
        
    }

}
