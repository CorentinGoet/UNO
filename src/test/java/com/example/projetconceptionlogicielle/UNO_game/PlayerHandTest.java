package com.example.projetconceptionlogicielle.UNO_game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerHandTest {

    @Test
    void getNbCards() {
        PlayerHand hand = new PlayerHand();
        assertEquals(0, hand.getNbCards());
    }

    @Test
    void getCards() {
        PlayerHand hand = new PlayerHand();
        Card testCard = new Card(Color.blue, Value.ZERO);
        hand.addCard(testCard);
        assertEquals(testCard, hand.getCards().get(0));
    }

    @Test
    void chooseCard(){
        PlayerHand hand = new PlayerHand();
        Card testCard = new Card(Color.red, Value.ONE);
        hand.addCard(new Card(Color.green, Value.SEVEN));
        hand.addCard(testCard);
        hand.addCard(new Card(Color.yellow, Value.drawTwo));

        assertEquals(testCard, hand.chooseCard(1));
    }


}