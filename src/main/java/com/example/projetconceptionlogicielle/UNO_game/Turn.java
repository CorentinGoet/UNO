package com.example.projetconceptionlogicielle.UNO_game;

import java.util.ArrayList;

/**
 * Classe correspondant à l'état actuel du jeu (un tour).
 */
public class Turn {
    private Player player;
    private UnoDeck deck;
    private Card lastPlayedCard;
    private ArrayList<Effect> effects;

    public Turn(Player player, UnoDeck deck, Card lastPlayedCard, ArrayList<Effect> effects) {
        this.player = player;
        this.deck = deck;
        this.lastPlayedCard = lastPlayedCard;
        this.effects = effects;
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

    /**
     * Plays this turn.
     *
     * Depending on the card played the last time,
     * - The player can choose a card to play
     * - The player can draw one or several cards from the deck
     */
    public void play(){
        Card nextCard;


    }
}
