package Myapp;

import Myapp.bierki.Bierka;
import Myapp.bierki.Kolor;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import Myapp.rozgrywka.Rozgrywka;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

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
    Rozgrywka r = new Rozgrywka();

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
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Ten zapis nie istnieje, wybierz inny!", ButtonType.YES, ButtonType.CANCEL);

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
            r.dropZwyczajny();
            try {
                mainApp.pokazScenaRozgrywki();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        wczytajZapis.setOnAction(event -> {
            r.dropZwyczajny();
            String kolorowy = wybrany + "_kolor";


            File file1 = new File(wybrany);
            File file2 = new File(kolorowy);
            if (!file1.exists()&&!file2.exists()) {
                alert.showAndWait();

                if (alert.getResult() == ButtonType.YES) {
                    System.out.println("Plik nie istnieje");
                }

            }
            else{
                ArrayList<Bierka> bierki = null;
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(wybrany))) {
                    bierki = (ArrayList<Bierka>) in.readObject();
                    System.out.println("Wczytano bierki z pliku: " + wybrany);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }


                Kolor kolor = null;
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(kolorowy))) {
                    kolor = (Kolor) in.readObject();
                    System.out.println("Wczytano kolor z pliku: " + kolorowy);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                r.getInstancja(bierki, kolor);

                try {
                    mainApp.pokazScenaRozgrywki();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            file2=null;
            file1=null;






        });
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}

