package Myapp;

import bierki.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.util.ArrayList;

public class ScenaRozgrywkiController {
    @FXML
    private Button zapiszMenu;
    @FXML
    private Button menu;
    @FXML
    private Button zapisz;
    @FXML
    private Button w0k0;
    @FXML
    private Button w0k1;
    @FXML
    private Button w0k2;
    @FXML
    private Button w0k3;
    @FXML
    private Button w0k4;
    @FXML
    private Button w0k5;
    @FXML
    private Button w0k6;
    @FXML
    private Button w0k7;
    @FXML
    private Button w0k8;
    private Main mainApp;
    public int rozmiarKomorki = 75;
    int kolumny = 9;
    int wiersze = 9;

    Image krol2 = new Image(getClass().getResourceAsStream("/Myapp/bierki/Krol2.png"));
    ImageView krol2up = new ImageView(krol2);
    ImageView krol2down = new ImageView(krol2);
    Image goniec = new Image(getClass().getResourceAsStream("/Myapp/bierki/Goniec.png"));
    ImageView goniecup = new ImageView(goniec);
    ImageView goniecdown = new ImageView(goniec);
    Image krol = new Image(getClass().getResourceAsStream("/Myapp/bierki/Krol.png"));
    ImageView krolup = new ImageView(krol);
    ImageView kroldown = new ImageView(krol);
    Image lanca = new Image(getClass().getResourceAsStream("/Myapp/bierki/Lanca.png"));
    ImageView lancaup = new ImageView(lanca);
    ImageView lancadown = new ImageView(lanca);
    Image pionek = new Image(getClass().getResourceAsStream("/Myapp/bierki/Pionek.png"));
    ImageView pionekup = new ImageView(pionek);
    ImageView pionekdown = new ImageView(pionek);
    Image promowanaLanca = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanaLanca.png"));
    ImageView promowanaLancaup = new ImageView(promowanaLanca);
    ImageView promowanaLancadown = new ImageView(promowanaLanca);
    Image promowanaWieza = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanaWieza.png"));
    ImageView promowanaWiezaup = new ImageView(promowanaWieza);
    ImageView promowanaWiezadown = new ImageView(promowanaWieza);
    Image promowanyGoniec = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanyGoniec.png"));
    ImageView promowanyGoniecup = new ImageView(promowanyGoniec);
    ImageView promowanyGoniecdown = new ImageView(promowanyGoniec);
    Image promowanyPion = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanyPion.png"));
    ImageView promowanyPionup = new ImageView(promowanyPion);
    ImageView promowanyPiondown = new ImageView(promowanyPion);
    Image promowanySkoczek = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanySkoczek.png"));
    ImageView promowanySkoczekup = new ImageView(promowanySkoczek);
    ImageView promowanySkoczekdown = new ImageView(promowanySkoczek);
    Image promowanySrebrny = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanySrebrny.png"));
    ImageView promowanySrebrnyup = new ImageView(promowanySrebrny);
    ImageView promowanySrebrnydown = new ImageView(promowanySrebrny);
    Image skoczek = new Image(getClass().getResourceAsStream("/Myapp/bierki/Skoczek.png"));
    ImageView skoczekup = new ImageView(skoczek);
    ImageView skoczekdown = new ImageView(skoczek);
    Image srebrnyGeneral = new Image(getClass().getResourceAsStream("/Myapp/bierki/SrebrnyGeneral.png"));
    ImageView srebrnyGeneralup = new ImageView(srebrnyGeneral);
    ImageView srebrnyGeneraldown = new ImageView(srebrnyGeneral);
    Image wieza = new Image(getClass().getResourceAsStream("/Myapp/bierki/Wieza.png"));
    ImageView wiezaup = new ImageView(wieza);
    ImageView wiezadown = new ImageView(wieza);
    Image zlotyGeneral = new Image(getClass().getResourceAsStream("/Myapp/bierki/ZlotyGeneral.png"));
    ImageView zlotyGeneralup = new ImageView(zlotyGeneral);
    ImageView zlotyGeneraldown = new ImageView(zlotyGeneral);
    Image puste = new Image(getClass().getResourceAsStream("/Myapp/bierki/Empty.png"));
    ImageView empty = new ImageView(puste);








