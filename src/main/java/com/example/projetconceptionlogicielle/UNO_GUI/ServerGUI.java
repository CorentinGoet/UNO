package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.stage.Stage;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

/**
 * Graphical Interface for the Game on the server's side.
 */
public class ServerGUI extends GameGUI implements PropertyChangeListener {

    /**
     * Contructor for class ServerGUI
     */
    public ServerGUI() {
        this.setFxmlFile("SceneBuilderResources/serverScene.fxml");
    }

    /**
     * Controller for the label in charge of displaying the status of the server.
     */
    public void statusLabelController(){

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
