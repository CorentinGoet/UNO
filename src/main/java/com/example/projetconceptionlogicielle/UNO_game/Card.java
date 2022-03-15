package com.example.projetconceptionlogicielle.UNO_game;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 * Classe modélisant une carte à jouer.
 */
public class Card extends Rectangle {
    private Color color;
    private Value value;

    /**
     * Constructor for class Card.
     * @param color {@link Color} of the card
     * @param value {@link Value} of the card
     */
    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
        String img_path = "/com/example/projetconceptionlogicielle/img_cards/"
                + value.toString().toLowerCase() + "_"
                + color.toString().toLowerCase() + ".png";
        this.setFill(new ImagePattern(new Image(getClass().getResourceAsStream(img_path))));
    }

    /**
     * Returns the {@link Color} of the Card.
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the {@link Color} of the Card to the specified value.
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Returns the {@link Value} of the Card.
     * @return value
     */
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

    @Override
    /**
     * This redefinition of equals enables the use of built-in methods on ArrayLists of cards like Contains
     * (see {@link Player}.hasCard)
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getColor() != card.getColor()) return false;
        return getValue() == card.getValue();
    }

    @Override
    public int hashCode() {
        int result = getColor().hashCode();
        result = 31 * result + getValue().hashCode();
        return result;
    }
}
