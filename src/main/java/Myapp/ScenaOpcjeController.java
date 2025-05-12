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
    private ChoiceBox<String> skorka;
    private String obecnaSkorka = "klasyczne";

    @FXML
    private void initialize() {
        //w przyszlosci wystarczy ze tutaj bedziemy dopisywac kolejne skorki oraz dodawac tak samo nazwane foldery i powinno dzialac
        skorka.getItems().addAll("klasyczne", "europejskie");
        System.out.println("Obecna skorka: " + Rozgrywka.getObecnaSkorka());

        skorka.setValue(Rozgrywka.getObecnaSkorka());
        skorka.getSelectionModel().selectedItemProperty().addListener((obs, obecnaSkorka, nowaSkorka) -> {
            rozgrywka.setObecnaSkorka(nowaSkorka);
            System.out.println("Wybrano " + nowaSkorka);
        });
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

    private Rozgrywka rozgrywka;
    public void setRozgrywka(Rozgrywka rozgrywka) {
        this.rozgrywka = rozgrywka;
    }
}
