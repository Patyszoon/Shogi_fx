package Myapp;

import Myapp.bierki.Bierka;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import Myapp.rozgrywka.Rozgrywka;
import javafx.scene.control.ChoiceBox;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScenaWyboruController {
    private String wybrany;
    private Main mainApp;

    @FXML
    private Button powrotDoMenu;
    @FXML
    private Button nowaGra;
    @FXML
    private Button wczytajZapis;
    @FXML
    private ChoiceBox wybor;

    @FXML
    private void initialize() {
        String[] zapisy = new String[10];
        zapisy[0]="Zapis 1";
        zapisy[1]="Zapis 2";
        zapisy[2]="Zapis 3";
        zapisy[3]="Zapis 4";
        zapisy[4]="Zapis 5";
        zapisy[5]="Zapis 6";
        zapisy[6]="Zapis 7";
        zapisy[7]="Zapis 8";
        zapisy[8]="Zapis 9";
        zapisy[9]="Zapis 10";
        wybor.getItems().add(zapisy[0]);
        wybor.getItems().add(zapisy[1]);
        wybor.getItems().add(zapisy[2]);
        wybor.getItems().add(zapisy[3]);
        wybor.getItems().add(zapisy[4]);
        wybor.getItems().add(zapisy[5]);
        wybor.getItems().add(zapisy[6]);
        wybor.getItems().add(zapisy[7]);
        wybor.getItems().add(zapisy[8]);
        wybor.getItems().add(zapisy[9]);

        wybor.setOnAction((event -> {
            int selectedIndex = wybor.getSelectionModel().getSelectedIndex();
            wybrany = wybor.getSelectionModel().getSelectedItem().toString();
        }));

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
            /*try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(wybrany))) {
                Rozgrywka r = new Rozgrywka((Bierka[][]) in.readObject());
                return (Bierka[][]) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return new Bierka[9][9];
            }*/

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

