package com.example.projetconceptionlogicielle.UNO_game;

import java.util.ArrayList;

/**
 * Classe correspondant à l'état actuel du jeu (un tour).
 */
public class Turn {
    private Player player;
    private UnoDeck deck;
    private Card lastPlayedCard;
    private ArrayList<Effect> effects;

    /**
     * Constructor for class Turn
     * @param player {@link Player} who will play this turn
     * @param deck {@link UnoDeck} for the player to draw from
     * @param lastPlayedCard {@link Card} played during the last turn
     * @param effects Special {@link Effect} caused by the previous turn
     */
    public Turn(Player player, UnoDeck deck, Card lastPlayedCard, ArrayList<Effect> effects) {
        this.player = player;
        this.deck = deck;
        this.lastPlayedCard = lastPlayedCard;
        this.effects = effects;
    }

    /**
     * Returns the player of this turn
     * @return {@link Player}
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns the current Deck of the game
     * @return {@link UnoDeck}
     */
    public UnoDeck getDeck() {
        return deck;
    }

    /**
     * Returns the card played during the previous turn.
     * @return {@link Card}
     */
    public Card getLastPlayedCard(){
        return lastPlayedCard;
    }

    /**
     * Plays this turn.
     *
     * Depending on the card played the last time,
     * - The player can choose a card to play
     * - The player can draw one or several cards from the deck
     */
    public void play(){

        // Take into account last card
        switch(getLastPlayedCard().getValue()){
            case wildDrawFour -> {
                // TODO: Player draws 4 cards if he doesnt have a wild_draw4
            }
            case drawTwo -> {
                // TODO: Player draws 2 cards if he doesnt have a draw2
            }
            default -> {
                // pass
            }
        }

        // The player puts down a card
        while (true){
            Card nextCard = getPlayer().chooseCard();
            if (nextCard.isValid(getLastPlayedCard())){
                break;
            }else{
                System.out.println("Please choose a valid card");
            }
        }

    }
}
