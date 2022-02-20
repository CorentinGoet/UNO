package com.example.projetconceptionlogicielle.UNO_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void chooseCard() {

    }

    @Test
    void hasCard() {
        Card refCard = new Card(Color.red, Value.reverse);
        Card sameCard = new Card(Color.red, Value.reverse);
        Card diffCard = new Card(Color.blue, Value.SEVEN);

        Player player = new Player();
        PlayerHand hand = new PlayerHand();
        hand.addCard(refCard);
        player.setHand(hand);

        assertTrue(player.hasCard(sameCard));
        assertFalse(player.hasCard(diffCard));
    }
}