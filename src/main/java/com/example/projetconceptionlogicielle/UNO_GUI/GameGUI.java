package com.example.projetconceptionlogicielle.UNO_GUI;

import com.example.projetconceptionlogicielle.UNO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Interface setting the conditions for the use of the GUI classes in this package.
 */
public abstract class GameGUI {
    private Parent root;
    private Scene scene;
    private String fxmlFile;
    private Stage stage;
    public static Stage clientStage;
    static Stage serverStage;
    private IController controller;

    /**
     * Sets up the GUI by loading the fxml file for the scene.
     * @param stage Stage on which the scene will be added.
     */
    public void setup(Stage stage) throws IOException{
        //this.root = FXMLLoader.load(getClass().getResource("SceneBuilderResources/menuScene.fxml"));
        FXMLLoader loader = new FXMLLoader(UNO.class.getResource(this.fxmlFile));
        this.root = loader.load();
        this.controller = loader.getController();
        this.scene = new Scene(root);
        this.stage = stage;
        this.stage.setScene(scene);
    }

    /**
     * Displays the gui.
     */
    public void show(){
        this.stage.show();
    }

    /**
     * Setter for the fxml file name for the scene.
     * @param fxmlFile file path
     */
    public void setFxmlFile(String fxmlFile) {
        this.fxmlFile = fxmlFile;
    }


    /**
     * Sets the stage that will be used for the client side
     * @param clientStage stage for the client
     */
    public static void setClientStage(Stage clientStage) {
        GameGUI.clientStage = clientStage;
    }

    /**
     * Sets the stage that will be used for the server side.
     * @param serverStage Stage for the server
     */
    public static void setServerStage(Stage serverStage) {
        GameGUI.serverStage = serverStage;
    }

    /**
     * Getter for the stage containing the client side of the game.
     */
    public static Stage getClientStage() {
        return clientStage;
    }

    /**
     * Getter for the stage containing the server side of the game.
     */
    public static Stage getServerStage() {
        return serverStage;
    }

    /**
     * Getter for the controller associated with this scene.
     * @return Controller
     */
    public IController getController() {
        return controller;
    }
}
