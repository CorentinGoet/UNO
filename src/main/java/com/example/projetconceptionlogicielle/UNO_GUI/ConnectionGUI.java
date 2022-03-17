package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConnectionGUI extends GameGUI{
    @FXML
    Label infoLabel;
    @FXML
    TextField serverTextField;
    @FXML
    TextField nameTextField;

    private String name;
    private String serverAddress;
    /**
     * Constructor for class ConnectionGUI
     */
    public ConnectionGUI() {
        this.setFxmlFile("SceneBuilderResources/connectionScene.fxml");
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
