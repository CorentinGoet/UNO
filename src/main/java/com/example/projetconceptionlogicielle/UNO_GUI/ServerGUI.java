package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO_game.GameServer;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

/**
 * Graphical Interface for the Game on the server's side.
 */
public class ServerGUI extends GameGUI implements PropertyChangeListener {
    @FXML
    private Label statusLabel;

    /**
     * Contructor for class ServerGUI
     */
    public ServerGUI() {
        this.setFxmlFile("SceneBuilderResources/serverScene.fxml");
    }

    /**
     * Controller for the quit button.
     */
    public void quitButtonController(){

    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        String newText = ((GameServer) evt.getSource()).getNewText();
        ((ServerSceneController) this.getController()).changeStatusLabelText(newText);
    }



}
