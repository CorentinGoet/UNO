package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller for the client scene.
 */
public class ClientSceneController implements IController{
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
     * Constructor for client scene controller
     * This class is instantiated automatically by the FXML loader.
     */
    public ClientSceneController() {
    }

    /**
     * Controller for the rectangle containing the deck.
     */
    @FXML
    public void deckRectangleController(){
        middleInfoLabel.setText("deck clicked !");

    }

    /**
     * Changes the text from the label on the bottom left of the scene.
     * Used for info showed to this player only.
     */
    public void changePlayerInfoText(String newText){
        bottomLeftInfoLabel.setText(newText);
    }

    /**
     * Changes the text from the label on the bottom left of the scene.
     * Used for info showed to all players.
     */
    public void changeGlobalInfoText(String newText){
        bottomLeftInfoLabel.setText(newText);
    }

    /**
     * Controller for the cards choice.
     * @param e
     */
    @FXML
    public void cardClicked(MouseEvent e){
        Node origin = (Node) e.getSource();
        System.out.println("card clicked " + origin.getId());
    }
}
