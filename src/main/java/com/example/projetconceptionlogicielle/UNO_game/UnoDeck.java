package com.example.projetconceptionlogicielle.UNO_game;
/**
 * Classe modélisant le deck du jeu de Uno
 * Le deck contient 108 cartes
 * Pour chaque couleurs il y a une carte de valeur 0, 2 cartes de valeurs 1->9, 2 cartes REVERSE, 2 cartes SKIP, 2 cartes Draw_Two,
 * il y a également 4 cartes Wild et 4 cartes WildDraw_four
 */
public class UnoDeck implements ICardSet{
    private int nbCards;
    private int cards;

    /**
     * Constructor for the class UnoDeck
     */
    public UnoDeck() {

    }

    @Override
    public int getNbCards() {
        return nbCards;
    }

    /**
     * Builds a new deck with for each color:
     * - 1 card with value 0
     * - 2 cards with value 1->9
     * - 2 cards REVERSE
     * - 2 cards SKIP
     * - 2 cards DRAW_TWO
     *
     * There are also 4 cards WILD (change color) and 4 cards WILD_DRAW_FOUR.
     */
    public void buildDeck(){

    }

    /**
     * Remove and return the card from the top of the deck.
     */
    public void draw(){

    }


}
