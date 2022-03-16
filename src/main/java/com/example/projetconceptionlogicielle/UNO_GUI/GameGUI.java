package com.example.projetconceptionlogicielle.UNO_GUI;

import javafx.stage.Stage;

import java.io.IOException;

/**
 * Interface setting the conditions for the use of the GUI classes in this package.
 */
public interface GameGUI {

    /**
     * Sets up the GUI by loading the fxml file for the scene.
     * @param stage
     */
    public void setup(Stage stage) throws IOException;

    /**
     * Displays the gui.
     */
    public void show();
}
