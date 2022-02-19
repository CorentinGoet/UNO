package com.example.projetconceptionlogicielle.UNO_game;

/**
 * Classe correspondant à l'état actuel du jeu (un tour).
 */
public class Turn {
    private Player player;
    private UnoDeck deck;
    private Card lastPlayedCard;

    public Turn(Player player, UnoDeck deck, Card lastPlayedCard) {
        this.player = player;
        this.deck = deck;
        this.lastPlayedCard = lastPlayedCard;
    }

    public Player getPlayer() {
        return player;
    }

    public UnoDeck getDeck() {
        return deck;
    }

    public Card getLastPlayedCard(){
        return lastPlayedCard;
    }
}
