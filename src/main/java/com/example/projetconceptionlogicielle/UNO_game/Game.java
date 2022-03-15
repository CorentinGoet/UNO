package com.example.projetconceptionlogicielle.UNO_game;

import com.example.projetconceptionlogicielle.UNO_GUI.oldGameGUI;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe du package UNO correspondant au jeu global.
 */
public class Game {
    private ArrayList<Player> players;
    private UnoDeck deck;
    private int rotation;
    private oldGameGUI gameGui;

    /**
     * Constructor for class game
     */
    public Game() {
        players = new ArrayList<>();
        deck = new UnoDeck();
    }

    /**
     * Adds a player to the game
     * @param player
     */
    public void addPlayer(Player player){
        players.add(player);
    }

    /**
     * Runs the game.
     */
    public void run(){
        Turn turn;
        Player nextPlayer;
        Card lastPlayedCard;
        Random rd = new Random();

        setup();

        lastPlayedCard = deck.draw();
        nextPlayer = players.get(rd.nextInt(0, 4)); // First player is chosen randomly
        while(true){
            turn = new Turn(nextPlayer, deck, lastPlayedCard);
            gameGui.update();
            turn.play();

            lastPlayedCard = turn.getNewCard();
            if(turn.getPlayer().hasWon()){
                System.out.println(turn.getPlayer() + "has won !");
            }
            nextPlayer = findNextPlayer(nextPlayer, lastPlayedCard);
        }

    }

    /**
     * Prepares the game.
     * - builds the deck
     * - gives cards to the players
     */
    private void setup(){
        // Build the deck
        deck.buildDeck();

        // Add players
        for (int i=0; i < 4; i++){
            addPlayer(new Player());
        }

        // Give cards to the players
        for(Player player: players){
            player.draw(deck.draw(7));
        }

        rotation = 1;
    }

    /**
     * Finds the next player.
     * @param previousPlayer Player who played the previous turn
     * @param card Card played during the previous turn
     * @return next player
     */
    private Player findNextPlayer(Player previousPlayer, Card card){
        int playerIndex;

        // check if the direction of play has changed
        if (card.getValue() == Value.reverse){
            rotation *= -1;
        }

        playerIndex = players.indexOf(previousPlayer);
        playerIndex = (playerIndex + rotation) % players.size();

        return players.get(playerIndex);
    }

    public void setGameGui(oldGameGUI gameGui) {
        this.gameGui = gameGui;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
