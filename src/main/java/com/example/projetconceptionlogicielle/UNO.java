package com.example.projetconceptionlogicielle;

import com.example.projetconceptionlogicielle.UNO_GUI.MenuGUI;
import com.example.projetconceptionlogicielle.UNO_GUI.oldGameGUI;
import com.example.projetconceptionlogicielle.UNO_game.Game;
import javafx.application.Application;
import javafx.stage.Stage;
import com.example.projetconceptionlogicielle.UNO_GUI.oldMenuGUI;

import java.io.IOException;

public class UNO extends Application {
    private Stage mainStage;
    @Override
    public void start(Stage stage) {
        MenuGUI menu = new MenuGUI();
        mainStage = new Stage();
        try {
            menu.setup(mainStage);
            menu.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }

}
