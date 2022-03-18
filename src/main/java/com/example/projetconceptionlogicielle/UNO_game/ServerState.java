package com.example.projetconceptionlogicielle.UNO_game;

/**
 * Enumeration of the different possible States for the {@link GameServer}.
 * Part of the State Pattern implementation.
 */
public enum ServerState {
    /**
     * Initial state of the game, waiting for the different players to connect to the server.
     */
    WAITING_FOR_CONNECTION ,

    /**
     * Setting up the game.
     */
    GAME_SETUP,

    /**
     * Waiting for the player to choose what to do with their turn.
     */
    WAITING_FOR_PLAYER_CHOICE,

    /**
     * A player has won, the game will stop
     */
    GAME_END,
}
