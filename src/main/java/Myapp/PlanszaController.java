/*package Myapp;

import bierki.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.util.ArrayList;

public class PlanszaController {
    @FXML
    private Button zapiszMenu;
    @FXML
    private Button menu;
    @FXML
    private Button zapisz;
    private Main mainApp;
    public int rozmiarKomorki = 75;
    int kolumny = 9;
    int wiersze = 9;

    ArrayList<Bierka> listaBierek = new ArrayList<>();

    @FXML
    private AnchorPane plansza;

    public PlanszaController() {
    }

    public PlanszaController(AnchorPane plansza) {
        this.plansza = plansza;
    }

    @FXML
    public void initialize() {

        //rysujPlansze();
        dodajBierki();
        zapiszMenu.setOnAction(event -> {
            try {
                mainApp.pokazScenaMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        menu.setOnAction(event -> {
            try {
                mainApp.pokazScenaMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        zapisz.setOnAction(event -> {
        });
    }

    public void dodajBierki() {
        listaBierek.add(new Krol(this, Kolor.BIALY, Stan.NA_PLANSZY, 4, 8));
        listaBierek.add(new Wieza(this, Kolor.BIALY, Stan.NA_PLANSZY, 7, 7));
        listaBierek.add(new Goniec(this, Kolor.BIALY, Stan.NA_PLANSZY, 1, 7));
        listaBierek.add(new ZlotyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 3, 8));
        listaBierek.add(new ZlotyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 5, 8));
        listaBierek.add(new SrebrnyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 2, 8));
        listaBierek.add(new SrebrnyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 6, 8));
        listaBierek.add(new Skoczek(this, Kolor.BIALY, Stan.NA_PLANSZY, 1, 8));
        listaBierek.add(new Skoczek(this, Kolor.BIALY, Stan.NA_PLANSZY, 7, 8));
        listaBierek.add(new Lanca(this, Kolor.BIALY, Stan.NA_PLANSZY, 0, 8));
        listaBierek.add(new Lanca(this, Kolor.BIALY, Stan.NA_PLANSZY, 8, 8));

        for (int i = 0; i < 9; i++) {
            listaBierek.add(new Pion(this, Kolor.BIALY, Stan.NA_PLANSZY, i, 6));
        }

        listaBierek.add(new Krol(this, Kolor.CZARNY, Stan.NA_PLANSZY, 4, 0));
        listaBierek.add(new Wieza(this, Kolor.CZARNY, Stan.NA_PLANSZY, 7, 1));
        listaBierek.add(new Goniec(this, Kolor.CZARNY, Stan.NA_PLANSZY, 1, 1));
        listaBierek.add(new ZlotyGeneral(this, Kolor.CZARNY, Stan.NA_PLANSZY, 3, 0));
        listaBierek.add(new ZlotyGeneral(this, Kolor.CZARNY, Stan.NA_PLANSZY, 5, 0));
        listaBierek.add(new SrebrnyGeneral(this, Kolor.CZARNY, Stan.NA_PLANSZY, 2, 0));
        listaBierek.add(new SrebrnyGeneral(this, Kolor.CZARNY, Stan.NA_PLANSZY, 6, 0));
        listaBierek.add(new Skoczek(this, Kolor.CZARNY, Stan.NA_PLANSZY, 1, 0));
        listaBierek.add(new Skoczek(this, Kolor.CZARNY, Stan.NA_PLANSZY, 7, 0));
        listaBierek.add(new Lanca(this, Kolor.CZARNY, Stan.NA_PLANSZY, 0, 0));
        listaBierek.add(new Lanca(this, Kolor.CZARNY, Stan.NA_PLANSZY, 8, 0));

        for (int i = 0; i < 9; i++) {
            listaBierek.add(new Pion(this, Kolor.CZARNY, Stan.NA_PLANSZY, i, 2));
        }
    }

    public void rysujPlansze() {
        for (int x = 0; x < kolumny; x++) {
            for (int y = 0; y < wiersze; y++) {
                Rectangle pole = new Rectangle(rozmiarKomorki, rozmiarKomorki);
                if ((x + y) % 2 == 0) {
                    pole.setFill(Color.WHITE);
                } else {
                    pole.setFill(Color.WHITE);
                }
                pole.setStroke(Color.BLACK);
                pole.setStrokeWidth(0.5);
                pole.setLayoutX(x * rozmiarKomorki);
                pole.setLayoutY(y * rozmiarKomorki);

                plansza.getChildren().add(pole);
            }
        }

    }
    


    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}*/