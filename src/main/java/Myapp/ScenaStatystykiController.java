package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import rozgrywka.Statystyki;


import java.io.IOException;

public class ScenaStatystykiController {
    private Main mainApp;

    @FXML
    private Button powrotDoMenu;

    @FXML
    private Label labelWygrane;

    @FXML
    private Label labelPrzegrane;

    @FXML
    private Label labelGry;

    @FXML
    private void initialize() {
        powrotDoMenu.setOnAction(event -> {
            try {
                mainApp.pokazScenaMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        wczytajStatystyki();

    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    private void wczytajStatystyki() {
        Statystyki statystyki = new Statystyki();
        labelWygrane.setText("Wygrane: " + statystyki.getWygrane());
        labelPrzegrane.setText("Przegrane: " + statystyki.getPrzegrane());
        labelGry.setText("Liczba gier: " + statystyki.getLiczbaGier());
    }
}
