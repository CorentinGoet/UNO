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
    private Card newCard;

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
     * Returns the card played during this turn.
     * @return {@link Card} played during the turn
     */
    public Card getNewCard() {
        return newCard;
    }



    /**
     * Plays this turn.
     *
     * Depending on the card played the last time,
     * - The player can choose a card to play
     * - The player can draw one or several cards from the deck
     */
    public void play(){
        boolean skipTurn;
        // Take into account last card
        switch(getLastPlayedCard().getValue()){

            case wildDrawFour -> {
                Card wantedCard = new Card(Color.black, Value.wildDrawFour);
                if(!player.hasCard(wantedCard)){
                    skipTurn = true;
                    player.draw(deck.draw(4));
                }
            }
            case drawTwo -> {
                if(!player.hasCardWithValue(Value.drawTwo)){
                    skipTurn = true;
                    player.draw(deck.draw(2));
                }
            }
            default -> {
                // pass
            }
        }

        // The player puts down a card
        Card nextCard;
        while (true){
            nextCard = getPlayer().chooseCard();
            if (nextCard.isValid(getLastPlayedCard())){
                break;
            }else{
                System.out.println("Please choose a valid card");
            }
        }


        // Take into account special effects
        if(nextCard.getColor() == Color.black){
            nextCard.setColor(player.chooseColor());
        }

        // sets the card played during the turn
        newCard = nextCard;

    }
}
