package com.example.projetconceptionlogicielle.UNO_game;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents the Deck that players will draw from, it contains {@link Card}
 */
public class UnoDeck implements ICardSet{
    private int nbCards;
    private ArrayList<Card> cards;


    /**
     * Constructor for the class UnoDeck
     */
    public UnoDeck() {
        this.nbCards = 0;
        this.cards = new ArrayList<>();
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

        for(Color color: Color.values()){
            if(color == Color.black){
                // The black cards will be added with the other colors
                continue;
            }
            for(Value value: Value.values()){
                Card newCard;
                switch (value) {
                    case ZERO -> {
                        // Only one card of each color with value 0
                        newCard = new Card(color, value);
                        cards.add(newCard);
                        nbCards += 1;
                    }
                    case wildDrawFour, wildDraw -> {
                        // 4 cards of each special value need to be added to the deck (One with each color)
                        newCard = new Card(Color.black, value);
                        cards.add(newCard);
                        nbCards += 1;
                    }
                    default -> {
                        // The other cards need to be added twice
                        newCard = new Card(color, value);
                        cards.add(newCard);
                        cards.add(newCard);
                        nbCards += 2;
                    }
                }

            }
        }
        // Shuffles randomly the deck
        Collections.shuffle(cards);
    }

    /**
     * Remove and return the card from the top of the deck.
     * @return First {@link Card} of the deck
     */
    public Card draw(){
        int ind = cards.size() - 1;
        Card topCard = cards.get(ind);
        cards.remove(ind);
        nbCards -= 1;
        return topCard;
    }

    /**
     * Removes and returns a specified number of cards from the top of the deck.
     * @param number Number of {@link Card} to draw
     * @return ArrayList of Cards drawn from the deck
     */
    public ArrayList<Card> draw(int number){
        ArrayList drawnCards = new ArrayList<>();
        for(int i=0; i<number; i++){
            drawnCards.add(draw());
        }
        return drawnCards;
    }

    @Override
    public String toString() {
        String res = "Uno Deck:\n";
        res += " * Nb cards: " + nbCards + "\n";
        res += " * Content: \n";
        for (Card card: cards){
            res += card.getValue() + " " + card.getColor() + " | ";
        }
        return res;
    }

    /**
     * Returns the Card lists of the deck.
     * @return ArrayList of {@link Card}
     */
    public ArrayList<Card> getCards() {
        return cards;
    }
}
