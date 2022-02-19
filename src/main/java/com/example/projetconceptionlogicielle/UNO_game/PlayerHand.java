package com.example.projetconceptionlogicielle.UNO_game;


import java.util.ArrayList;

/**
 *  Classe modélisant un ensemble de cartes correspondant à la main d'un joueur
 */
public class PlayerHand implements ICardSet{

    private ArrayList<Card> cards;

    /**
     * Constructor for class PlayerHand.
     */
    public PlayerHand() {
        cards = new ArrayList<>();
    }

    @Override
    public int getNbCards() {
        return cards.size();
    }

    @Override
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Method used to select and return a card from the player's hand.
     * @param choice index of chosen card
     * @return chosen card (Card)
     */
    public Card chooseCard(int choice){
        Card chosenCard = getCards().get(choice);
        cards.remove(choice);
        return chosenCard;
    }

    /**
     * Adds the given {@link Card} to the list of cards.
     * @param card {@link Card} to be added
     */
    public void addCard(Card card) {
        cards.add(card);
    }

}
