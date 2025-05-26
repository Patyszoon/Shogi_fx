package Myapp;

import Myapp.bierki.Bierka;
import Myapp.bierki.Kolor;
import Myapp.rozgrywka.ZegarBialy;
import Myapp.rozgrywka.ZegarCzarny;
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
    ZegarBialy zeg_bial;
    ZegarCzarny zeg_czar;
    int bialyMinuty;
    int bialySekundy;
    int czarnyMinuty;
    int czarnySekundy;
    int bialyCzas;
    int czarnyCzas;
    String wczytanaSkorka;

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
            String zegarowy_b=wybrany+"_zegar_bialy";
            String zegarowy_c=wybrany+"_zegar_czarny";
            String skorkowany=wybrany+"_skorka";


            File file1 = new File(wybrany);
            File file2 = new File(kolorowy);
            File file3 = new File(zegarowy_b);
            File file4 = new File(zegarowy_c);
            File file5 = new File(skorkowany);

            if (!file1.exists()) {
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


                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(zegarowy_b))) {
                    bialyCzas = (int) in.readObject();
                    System.out.println("Wczytano czas z pliku: " + zegarowy_b);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(zegarowy_c))) {
                    czarnyCzas = (int) in.readObject();
                    System.out.println("Wczytano czas z pliku: " + zegarowy_c);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(skorkowany))) {
                    wczytanaSkorka = (String) in.readObject();
                    System.out.println("Wczytano skorkę z pliku: " + skorkowany);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                bialyMinuty=bialyCzas/60;
                czarnyMinuty=czarnyCzas/60;
                bialySekundy=bialyCzas%60;
                czarnySekundy=czarnyCzas%60;
                zeg_bial.setMinuty(bialyMinuty);
                zeg_bial.setSekundy(bialySekundy);
                zeg_czar.setMinuty(czarnyMinuty);
                zeg_czar.setSekundy(czarnySekundy);


                r.getInstancja(bierki, kolor);
                r.setObecnaSkorka(wczytanaSkorka);

                try {
                    mainApp.pokazScenaRozgrywki();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            file2=null;
            file1=null;
            file3=null;
            file4=null;
            file5=null;






        });
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}

