package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import Myapp.rozgrywka.Rozgrywka;
import Myapp.rozgrywka.ZegarBialy;
import Myapp.rozgrywka.ZegarCzarny;

import java.io.IOException;

public class ScenaOpcjeController {
    private Main mainApp;

    @FXML
    private Button powrotDoMenu;

    @FXML
    private ChoiceBox<String> skorka;
    private String obecnaSkorka = "klasyczne";

    @FXML
    private ChoiceBox<String> minuty;

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

        minuty.getItems().addAll("1", "2", "3", "5", "10");
        System.out.println("Czas dla gracza: " + ZegarCzarny.getMinuty());

        minuty.setValue(String.valueOf(ZegarCzarny.getMinuty()));
        minuty.getSelectionModel().selectedItemProperty().addListener((obs, obecnaMinuty, nowaMinuty) -> {
            ZegarCzarny.setMinuty(Integer.parseInt(nowaMinuty));
            ZegarBialy.setMinuty(Integer.parseInt(nowaMinuty));
            System.out.println("Wybrano " + nowaMinuty + " minut");
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
