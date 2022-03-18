package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO_game.GameClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

/**
 * Graphical Interface for the Game on the client's side.
 * Observer of {@link com.example.projetconceptionlogicielle.UNO_game.GameClient}
 */
public class ClientGUI extends GameGUI implements PropertyChangeListener {


    /**
     * Constructor for class ClientGUI
     */
    public ClientGUI() {
        this.setFxmlFile("SceneBuilderResources/clientScene.fxml");

    }



    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch(evt.getPropertyName()){

        }
    }
}
