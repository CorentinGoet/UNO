package com.example.projetconceptionlogicielle.UNO_game;


import java.util.ArrayList;

/**
 * Interface correspondant aux ensembles de cartes (pioche, défausse, main des joueurs ...)
 */
public interface ICardSet {

    /**
     * Fetch the number of cards in the set.
     * @return nbCard
     */
    public int getNbCards();

    /**
     * Returns the cards contained in the set.
     * @return cards (ArrayList<Card>)
     */
    public ArrayList<Card> getCards();

}
