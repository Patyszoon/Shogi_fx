package Myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import Myapp.rozgrywka.Rozgrywka;
import Myapp.rozgrywka.ZegarBialy;
import Myapp.rozgrywka.ZegarCzarny;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ScenaOpcjeController {
    private Profile profile;
    private Rozgrywka rozgrywka;
    private Main mainApp;

    @FXML
    private Button powrotDoMenu;

    @FXML
    private ChoiceBox<String> skorka;
    private String obecnaSkorka = "klasyczne";

    @FXML
    private ChoiceBox<String> minuty;

    @FXML
    private Label labelWybranyProfil;

    @FXML
    private ChoiceBox<String> profil;

    @FXML
    private TextField nowyProfilNazwa;

    @FXML
    private Button dodajProfilButton;

    @FXML
    private void initialize() {
        //w przyszlosci wystarczy ze tutaj bedziemy dopisywac kolejne skorki oraz dodawac tak samo nazwane foldery i powinno dzialac
        skorka.getItems().addAll("klasyczne", "europejskie", "szachowe");
        System.out.println("Obecna skorka: " + Rozgrywka.getObecnaSkorka());

        skorka.setValue(Rozgrywka.getObecnaSkorka());
        skorka.getSelectionModel().selectedItemProperty().addListener((obs, obecnaSkorka, nowaSkorka) -> {
            rozgrywka.setObecnaSkorka(nowaSkorka);
            System.out.println("Wybrano " + nowaSkorka);
        });

        minuty.getItems().addAll("1", "2", "3", "5", "10");
        System.out.println("Czas dla gracza: " + ZegarCzarny.getMinutyOpcja());

        minuty.setValue(String.valueOf(ZegarCzarny.getMinutyOpcja()));
        minuty.getSelectionModel().selectedItemProperty().addListener((obs, obecnaMinuty, nowaMinuty) -> {
            ZegarCzarny.setMinutyOpcja(Integer.parseInt(nowaMinuty));
            ZegarBialy.setMinutyOpcja(Integer.parseInt(nowaMinuty));
            System.out.println("Wybrano " + nowaMinuty + " minut");
        });

        powrotDoMenu.setOnAction(event -> {
            try {
                mainApp.pokazScenaMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        dodajProfilButton.setOnAction(event -> {
            String nowaNazwa = nowyProfilNazwa.getText().trim();
            if (!nowaNazwa.isEmpty() && profile != null && !profile.czyProfilIstnieje(nowaNazwa)) {
                profile.stworzNowyProfil(nowaNazwa);
                profil.getItems().add(nowaNazwa);
                profil.setValue(nowaNazwa);
                nowyProfilNazwa.clear();
                aktualizujWidokProfilu();
            }
        });

        profil.getSelectionModel().selectedItemProperty().addListener(
                (observable, staryProfil, nowyProfil) -> {
                    if (profile != null && nowyProfil != null) {
                        profile.ustawAktualnyProfil(nowyProfil);
                        aktualizujWidokProfilu();
                    }
                }
        );
    }

    private void aktualizujWidokProfilu() {
        if (profile != null) {
            String aktualny = profile.getAktualneStatystyki().getNazwaProfilu();
            labelWybranyProfil.setText("Wybrany profil: " + aktualny);
        }
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
        profil.getItems().clear();
        profil.getItems().addAll(profile.getDostepneProfile());
        profil.setValue(profile.getAktualneStatystyki().getNazwaProfilu());
        aktualizujWidokProfilu();
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    //private Rozgrywka rozgrywka;
    public void setRozgrywka(Rozgrywka rozgrywka) {
        this.rozgrywka = rozgrywka;
    }
}
