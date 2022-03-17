package com.example.projetconceptionlogicielle.UNO_game;

import com.example.projetconceptionlogicielle.ServeurTCP.IContext;
import com.example.projetconceptionlogicielle.ServeurTCP.ServeurTCP;
import com.example.projetconceptionlogicielle.ServeurTCP.unoConnectionProtocol;
import com.example.projetconceptionlogicielle.ServeurTCP.unoTurnProtocol;
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

    private ServeurTCP connectionServer;
    private ServeurTCP turnServer;

    private GameState state;

    private final PropertyChangeSupport pcSupport;

    /**
     * Constructor for class GameServer.
     * @param serverGUI Graphical interface associated with this server.
     * @param nbPlayers Number of players to connect.
     */
    public GameServer(ServerGUI serverGUI, int nbPlayers) {
        this.serverGUI = serverGUI;
        pcSupport = new PropertyChangeSupport(this);
        deck = new UnoDeck();
        rotation = 1;
        players = new ArrayList<>();
        setupTCPServers();
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
        players.add(new Player(name));
        return players.size();
    }

    /**
     * Instanciates the TCP servers
     */
    private void setupTCPServers() {
        connectionServer = new ServeurTCP(this, new unoConnectionProtocol(),9000);
        turnServer = new ServeurTCP(this, new unoTurnProtocol(), 9001);
    }

    /**
     * Runs the game server
     */
    public void run(){
        connectionServer.start();
    }

    /**
     * Test
     * @param args
     */
    public static void main(String[] args) {
        GameServer game = new GameServer();
        game.run();
    }

}
