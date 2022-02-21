package com.example.projetconceptionlogicielle;

import com.example.projetconceptionlogicielle.UNO_game.Game;
import javafx.application.Application;
import javafx.stage.Stage;
import com.example.projetconceptionlogicielle.UNO_GUI.MenuGUI;

public class UNO extends Application {

    @Override
    public void start(Stage stage) {
        // main variables
        MenuGUI menu = new MenuGUI();
        Game game = new Game();


        menu.init();
        menu.buttonActionSetup(stage, this);

        stage.setTitle("UNO Game");
        stage.setScene(menu.getMenuScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
