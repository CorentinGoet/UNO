package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.fxml.FXML;

/**
 * Controller for the menu scene.
 */
public class MenuSceneController implements IController {

    /**
     * Constructor for the Menu Scene Controller.
     * This class will be instantiated by the FXML loader automatically.
     */
    public MenuSceneController() {
    }

    /**
     * Controller for the start button.
     */
    @FXML
    public void startButtonController(){
        System.out.println("Starting parameters interface ...");
        GameParametersGUI paramGUI = new GameParametersGUI();
        try{
            paramGUI.setup(GameGUI.serverStage);
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
        System.out.println("Starting the Connection interface ...");
        ConnectionGUI connectionGUI = new ConnectionGUI();
        try{
            connectionGUI.setup(GameGUI.clientStage);
            connectionGUI.show();
        }catch(Exception e){
            System.out.println("ERROR WHEN CREATING CONNECTION GUI");
            e.printStackTrace();
        }
    }

    /**
     * Controller for the quit button.
     */
    @FXML
    public void quitButtonController(){
        System.out.println("Quit");
        GameGUI.clientStage.close();
    }
}
