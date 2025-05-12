package Myapp;

import Myapp.bierki.Kolor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import Myapp.rozgrywka.Rozgrywka;

import java.io.IOException;

public class ScenaOpcjeController {
    private Main mainApp;

    @FXML
    private Button powrotDoMenu;

    @FXML
    private void initialize() {
        skorka.getItems().addAll("klasyczna", "europejska");
        skorka.setValue(obecnaSkorka);

        skorka.getSelectionModel().selectedItemProperty().addListener((obs, staraSkorka, nowaSkorka) -> {
            obecnaSkorka = nowaSkorka;
        });
        powrotDoMenu.setOnAction(event -> {
            try {
                mainApp.pokazScenaMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    private ChoiceBox<String> skorka;
    private String obecnaSkorka = "klasyczna";


    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    private Rozgrywka rozgrywka;
    public void setRozgrywka(Rozgrywka rozgrywka) {
        this.rozgrywka = rozgrywka;
    }
}
