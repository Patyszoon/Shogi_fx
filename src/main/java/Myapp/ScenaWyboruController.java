package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ScenaWyboruController {
    private Main mainApp;

    @FXML
    private Button powrotDoMenu;
    @FXML
    private Button nowaGra;
    @FXML
    private Button wczytajZapis;

    @FXML
    private void initialize() {
        powrotDoMenu.setOnAction(event -> {
            try {
                mainApp.pokazScenaMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        nowaGra.setOnAction(event -> {
            try {
                mainApp.pokazScenaRozgrywki();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        wczytajZapis.setOnAction(event -> {
            try {
                mainApp.pokazScenaRozgrywki();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}

