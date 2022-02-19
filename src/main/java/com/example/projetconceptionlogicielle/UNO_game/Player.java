package com.example.projetconceptionlogicielle.UNO_game;

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
        System.out.println("Choose a card (enter a number)\n" + getHand());
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
}
