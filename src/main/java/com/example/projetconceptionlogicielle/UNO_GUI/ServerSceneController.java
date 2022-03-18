package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Controller for the server scene.
 */
public class ServerSceneController implements IController {
    @FXML
    private Label statusLabel;

    /**
     * Constructor for the Server Scene Controller.
     * This class will be instantiated by the FXML loader automatically.
     */
    public ServerSceneController() {

    }

    /**
     * Controller for the quit button.
     */
    public void quitButtonController(){

    }

    @FXML
    public void changeStatusLabelText(String text){
        String statusText;


        if(statusLabel.getText() != null){
            statusText = statusLabel.getText();
        }else{
            statusText = "";
        }

        statusText = statusText + '\n' + text;
        statusLabel.setText(statusText);
    }


}
