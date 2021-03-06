package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO_game.oldGame;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Cette classe correspond à l'interface graphique du menu.
 */
public class oldMenuGUI{
    private VBox backgroundVBox;
    private Label titleLabel;
    private Label welcomeTextLabel;
    private HBox buttonHBox;
    private Button quitButton;
    private Button helpButton;
    private Button playButton;
    private Scene menuScene;
    private Application app;
    private Stage window;

    public oldMenuGUI() {

    }

    /**
     * Cette méthode initialise l'interface du menu en construisant les différents objets qui la constituent.
     */
    public void init() {

       // Conteneur global de la scène
        backgroundVBox = new VBox();
        backgroundVBox.setAlignment(Pos.CENTER);
        backgroundVBox.setFillWidth(true);
        backgroundVBox.setSpacing(20);
        backgroundVBox.setPadding(new Insets(0, 20, 20,20));

        // Zone de texte correspondant au titre
        titleLabel = new Label();
        titleLabel.setText("UNO");
        titleLabel.setFont(new Font("Impact", 70));

        // Zone de texte correspondant au texte d'acueil du menu
        welcomeTextLabel = new Label();
        welcomeTextLabel.setText("Bienvenue dans le jeu de UNO");

        // Bouton quitter
        quitButton = new Button();
        quitButton.setText("Quitter");

        // Bouton aide
        helpButton = new Button();
        helpButton.setText("Aide");

        // Bouton jouer
        playButton = new Button();
        playButton.setText("Jouer");

        // Conteneur des boutons
        buttonHBox = new HBox();
        buttonHBox.getChildren().addAll(quitButton, helpButton, playButton);
        buttonHBox.setAlignment(Pos.CENTER);
        buttonHBox.setSpacing(30);


        backgroundVBox.getChildren().addAll(titleLabel, welcomeTextLabel, buttonHBox);

        // Scene
        menuScene = new Scene(backgroundVBox);

    }

    public Scene getMenuScene() {
        return menuScene;
    }

    public void setApp(Application application){
        this.app = application;
    }

    /**
     * Méthode appelée en cas d'appui sur le bouton quitter.
     */
    protected void onQuitButtonClick() throws Exception {
        window.close();
        app.stop();
    }

    /**
     * Méthode appelée en cas d'appui sur le bouton aide
     */
    protected void onHelpButtonClicked(){

    }

    /**
     * Méthode appelée en cas d'appui sur le bouton jouer
     */
    protected void onPlayButtonClick(oldGame game, oldGameGUI gameGUI){
        gameGUI.setup();
        window.setScene(gameGUI.getScene());
        game.run();
    }

    /**
     * Associe chaque bouton à la méthode correspondante.
     */
    public void buttonActionSetup(Stage window, Application app, oldGame game, oldGameGUI gameGUI){
        this.window = window;
        this.app = app;

        helpButton.setOnAction(ActionEvent -> onHelpButtonClicked());
        playButton.setOnAction(ActionEvent -> onPlayButtonClick(game, gameGUI));
        quitButton.setOnAction(ActionEvent -> {
            try {
                onQuitButtonClick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


}
