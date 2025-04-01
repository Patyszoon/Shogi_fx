package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ScenaMenuController {
    private Main mainApp;

    @FXML
    private Button graj;
    @FXML
    private Button statystyki;
    @FXML
    private Button opcje;
    @FXML
    private Button wyjscie;

    @FXML
    private void initialize() {
        graj.setOnAction(event -> {
            try {
                mainApp.pokazScenaWyboru();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        );
        statystyki.setOnAction(event -> {
            try {
                mainApp.pokazScenaStatystyki();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        );
        opcje.setOnAction(event -> {
            try {
                mainApp.pokazScenaOpcje();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        wyjscie.setOnAction(event -> {
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        });


    }




    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}
