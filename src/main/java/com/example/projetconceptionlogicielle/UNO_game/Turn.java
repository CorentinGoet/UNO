package com.example.projetconceptionlogicielle.UNO_game;

/**
 * Classe correspondant à l'état actuel du jeu (un tour).
 */
public class Turn {
    private Player player;
    private UnoDeck deck;

    public Turn(Player player, UnoDeck deck) {
        this.player = player;
        this.deck = deck;
    }

    public Player getPlayer() {
        return player;
    }

    public UnoDeck getDeck() {
        return deck;
    }
}
