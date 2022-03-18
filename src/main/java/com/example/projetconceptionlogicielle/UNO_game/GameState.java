package com.example.projetconceptionlogicielle.UNO_game;

public enum GameState {
    /**
     * Initial state of the game, waiting for the different players to connect to the server.
     */
    WAITING_FOR_CONNECTION,

    /**
     * The game is ready to start.
     */
    GAME_START,

    /**
     * A player has won, the game will stop
     */
    GAME_END,

    WAITING_FOR_PLAYER_CHOICE,

}
