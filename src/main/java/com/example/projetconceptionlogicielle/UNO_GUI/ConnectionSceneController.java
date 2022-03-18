package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO_game.GameClient;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller for the connection scene
 */
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

    /**
     * Controller for the Submit button
     */
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

        if(name.length() != 0 && serverAddress.length() != 0){
            try{
                ClientGUI clientGUI = new ClientGUI();
                GameClient gameClient = new GameClient(clientGUI, name);
                gameClient.connectToServer(serverAddress);
                clientGUI.setup(GameGUI.getClientStage());
                clientGUI.show();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
