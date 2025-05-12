package Myapp;

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
    private String obecnaSkorka = "klasyczna";

    @FXML
    private void initialize() {
        //w przyszlosci wystarczy ze tutaj bedziemy dopisywac kolejne skorki oraz dodawac tak samo nazwane foldery i powinno dzialac
        skorka.getItems().addAll("klasyczna", "europejska");
        skorka.setValue(obecnaSkorka);

        skorka.getSelectionModel().selectedItemProperty().addListener((obs, staraSkorka, nowaSkorka) -> {
            rozgrywka.setObecnaSkorka(nowaSkorka);
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

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    public void ustawSkorke(String nazwaSkorki) {
        Rozgrywka.setSkorka(nazwaSkorki);
    }
    private Rozgrywka rozgrywka;
    public void setRozgrywka(Rozgrywka rozgrywka) {
        this.rozgrywka = rozgrywka;
    }
}
