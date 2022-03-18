package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO_game.GameServer;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Graphical Interface for the choice of parameters of the game.
 * Implements the Observer/Observable pattern with {@link GameServer}
 */
public class GameParametersGUI extends GameGUI {


    /**
     * Constructor for GameParameter class.
     */
    public GameParametersGUI() {
        this.setFxmlFile("SceneBuilderResources/gameParametersScene.fxml");
    }



}
