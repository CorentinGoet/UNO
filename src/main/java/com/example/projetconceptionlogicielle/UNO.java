package com.example.projetconceptionlogicielle;

import com.example.projetconceptionlogicielle.UNO_GUI.oldGameGUI;
import com.example.projetconceptionlogicielle.UNO_game.Game;
import javafx.application.Application;
import javafx.stage.Stage;
import com.example.projetconceptionlogicielle.UNO_GUI.oldMenuGUI;

public class UNO extends Application {

    @Override
    public void start(Stage stage) {
        // main variables
        oldMenuGUI menu = new oldMenuGUI();
        Game game = new Game();
        oldGameGUI gameGUI = new oldGameGUI();

        game.setGameGui(gameGUI);
        gameGUI.setGame(game);

        menu.init();
        menu.buttonActionSetup(stage, this, game, gameGUI);

        stage.setTitle("UNO Game");
        stage.setScene(menu.getMenuScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
