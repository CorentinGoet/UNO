package com.example.projetconceptionlogicielle;

import com.example.projetconceptionlogicielle.UNO_GUI.GameParametersGUI;
import com.example.projetconceptionlogicielle.UNO_GUI.MenuGUI;
import com.example.projetconceptionlogicielle.UNO_GUI.oldGameGUI;
import com.example.projetconceptionlogicielle.UNO_game.Game;
import javafx.application.Application;
import javafx.stage.Stage;
import com.example.projetconceptionlogicielle.UNO_GUI.oldMenuGUI;

import java.io.IOException;

public class UNO extends Application {

    @Override
    public void start(Stage mainStage) {
        MenuGUI menu = new MenuGUI();
        GameParametersGUI param = new GameParametersGUI();

        try {
            param.setup(mainStage);
            param.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }

}
