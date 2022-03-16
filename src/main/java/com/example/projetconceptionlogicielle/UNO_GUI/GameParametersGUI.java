package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Graphical Interface for the choice of parameters of the game.
 */
public class GameParametersGUI extends GameGUI {

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
        System.out.println("OK");
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
    public void nbPlayerChoiceBoxController(){
        System.out.println("nbPlayer Choice box");
    }
}
