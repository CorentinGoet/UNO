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
}