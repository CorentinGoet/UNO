package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Graphical Interface for the main menu of the game.
 */
public class MenuGUI extends GameGUI {



    public MenuGUI() {
        this.setFxmlFile("SceneBuilderResources/menuScene.fxml");
    }

    /**
     * Controller for the start button.
     */
    @FXML
    public void startButtonController(){
        System.out.println("Starting parameters interface ...");

        try{
            GameParametersGUI paramGUI = new GameParametersGUI();
            paramGUI.setup(new Stage());
            paramGUI.show();
        }catch(Exception e){
            System.out.println("ERROR WHEN CREATING PARAMETERS GUI");
            e.printStackTrace();
        }
    }

    /**
     * Controller for the join button.
     */
    @FXML
    public void joinButtonController(){
        System.out.println("Join");
    }

    /**
     * Controller for the quit button.
     */
    @FXML
    public void quitButtonController(){
        System.out.println("Quit");
    }
}