    ArrayList<Bierka> listaBierek = new ArrayList<>();

    @FXML
    private AnchorPane plansza;

    public ScenaRozgrywkiController() {
    }

    public ScenaRozgrywkiController(AnchorPane plansza) {
        this.plansza = plansza;
    }

    @FXML
    public void initialize() {
        krol2up.setFitWidth(50);
        krol2up.setFitHeight(60);
        krol2down.setFitWidth(50);
        krol2down.setFitHeight(60);
        krol2down.setRotate(180);
        goniecup.setFitWidth(50);
        goniecup.setFitHeight(60);
        goniecdown.setFitWidth(50);
        goniecdown.setFitHeight(60);
        goniecdown.setRotate(180);
        krolup.setFitWidth(50);
        krolup.setFitHeight(60);
        kroldown.setFitWidth(50);
        kroldown.setFitHeight(60);
        kroldown.setRotate(180);
        lancaup.setFitWidth(50);
        lancaup.setFitHeight(60);
        lancadown.setFitWidth(50);
        lancadown.setFitHeight(60);
        lancadown.setRotate(180);
        pionekup.setFitWidth(50);
        pionekup.setFitHeight(60);
        pionekdown.setFitWidth(50);
        pionekdown.setFitHeight(60);
        pionekdown.setRotate(180);
        promowanaLancaup.setFitWidth(50);
        promowanaLancaup.setFitHeight(60);
        promowanaLancadown.setFitWidth(50);
        promowanaLancadown.setFitHeight(60);
        promowanaLancadown.setRotate(180);
        promowanaWiezaup.setFitWidth(50);
        promowanaWiezaup.setFitHeight(60);
        promowanaWiezadown.setFitWidth(50);
        promowanaWiezadown.setFitHeight(60);
        promowanaWiezadown.setRotate(180);
        promowanyGoniecup.setFitWidth(50);
        promowanyGoniecup.setFitHeight(60);
        promowanyGoniecdown.setFitWidth(50);
        promowanyGoniecdown.setFitHeight(60);
        promowanyGoniecdown.setRotate(180);
        promowanyPionup.setFitWidth(50);
        promowanyPionup.setFitHeight(60);
        promowanyPiondown.setFitWidth(50);
        promowanyPiondown.setFitHeight(60);
        promowanyPiondown.setRotate(180);
        promowanySkoczekup.setFitWidth(50);
        promowanySkoczekup.setFitHeight(60);
        promowanySkoczekdown.setFitWidth(50);
        promowanySkoczekdown.setFitHeight(60);
        promowanySkoczekdown.setRotate(180);
        promowanySrebrnyup.setFitWidth(50);
        promowanySrebrnyup.setFitHeight(60);
        promowanySrebrnydown.setFitWidth(50);
        promowanySrebrnydown.setFitHeight(60);
        promowanySrebrnydown.setRotate(180);
        skoczekup.setFitWidth(50);
        skoczekup.setFitHeight(60);
        skoczekdown.setFitWidth(50);
        skoczekdown.setFitHeight(60);
        skoczekdown.setRotate(180);
        srebrnyGeneralup.setFitWidth(50);
        srebrnyGeneralup.setFitHeight(60);
        srebrnyGeneraldown.setFitWidth(50);
        srebrnyGeneraldown.setFitHeight(60);
        srebrnyGeneraldown.setRotate(180);
        wiezaup.setFitWidth(50);
        wiezaup.setFitHeight(60);
        wiezadown.setFitWidth(50);
        wiezadown.setFitHeight(60);
        wiezadown.setRotate(180);
        zlotyGeneralup.setFitWidth(50);
        zlotyGeneralup.setFitHeight(60);
        zlotyGeneraldown.setFitWidth(50);
        zlotyGeneraldown.setFitHeight(60);
        zlotyGeneraldown.setRotate(180);
        empty.setFitWidth(50);
        empty.setFitHeight(60);

        w0k0.setGraphic(lancadown);
        w0k8.setGraphic(lancadown);
        //w8k0.setGraphic(lancaup);
        //w8k8.setGraphic(lancaup);




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

        w0k0.setOnAction(event -> {
            Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/Wieza.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            imageView.setRotate(180);
            w0k0.setGraphic(imageView);
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
}