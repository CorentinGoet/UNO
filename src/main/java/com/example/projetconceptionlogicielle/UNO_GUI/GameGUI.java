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
    private Stage stage;
    private String fxmlFile;

    /**
     * Sets up the GUI by loading the fxml file for the scene.
     * @param stage
     */
    public void setup(Stage stage) throws IOException{
        //this.root = FXMLLoader.load(getClass().getResource("SceneBuilderResources/menuScene.fxml"));
        FXMLLoader loader = new FXMLLoader(UNO.class.getResource(this.fxmlFile));
        this.root = loader.load();
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
     * Getter for stage object associated with the GUI.
     */
    public Stage getStage() {
        return this.stage;
    }
}
