package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConnectionSceneController implements IController{
    @FXML
    Label infoLabel;
    @FXML
    TextField serverTextField;
    @FXML
    TextField nameTextField;

    private String name;
    private String serverAddress;

    /**
     * Constructor for the Connection scene.
     * This class is instantiated automatically by the FXML loader.
     */
    public ConnectionSceneController() {
    }

    @FXML
    public void submitButtonController(){
        name = nameTextField.getText();
        if(name.length() == 0){
            infoLabel.setText("Enter your name");
        }
        serverAddress = serverTextField.getText();
        if(serverAddress.length() == 0){
            infoLabel.setText("Enter the server address");
        }

    }
}
