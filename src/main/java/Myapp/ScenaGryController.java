package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ScenaGryController {
    private Main mainApp;

    @FXML
    private Button doMenuBezZapisu;

    @FXML
    private void initialize() {
        doMenuBezZapisu.setOnAction(event -> {
            try {
                mainApp.pokazScenaMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}
