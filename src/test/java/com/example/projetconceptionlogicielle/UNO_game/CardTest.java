package com.example.projetconceptionlogicielle.UNO_game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void getColor() {
        Color color = Color.blue;
        Value value = Value.FOUR;
        Card card = new Card(color, value);
        assertEquals(color, card.getColor());
    }

    @Test
    void getValue() {
        Color color = Color.blue;
        Value value = Value.FOUR;
        Card card = new Card(color, value);
        assertEquals(value, card.getValue());
    }

    @Test
    void isValid() {
        Card refCard = new Card(Color.blue, Value.ONE);
        assertTrue(refCard.isValid(new Card(Color.blue, Value.EIGHT))); // Another blue card can be placed on this one
        assertTrue(refCard.isValid(new Card(Color.red, Value.ONE)));    // Another card with value One can be placed
        assertFalse(refCard.isValid(new Card(Color.yellow, Value.ZERO)));   // A card with different value and color cannot be placed

        Card specialCard = new Card(Color.black, Value.wildDrawFour);
        assertTrue(specialCard.isValid(refCard));
    }
}