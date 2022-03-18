package com.example.projetconceptionlogicielle.UNO_game;

import com.example.projetconceptionlogicielle.ServeurTCP.ClientTCP;
import com.example.projetconceptionlogicielle.UNO_GUI.ClientGUI;
import com.example.projetconceptionlogicielle.UNO_GUI.GameGUI;
import javafx.stage.Stage;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

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
        oldGame myGame = new oldGame();
        Player myPlayer = new Player();
        UnoDeck myDeck = new UnoDeck();
        GameClient game = new GameClient();
        game.connectToServer();
        ClientGUI monClientGUI= new ClientGUI();
        try {
            monClientGUI.setup(GameGUI.clientStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        monClientGUI.show();
        //On lance notre interface graphique, comme on le ferait avec
        //une méthode initGUI

        System.out.println("attente de l'interface graphique");
        //A ajouter les cartes, les joueurs avec leur nombre

    }
}
