package com.example.projetconceptionlogicielle.UNO_game;

import com.example.projetconceptionlogicielle.ServeurTCP.IContext;
import com.example.projetconceptionlogicielle.ServeurTCP.ServeurTCP;
import com.example.projetconceptionlogicielle.ServeurTCP.unoConnectionProtocol;
import com.example.projetconceptionlogicielle.ServeurTCP.unoTurnProtocol;
import com.example.projetconceptionlogicielle.UNO_GUI.GameGUI;
import com.example.projetconceptionlogicielle.UNO_GUI.ServerGUI;

import java.util.ArrayList;
import java.beans.PropertyChangeSupport;

/**
 * Class for the game server.
 * It implements 2 design patterns: Observer/Observable (this class is the observable) and State.
 */
public class GameServer implements IContext{
    private ServerGUI serverGUI;
    private ArrayList<Player> players;
    private UnoDeck deck;
    private int rotation;
    private int nbPlayers;
    private int nbConnectedPlayers;

    private ServeurTCP connectionServer;
    private ServeurTCP turnServer;

    private GameState state;

    private final PropertyChangeSupport pcSupport;
    private String guiText;

    /**
     * Constructor for class GameServer.
     * @param serverGUI Graphical interface associated with this server.
     * @param nbPlayers Number of players to connect.
     */
    public GameServer(ServerGUI serverGUI, int nbPlayers) {

        pcSupport = new PropertyChangeSupport(this);
        setupGUI(serverGUI);
        deck = new UnoDeck();
        rotation = 1;
        players = new ArrayList<>();
        setupTCPServers();
        this.nbPlayers = nbPlayers;
        nbConnectedPlayers = 0;
    }

    /**
     * Method called by the constructor to set up the GUI.
     * @param
     */
    private void setupGUI(ServerGUI serverGUI){
        this.serverGUI = serverGUI;
        pcSupport.addPropertyChangeListener(serverGUI);
        try{
            this.serverGUI.setup(GameGUI.getServerStage());
            this.serverGUI.show();
        }catch(Exception e){
            System.out.println("ERROR WHEN CREATING THE SERVER GUI");
        }

        addText("Server Connected to GUI ...");
    }

    /**
     * Test constructor, should not be used for final produt
     */
    public GameServer() {
        setupTCPServers();
        pcSupport = new PropertyChangeSupport(this);
    }

    /**
     * Adds a player to the game. Called from {@link unoConnectionProtocol}
     * @param name Name of the new player
     * @return index of the new player
     */
    public int addPlayer(String name){
        if(state != GameState.WAITING_FOR_CONNECTION){
            return -1;
        }
        players.add(new Player(name));
        this.nbConnectedPlayers += 1;
        return players.size();
    }

    /**
     * Instanciates the TCP servers
     */
    private void setupTCPServers() {
        connectionServer = new ServeurTCP(this, new unoConnectionProtocol(),9000);
        turnServer = new ServeurTCP(this, new unoTurnProtocol(), 9001);

        addText("TCP server started ...");
        addText("Waiting for " + nbPlayers + "players to start.");
    }

    /**
     * Runs the game server
     */
    public void run(){

        switch (state) {
            case WAITING_FOR_CONNECTION -> {
                runWaitingForConnection();
            }
            case GAME_START -> {

            }


        }

        connectionServer.start();
    }



    /**
     * This method is the servers run method while some players are not connected yet.
     *
     * This method is a part of the state design pattern implementation.
     * This method is called when the {@link GameState} is WAINTING_FOR_CONNECTION
     */
    private void runWaitingForConnection() {
        // check if change is needed in
        if(nbConnectedPlayers == nbPlayers){
            state = GameState.GAME_START;
            return;
        }
    }



    /**
     * Test
     * @param args
     */
    public static void main(String[] args) {
        GameServer game = new GameServer();
        game.run();
    }

    /**
     * Adds the given text to the GUI label.
     * Works with the getNewText method in the Observer/Observable pattern.
     * @param text Text to be added.
     */
    private void addText(String text){
        guiText = text;
        pcSupport.firePropertyChange("guiText", "old", "new");
    }

    /**
     * Getter for guiText.
     * @return text to be added to the gui.
     */
    public String getNewText(){
        return guiText;
    }
}
