package com.example.projetconceptionlogicielle.UNO_game;


import java.util.ArrayList;

/**
 * Interface correspondant aux ensembles de cartes (pioche, défausse, main des joueurs ...)
 */
public interface ICardSet {

    public int getNbCards();
    public ArrayList<Card> getCards();

}
