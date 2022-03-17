package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Graphical Interface for the choice of parameters of the game.
 */
public class GameParametersGUI extends GameGUI {
    private int nbPlayer;
    @FXML
    private ChoiceBox<Integer> nbPlayersChoiceBox;
    @FXML
    private void initialize(){
        nbPlayersChoiceBox.setItems(FXCollections.observableArrayList(2, 3, 4));
    }

    /**
     * Constructor for GameParameter class.
     */
    public GameParametersGUI() {
        this.setFxmlFile("SceneBuilderResources/gameParametersScene.fxml");
    }

    /**
     * Controller for the ok button.
     */
    @FXML
    public void okButtonController(){
        System.out.println("OK button pressed");
        ServerGUI serverGUI = new ServerGUI();

        // check for modification
        this.nbPlayersChoiceBoxController();

        if(this.nbPlayersChoiceBox.getValue() != null){
            try{
                serverGUI.setup(GameGUI.serverStage);
                serverGUI.show();
            }catch(Exception e){
                System.out.println("ERROR WHEN CREATING SERVER GUI");
                e.printStackTrace();
            }
        }
    }

    /**
     * Controller for the Back button.
     */
    @FXML
    public void backButtonController(){
        System.out.println("BACK");
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

    @Override
    public void setup(Stage stage) throws IOException {
        super.setup(stage);
    }
}
