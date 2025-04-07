/*package plansza;

import bierki.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Board_fx extends Application {

    public int rozmiarKomorki = 75;
    int kolumny = 9;
    int wiersze = 9;

    ArrayList<Bierka> listaBierek = new ArrayList<>();

    public Board_fx() {
        dodajBierki();
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

    @Override
    public void start(Stage stage) {
        GridPane plansza = new GridPane();
        plansza.setHgap(1);
        plansza.setVgap(1);

        for (int x = 0; x < kolumny; x++) {
            for (int y = 0; y < wiersze; y++) {
                Rectangle pole = new Rectangle(rozmiarKomorki, rozmiarKomorki);
                if ((x + y) % 2 == 0) {
                    pole.setFill(Color.WHITE);
                } else {
                    pole.setFill(Color.GRAY);
                }
                plansza.add(pole, x, y);
            }
        }


        Scene scene = new Scene(plansza, (kolumny * rozmiarKomorki)+100, (wiersze * rozmiarKomorki)+100);
        stage.setTitle("Plansza");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}*/
