package com.example.projetconceptionlogicielle.UNO_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnoDeckTest {

    @Test
    void getNbCards() {
        UnoDeck deck = new UnoDeck();
        assertEquals(0, deck.getNbCards());
    }

    @Test
    void buildDeck() {
        UnoDeck deck = new UnoDeck();
        deck.buildDeck();
        assertEquals(108, deck.getNbCards());
        System.out.println("Test UnoDeck:" + deck.toString());
    }

    @Test
    void draw() {
        UnoDeck deck = new UnoDeck();
        deck.buildDeck();
        assertEquals(deck.getCards().get(deck.getNbCards() -1), deck.draw());
    }

}