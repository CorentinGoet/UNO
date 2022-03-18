package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO_game.GameServer;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

/**
 * Controller for the Game Parameters scene
 */
public class ParametersSceneController implements IController{
    private int nbPlayer;
    @FXML
    private ChoiceBox<Integer> nbPlayersChoiceBox;
    @FXML
    private void initialize(){
        nbPlayersChoiceBox.setItems(FXCollections.observableArrayList(2, 3, 4));
    }

    /**
     * Constructor for the game parameter scene controller
     * This class is instantiated automatically by the FXML Loader.
     */
    public ParametersSceneController() {
    }

    /**
     * Controller for the ok button.
     */
    @FXML
    public void okButtonController(){
        System.out.println("OK button pressed");

        // check for modification
        this.nbPlayersChoiceBoxController();

        if(this.nbPlayersChoiceBox.getValue() != null){
            ServerGUI serverGUI = new ServerGUI();
            GameServer gameServer = new GameServer(serverGUI, nbPlayer);
            gameServer.run();

        }
    }

    /**
     * Controller for the Back button.
     */
    @FXML
    public void backButtonController(){
        System.out.println("BACK");
        GameGUI.getServerStage().close();
    }

    /**
     * Controller for the Choice Box in charge of the number of players.
     */
    @FXML
    public void nbPlayersChoiceBoxController(){
        if (nbPlayersChoiceBox.getValue() != null){
            this.nbPlayer = nbPlayersChoiceBox.getValue();
            System.out.println("nbPlayer Choice box changed to " + this.nbPlayer);
        }
    }
}
