package com.example.projetconceptionlogicielle.UNO_game;


import java.util.ArrayList;

/**
 *  Classe modélisant un ensemble de cartes correspondant à la main d'un joueur
 */
public class PlayerHand implements ICardSet{
    private int nbCards;
    private ArrayList<Card> cards;

    @Override
    public int getNbCards() {
        return nbCards;
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

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}
