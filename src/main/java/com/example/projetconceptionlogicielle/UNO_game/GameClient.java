package com.example.projetconceptionlogicielle.UNO_game;

import com.example.projetconceptionlogicielle.ServeurTCP.ClientTCP;
import com.example.projetconceptionlogicielle.UNO_GUI.ClientGUI;
import com.example.projetconceptionlogicielle.UNO_GUI.GameGUI;
import javafx.stage.Stage;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;

/**
 * Class for the game client.
 * This class is part of the observer / observable design pattern implementation (observable part)
 * Observable for {@link ClientGUI}
 */
public class GameClient  {

    private ClientTCP clientTCP;
    private Player mainPlayer;
    private final PropertyChangeSupport pcSupport;
    private String serverAddress;
    private ClientState state;

    public GameClient(ClientGUI clientGUI, String name) {
        this.mainPlayer = new Player(name);
        pcSupport = new PropertyChangeSupport(this);
        this.pcSupport.addPropertyChangeListener(clientGUI);
    }

    /**
     * Connects this client to the {@link GameServer} server.
     */
    public void connectToServer(String serverAdress){

        this.clientTCP = new ClientTCP(serverAdress, 9000);
        clientTCP.connecterAuServeur();
        String returnValue = clientTCP.transmettreChaine(mainPlayer.getName());
        System.out.println("Connected to server with id " + returnValue);
        mainPlayer.setId(Integer.parseInt(returnValue));
        clientTCP.deconnecterDuServeur();
    }

    /**
     * Main method for the execution of the client.
     */
    public void run(){
        switch(state){
            case WAITING_FOR_CONNECTION -> {
                runWaitForConnection();
            }
        }

    }

    private void runWaitForConnection() {
        changeGlobalInfo("The game is waiting for players !");

    }


    public static void main(String[] args) {
        oldGame myGame = new oldGame();
        Player myPlayer = new Player();
        UnoDeck myDeck = new UnoDeck();
        //GameClient game = new GameClient();
        //game.connectToServer();
        ClientGUI monClientGUI= new ClientGUI();
        try {
            monClientGUI.setup(GameGUI.getClientStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        monClientGUI.show();
        //On lance notre interface graphique, comme on le ferait avec
        //une méthode initGUI

        System.out.println("attente de l'interface graphique");
        //A ajouter les cartes, les joueurs avec leur nombre

    }

    private void changePlayerInfo(String newText){
        pcSupport.firePropertyChange("playerInfo", "", newText);
    }

    private void changeGlobalInfo(String newText){
        pcSupport.firePropertyChange("globalInfo", "", newText);
    }

    /**
     * Sends the info about the turn played to the server.
     */
    private void sendTurnToServer(){

    }


}
