package com.example.projetconceptionlogicielle;

import com.example.projetconceptionlogicielle.UNO_GUI.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class UNO extends Application {
    private Stage mainStage;
    private Stage secondaryStage;
    @Override
    public void start(Stage stage) {

        // Stages manipulation
        mainStage = stage;
        mainStage.setTitle("UNO - Client");
        secondaryStage = new Stage();
        secondaryStage.setTitle("UNO - Server");
        GameGUI.setClientStage(mainStage);
        GameGUI.setServerStage(secondaryStage);

        // Start the first scene
        MenuGUI menu = new MenuGUI();
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
