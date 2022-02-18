package com.example.projetconceptionlogicielle.UNO_game;

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
}
