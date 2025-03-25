package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ScenaGryController {
    private Main mainApp;

    @FXML
    private Button powrotDoMenu;

    @FXML
    private void initialize() {
        powrotDoMenu.setOnAction(event -> {
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
