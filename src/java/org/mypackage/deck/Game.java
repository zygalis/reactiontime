/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.deck;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author n5leee00
 */
public class Game {
    
    //Ensimmäinen korttipakka
    private final Deck firstDeck;
    
    //Toinen korttipakka
    private final Deck secondDeck;
    
    //Lista, joka sisältää arvottujen korttien polut eli kaksi korttia,
    //yksi molemmista pakoista
    private final ArrayList <String> randomCardFilePaths = new ArrayList();
    
    //Aloitusaika reaktioajan laskentaa varten
    private long startTime;
    
    private long endTime;
    
    private long reactionTime;
    
    //Alustaja, joka luo korttipakat
    public Game(){
        firstDeck = new Deck();
        secondDeck = new Deck();
    }
    //Metodi, joka muodostaa vimeksi arvottujen korttien polut ja palauttaa
    //ne ArrayList-rakenteessa
    public ArrayList <String> getFilePathsOfRandomCards(){ 
       
       Card firstDeckCard = firstDeck.getRandomCard();
       randomCardFilePaths.add("images/" + firstDeckCard.getSuit() + "-" + firstDeckCard.getNumber() + ".png");
       
       Card secondDeckCard = secondDeck.getRandomCard();
       randomCardFilePaths.add("images/" + secondDeckCard.getSuit() + "-" + secondDeckCard.getNumber() + ".png");
       
       return randomCardFilePaths;
    }    
    //Metodi joka poistaa molemmista korttipakoista viimeksi arvotut kortit
    //sekä tyhjentää listan, joka sisältää viimeksi arvottujen korttien polut
    public void removeRandomCards(){
       Card firstDeckCard = firstDeck.getRandomCard();
       randomCardFilePaths.remove("images/" + firstDeckCard.getSuit() + "-" + firstDeckCard.getNumber() + ".png");
       
       Card secondDeckCard = secondDeck.getRandomCard();
       randomCardFilePaths.remove("images/" + secondDeckCard.getSuit() + "-" + secondDeckCard.getNumber() + ".png");   
       
       randomCardFilePaths.clear();
       firstDeck.removeRandomCard();
       secondDeck.removeRandomCard();
        
    }
    public int getSizeOfDeck() {
        
        return firstDeck.getSizeOfDeck();
        
    }
    public void startCounter(){
        startTime = System.currentTimeMillis();
    }
    public void stopCounter(){
        endTime = System.currentTimeMillis();
    }
    public void calculateReactionTime(){
        
        reactionTime = endTime - startTime;
        
    }
    public long getReactionTime(){
        return reactionTime;
    }
    
}
