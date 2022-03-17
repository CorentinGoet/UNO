package com.example.projetconceptionlogicielle;

import com.example.projetconceptionlogicielle.UNO_GUI.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class UNO extends Application {

    @Override
    public void start(Stage mainStage) {
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
