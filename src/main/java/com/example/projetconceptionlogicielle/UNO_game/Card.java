package com.example.projetconceptionlogicielle.UNO_game;

/**
 * Classe modélisant une carte à jouer.
 */
public class Card {
    private Color color;
    private Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    /**
     * Checks wether this card can be placed on another card or not.
     * @param previousCard Card already placed
     * @return True if the Card can be placed on the previous one.
     */
    public boolean isValid(Card previousCard){
        return this.getColor() == Color.black ||
                this.getColor() == previousCard.getColor() ||
                this.getValue() == previousCard.getValue();
    }
}
