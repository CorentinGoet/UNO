package com.example.projetconceptionlogicielle;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import com.example.projetconceptionlogicielle.UNO_GUI.MenuGUI;

public class UNO extends Application {

    @Override
    public void start(Stage stage) {
        MenuGUI menu = new MenuGUI();
        menu.init();
        menu.buttonActionSetup(stage, this);
        stage.setTitle("First test");
        stage.setScene(menu.getMenuScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public EventHandler<? super MouseEvent> quitApp() throws Exception {
        System.out.println("quit");
        this.stop();

        return null;
    }

}
