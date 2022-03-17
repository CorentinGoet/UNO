package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Graphical Interface for the Game on the client's side.
 */
public class ClientGUI extends GameGUI{

    // Middle pane
    @FXML
    private Label middleInfoLabel;
    @FXML
    private Rectangle lastCardRectangle;

    // bottom left pane
    @FXML
    private Label bottomLeftInfoLabel;

    // left pane
    @FXML
    private Label leftNameLabel;
    @FXML
    private Label leftNbCardLabel;

    // top pane
    @FXML
    private Label topNameLabel;
    @FXML
    private Label topNbCardLabel;

    // right pane
    @FXML
    private Label rightNameLabel;
    @FXML
    private Label rightNbCardLabel;

    // bottom pane
    @FXML
    private GridPane playerHandGridPane;

    /**
     * Constructor for class ClientGUI
     */
    public ClientGUI() {
        this.setFxmlFile("SceneBuilderResources/clientScene.fxml");

    }

    /**
     * Controller for the rectangle containing the deck.
     */
    @FXML
    public void deckRectangleController(){
        middleInfoLabel.setText("deck clicked !");

    }

    @Override
    public void setup(Stage stage) throws IOException {
        super.setup(stage);

    }

    @FXML
    public void cardClicked(MouseEvent e){
        Node origin = (Node) e.getSource();
        System.out.println("card clicked " + origin.getId());
    }

}
