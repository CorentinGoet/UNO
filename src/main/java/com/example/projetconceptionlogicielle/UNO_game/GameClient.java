package com.example.projetconceptionlogicielle.UNO_game;

import com.example.projetconceptionlogicielle.ServeurTCP.ClientTCP;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Class for the game client.
 * This class is part of the observer / observable design pattern implementation (observable part)
 */
public class GameClient  {

    private ClientTCP clientTCP;
    private Player mainPlayer;

    public GameClient() {
        this.clientTCP = new ClientTCP("localhost", 9000);
        this.mainPlayer = new Player();
    }

    /**
     * Connects this client to the {@link GameServer} server.
     */
    public void connectToServer(){
        clientTCP.connecterAuServeur();
        String retour = clientTCP.transmettreChaine("test");
        System.out.println(retour);
        clientTCP.deconnecterDuServeur();
    }

    public void test(){

    }

    public static void main(String[] args) {
        GameClient game = new GameClient();
        game.test();
    }
}
