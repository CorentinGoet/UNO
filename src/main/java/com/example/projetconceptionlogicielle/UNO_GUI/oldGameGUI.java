package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO_game.oldGame;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

/**
 * This class is the GUI for the game
 */
public class oldGameGUI {
    private Scene scene;
    private oldGame game;
    private VBox middleContainer;
    private VBox playerVBox;
    private ArrayList<Label> playerLabels;
    private HBox cardsContainer;

    public oldGameGUI() {
    }

    public Scene getScene() {
        return scene;
    }

    /**
     * This method builds the GUI for the game
     */
    public void setup(){
        GridPane backgroundGrid;

        backgroundGrid = new GridPane();
        backgroundGrid.setPrefSize(800, 600);

        backgroundGrid.setAlignment(Pos.CENTER);
        backgroundGrid.setPadding(new Insets(0, 20, 20,20));

        // middle of the window - deck + last played card
        middleContainer = new VBox();
        middleContainer.setAlignment(Pos.CENTER);
        Label midLabel = new Label();
        midLabel.setText("Middle");
        middleContainer.getChildren().add(midLabel);


        // Main player container
        playerVBox = new VBox();
        playerVBox.setAlignment(Pos.CENTER);
        playerVBox.getChildren().add(new Label("Main player"));
        cardsContainer = new HBox();
        playerVBox.getChildren().add(cardsContainer);


        // Other player containers
        playerLabels = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            Label player = new Label();
            player.setText("Player " + i);
            playerLabels.add(player);
        }


        // add the containers to the background grid container
        GridPane.setConstraints(playerLabels.get(0), 1, 0);
        GridPane.setConstraints(playerLabels.get(1), 0, 1);
        GridPane.setConstraints(playerLabels.get(2), 2, 1);

        backgroundGrid.getChildren().addAll(playerLabels);

        GridPane.setConstraints(playerVBox, 1, 2);
        backgroundGrid.getChildren().add(playerVBox);

        GridPane.setConstraints(middleContainer, 1, 1);
        backgroundGrid.getChildren().add(middleContainer);

        scene = new Scene(backgroundGrid);
    }

    public VBox getMiddleContainer() {
        return middleContainer;
    }

    public VBox getPlayerVBox() {
        return playerVBox;
    }

    public ArrayList<Label> getPlayerLabels() {
        return playerLabels;
    }

    /**
     * Updates the game GUI at the beginning of a turn.
     */
    public void update(){
        int i=0;

        System.out.println(cardsContainer.getChildren());
        cardsContainer.getChildren().clear();
        System.out.println(cardsContainer.getChildren());
        cardsContainer.getChildren().addAll(game.getPlayers().get(3).getHand().getCards());
        System.out.println(cardsContainer.getChildren());
    }

    public void setGame(oldGame game) {
        this.game = game;
    }
}
