package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class ScenaStatystykiController {
    private Main mainApp;
    private Profile profile;

    @FXML
    private Button powrotDoMenu;

    @FXML
    private Label labelWygrane;

    @FXML
    private Label labelPrzegrane;

    @FXML
    private Label labelGry;

    @FXML
    private ChoiceBox<String> wybierzProfil;



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

    public void setProfile(Profile profile) {
        this.profile = profile;

        wybierzProfil.getItems().clear();
        wybierzProfil.getItems().addAll(profile.getDostepneProfile());

        wybierzProfil.setValue(profile.getAktualneStatystyki().getNazwaProfilu());

        wybierzProfil.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                profile.ustawAktualnyProfil(newVal);
                wczytajStatystyki();
            }
        });

        wczytajStatystyki();
    }

    private void wczytajStatystyki() {
        if (profile != null) {
            Statystyki statystyki = profile.getAktualneStatystyki();
            labelWygrane.setText("Wygrane: " + statystyki.getWygrane());
            labelPrzegrane.setText("Przegrane: " + statystyki.getPrzegrane());
            labelGry.setText("Liczba gier: " + statystyki.getLiczbaGier());
        }
    }
}

