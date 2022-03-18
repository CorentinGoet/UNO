package com.example.projetconceptionlogicielle.UNO_game;

/**
 * Enumeration of the different states for the {@link GameClient}.
 * Part of the State Pattern implementation.
 */
public enum ClientState {
    /**
     * Waiting for other players to connect to the game server.
     */
    WAITING_FOR_CONNECTION,

    /**
     * Waiting for other players to play their turn.
     */
    WAITING_FOR_TURN,

    /**
     * Playing the turn
     */
    PLAYING_TURN,

    /**
     * Game finished, a player has placed all of his cards.
     */
    GAME_END,

}
