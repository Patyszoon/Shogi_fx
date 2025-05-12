package Myapp;

import bierki.Bierka;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import rozgrywka.Rozgrywka;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
        String fileName="Zapis1testowy";
        wczytajZapis.setOnAction(event -> {
            /*try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
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

