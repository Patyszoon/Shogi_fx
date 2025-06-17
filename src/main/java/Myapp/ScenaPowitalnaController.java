package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class ScenaPowitalnaController {

    private Main mainApp;

    @FXML
    private Button dalej;

    @FXML
    private void initialize() {
        dalej.setOnAction(event -> {
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
