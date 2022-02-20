package com.example.projetconceptionlogicielle.UNO_game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a player.
 */
public class Player {
    private PlayerHand hand;
    private int nbCards;

    public Player() {
    }

    public PlayerHand getHand() {
        return hand;
    }

    public void setHand(PlayerHand hand) {
        this.hand = hand;
    }

    public int getNbCards() {
        return nbCards;
    }

    public void setNbCards(int nbCards) {
        this.nbCards = nbCards;
    }

    /**
     * The player chooses a card to play in his hand.
     * @return Card chosen by the player
     */
    public Card chooseCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a card (enter -1 to draw)\n " + getHand());
        Card chosenCard;
        while(true){
            try {
                int choice = scanner.nextInt();

                chosenCard = hand.chooseCard(choice);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please choose a value among your cards.");
            }
        }

        return chosenCard;
    }

    /**
     * This method checks whether the player has a specific card in his hand or not.
     * @param wantedCard
     * @return true if the player has the wanted card in his hand
     */
    public boolean hasCard(Card wantedCard){
        //TODO: move this method to PlayerHand
        return hand.getCards().contains(wantedCard);
    }

    /**
     * This method checks if the player has a card with the given value in his hand.
     * @param value
     * @return
     */
    public boolean hasCardWithValue(Value value){
        //TODO: move this method to PlayerHand
        for (Card card: hand.getCards()){
            if(card.getValue() == value) return true;
        }
        return false;
    }

    /**
     * This method is called when the player puts down a black card that changes the color.
     * The player has to choose a color.
     * @return {@link Color} by the player.
     */
    public Color chooseColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a new color: (1-red, 2-green, 3-blue, 4-yellow)");
        Color newColor;
        while(true){
            try{
                int choice = scanner.nextInt();
                newColor = Color.values()[choice];
                break;
            }catch (IndexOutOfBoundsException e){
                System.out.println("Please choose a valid color");
            }

        }

        return newColor;
    }

    /**
     * Adds the card to the player's hand.
     * Called when the player has to draw from the deck.
     * @param card {@link Card} to be added to the player's hand.
     */
    public void draw(Card card){
        hand.addCard(card);
    }

    /**
     * Adds a specified number of cards to the player's hand.
     * Called when the player has to draw from the deck.
     * @param newcards
     */
    public void draw(ArrayList<Card> newcards){
        for(Card card: newcards){
            hand.addCard(card);
        }
    }
}
