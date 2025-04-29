package Myapp;

import bierki.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import rozgrywka.Klikniecie;
import rozgrywka.Rozgrywka;

import java.io.IOException;
import java.util.ArrayList;

public class  ScenaRozgrywkiController {
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
    @FXML
    private Button w1k0;
    @FXML
    private Button w1k1;
    @FXML
    private Button w1k2;
    @FXML
    private Button w1k3;
    @FXML
    private Button w1k4;
    @FXML
    private Button w1k5;
    @FXML
    private Button w1k6;
    @FXML
    private Button w1k7;
    @FXML
    private Button w1k8;
    @FXML
    private Button w2k0;
    @FXML
    private Button w2k1;
    @FXML
    private Button w2k2;
    @FXML
    private Button w2k3;
    @FXML
    private Button w2k4;
    @FXML
    private Button w2k5;
    @FXML
    private Button w2k6;
    @FXML
    private Button w2k7;
    @FXML
    private Button w2k8;
    @FXML
    private Button w3k0;
    @FXML
    private Button w3k1;
    @FXML
    private Button w3k2;
    @FXML
    private Button w3k3;
    @FXML
    private Button w3k4;
    @FXML
    private Button w3k5;
    @FXML
    private Button w3k6;
    @FXML
    private Button w3k7;
    @FXML
    private Button w3k8;
    @FXML
    private Button w4k0;
    @FXML
    private Button w4k1;
    @FXML
    private Button w4k2;
    @FXML
    private Button w4k3;
    @FXML
    private Button w4k4;
    @FXML
    private Button w4k5;
    @FXML
    private Button w4k6;
    @FXML
    private Button w4k7;
    @FXML
    private Button w4k8;
    @FXML
    private Button w5k0;
    @FXML
    private Button w5k1;
    @FXML
    private Button w5k2;
    @FXML
    private Button w5k3;
    @FXML
    private Button w5k4;
    @FXML
    private Button w5k5;
    @FXML
    private Button w5k6;
    @FXML
    private Button w5k7;
    @FXML
    private Button w5k8;
    @FXML
    private Button w6k0;
    @FXML
    private Button w6k1;
    @FXML
    private Button w6k2;
    @FXML
    private Button w6k3;
    @FXML
    private Button w6k4;
    @FXML
    private Button w6k5;
    @FXML
    private Button w6k6;
    @FXML
    private Button w6k7;
    @FXML
    private Button w6k8;
    @FXML
    private Button w7k0;
    @FXML
    private Button w7k1;
    @FXML
    private Button w7k2;
    @FXML
    private Button w7k3;
    @FXML
    private Button w7k4;
    @FXML
    private Button w7k5;
    @FXML
    private Button w7k6;
    @FXML
    private Button w7k7;
    @FXML
    private Button w7k8;
    @FXML
    private Button w8k0;
    @FXML
    private Button w8k1;
    @FXML
    private Button w8k2;
    @FXML
    private Button w8k3;
    @FXML
    private Button w8k4;
    @FXML
    private Button w8k5;
    @FXML
    private Button w8k6;
    @FXML
    private Button w8k7;
    @FXML
    private Button w8k8;
    private Main mainApp;

    public Button[][] przyciski = new Button[9][9];

    /*Image krol2 = new Image(getClass().getResourceAsStream("/Myapp/bierki/Krol2.png"));
    ImageView krol2up = new ImageView(krol2);
    ImageView krol2down = new ImageView(krol2);
    Image goniec = new Image(getClass().getResourceAsStream("/Myapp/bierki/Goniec.png"));
    ImageView goniecup = new ImageView(goniec);
    ImageView goniecdown = new ImageView(goniec);
    Image krol = new Image(getClass().getResourceAsStream("/Myapp/bierki/Krol.png"));
    ImageView krolup = new ImageView(krol);
    ImageView kroldown = new ImageView(krol);
    Image lanca = new Image(getClass().getResourceAsStream("/Myapp/bierki/Lanca.png"));
    ImageView lanca1up = new ImageView(lanca);
    ImageView lanca1down = new ImageView(lanca);
    ImageView lanca2up = new ImageView(lanca);
    ImageView lanca2down = new ImageView(lanca);
    Image pionek = new Image(getClass().getResourceAsStream("/Myapp/bierki/Pionek.png"));
    ImageView pionek1up = new ImageView(pionek);
    ImageView pionek1down = new ImageView(pionek);
    ImageView pionek2up = new ImageView(pionek);
    ImageView pionek2down = new ImageView(pionek);
    ImageView pionek3up = new ImageView(pionek);
    ImageView pionek3down = new ImageView(pionek);
    ImageView pionek4up = new ImageView(pionek);
    ImageView pionek4down = new ImageView(pionek);
    ImageView pionek5up = new ImageView(pionek);
    ImageView pionek5down = new ImageView(pionek);
    ImageView pionek6up = new ImageView(pionek);
    ImageView pionek6down = new ImageView(pionek);
    ImageView pionek7up = new ImageView(pionek);
    ImageView pionek7down = new ImageView(pionek);
    ImageView pionek8up = new ImageView(pionek);
    ImageView pionek8down = new ImageView(pionek);
    ImageView pionek9up = new ImageView(pionek);
    ImageView pionek9down = new ImageView(pionek);
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
    ImageView skoczek1up = new ImageView(skoczek);
    ImageView skoczek1down = new ImageView(skoczek);
    ImageView skoczek2up = new ImageView(skoczek);
    ImageView skoczek2down = new ImageView(skoczek);
    Image srebrnyGeneral = new Image(getClass().getResourceAsStream("/Myapp/bierki/SrebrnyGeneral.png"));
    ImageView srebrnyGeneral1up = new ImageView(srebrnyGeneral);
    ImageView srebrnyGeneral1down = new ImageView(srebrnyGeneral);
    ImageView srebrnyGeneral2up = new ImageView(srebrnyGeneral);
    ImageView srebrnyGeneral2down = new ImageView(srebrnyGeneral);
    Image wieza = new Image(getClass().getResourceAsStream("/Myapp/bierki/Wieza.png"));
    ImageView wiezaup = new ImageView(wieza);
    ImageView wiezadown = new ImageView(wieza);
    Image zlotyGeneral = new Image(getClass().getResourceAsStream("/Myapp/bierki/ZlotyGeneral.png"));
    ImageView zlotyGeneral1up = new ImageView(zlotyGeneral);
    ImageView zlotyGeneral1down = new ImageView(zlotyGeneral);
    ImageView zlotyGeneral2up = new ImageView(zlotyGeneral);
    ImageView zlotyGeneral2down = new ImageView(zlotyGeneral);*/
    //Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/Empty.png"));
    //ImageView imageView = new ImageView(image);
    Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/Empty.png"));
    ImageView imageViewww = new ImageView(image);







    Rozgrywka r = new Rozgrywka();
    //nie wiem czy będzie potrzebne w tej formie, raczej nie skoro mozna zawsze zrobić r.getBierki()
    //ale jak coś to tak to trzeba zrobić
    //ArrayList<Bierka> listaBierek = r.getBierki();

    @FXML
    private AnchorPane plansza;

    public ScenaRozgrywkiController() {
        przyciski[0][0]=w0k0;
        przyciski[1][0]=w0k1;
        przyciski[2][0]=w0k2;
        przyciski[3][0]=w0k3;
        przyciski[4][0]=w0k4;
        przyciski[5][0]=w0k5;
        przyciski[6][0]=w0k6;
        przyciski[7][0]=w0k7;
        przyciski[8][0]=w0k8;
        przyciski[0][1]=w1k0;
        przyciski[1][1]=w1k1;
        przyciski[2][1]=w1k2;
        przyciski[3][1]=w1k3;
        przyciski[4][1]=w1k4;
        przyciski[5][1]=w1k5;
        przyciski[6][1]=w1k6;
        przyciski[7][1]=w1k7;
        przyciski[8][1]=w1k8;
        przyciski[0][2]=w2k0;
        przyciski[1][2]=w2k1;
        przyciski[2][2]=w2k2;
        przyciski[3][2]=w2k3;
        przyciski[4][2]=w2k4;
        przyciski[5][2]=w2k5;
        przyciski[6][2]=w2k6;
        przyciski[7][2]=w2k7;
        przyciski[8][2]=w2k8;
        przyciski[0][3]=w3k0;
        przyciski[1][3]=w3k1;
        przyciski[2][3]=w3k2;
        przyciski[3][3]=w3k3;
        przyciski[4][3]=w3k4;
        przyciski[5][3]=w3k5;
        przyciski[6][3]=w3k6;
        przyciski[7][3]=w3k7;
        przyciski[8][3]=w3k8;
        przyciski[0][4]=w4k0;
        przyciski[1][4]=w4k1;
        przyciski[2][4]=w4k2;
        przyciski[3][4]=w4k3;
        przyciski[4][4]=w4k4;
        przyciski[5][4]=w4k5;
        przyciski[6][4]=w4k6;
        przyciski[7][4]=w4k7;
        przyciski[8][4]=w4k8;
        przyciski[0][5]=w5k0;
        przyciski[1][5]=w5k1;
        przyciski[2][5]=w5k2;
        przyciski[3][5]=w5k3;
        przyciski[4][5]=w5k4;
        przyciski[5][5]=w5k5;
        przyciski[6][5]=w5k6;
        przyciski[7][5]=w5k7;
        przyciski[8][5]=w5k8;
        przyciski[0][6]=w6k0;
        przyciski[1][6]=w6k1;
        przyciski[2][6]=w6k2;
        przyciski[3][6]=w6k3;
        przyciski[4][6]=w6k4;
        przyciski[5][6]=w6k5;
        przyciski[6][6]=w6k6;
        przyciski[7][6]=w6k7;
        przyciski[8][6]=w6k8;
        przyciski[0][7]=w7k0;
        przyciski[1][7]=w7k1;
        przyciski[2][7]=w7k2;
        przyciski[3][7]=w7k3;
        przyciski[4][7]=w7k4;
        przyciski[5][7]=w7k5;
        przyciski[6][7]=w7k6;
        przyciski[7][7]=w7k7;
        przyciski[8][7]=w7k8;
        przyciski[0][8]=w8k0;
        przyciski[1][8]=w8k1;
        przyciski[2][8]=w8k2;
        przyciski[3][8]=w8k3;
        przyciski[4][8]=w8k4;
        przyciski[5][8]=w8k5;
        przyciski[6][8]=w8k6;
        przyciski[7][8]=w8k7;
        przyciski[8][8]=w8k8;

    }

    public ScenaRozgrywkiController(AnchorPane plansza) {
        this.plansza = plansza;
    }

    @FXML
    public void initialize() {
       /* krol2up.setFitWidth(50);
        krol2up.setFitHeight(60);
        krol2down.setFitWidth(50);
        krol2down.setFitHeight(60);
        krol2down.setRotate(180);

        krolup.setFitWidth(50);
        krolup.setFitHeight(60);
        kroldown.setFitWidth(50);
        kroldown.setFitHeight(60);
        kroldown.setRotate(180);
        lanca1up.setFitWidth(50);
        lanca1up.setFitHeight(60);
        lanca1down.setFitWidth(50);
        lanca1down.setFitHeight(60);
        lanca1down.setRotate(180);
        lanca2up.setFitWidth(50);
        lanca2up.setFitHeight(60);
        lanca2down.setFitWidth(50);
        lanca2down.setFitHeight(60);
        lanca2down.setRotate(180);
        pionek1up.setFitWidth(50);
        pionek1up.setFitHeight(60);
        pionek1down.setFitWidth(50);
        pionek1down.setFitHeight(60);
        pionek1down.setRotate(180);
        pionek2up.setFitWidth(50);
        pionek2up.setFitHeight(60);
        pionek2down.setFitWidth(50);
        pionek2down.setFitHeight(60);
        pionek2down.setRotate(180);
        pionek3up.setFitWidth(50);
        pionek3up.setFitHeight(60);
        pionek3down.setFitWidth(50);
        pionek3down.setFitHeight(60);
        pionek3down.setRotate(180);
        pionek4up.setFitWidth(50);
        pionek4up.setFitHeight(60);
        pionek4down.setFitWidth(50);
        pionek4down.setFitHeight(60);
        pionek4down.setRotate(180);
        pionek5up.setFitWidth(50);
        pionek5up.setFitHeight(60);
        pionek5down.setFitWidth(50);
        pionek5down.setFitHeight(60);
        pionek5down.setRotate(180);
        pionek6up.setFitWidth(50);
        pionek6up.setFitHeight(60);
        pionek6down.setFitWidth(50);
        pionek6down.setFitHeight(60);
        pionek6down.setRotate(180);
        pionek7up.setFitWidth(50);
        pionek7up.setFitHeight(60);
        pionek7down.setFitWidth(50);
        pionek7down.setFitHeight(60);
        pionek7down.setRotate(180);
        pionek8up.setFitWidth(50);
        pionek8up.setFitHeight(60);
        pionek8down.setFitWidth(50);
        pionek8down.setFitHeight(60);
        pionek8down.setRotate(180);
        pionek9up.setFitWidth(50);
        pionek9up.setFitHeight(60);
        pionek9down.setFitWidth(50);
        pionek9down.setFitHeight(60);
        pionek9down.setRotate(180);
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
        skoczek1up.setFitWidth(50);
        skoczek1up.setFitHeight(60);
        skoczek1down.setFitWidth(50);
        skoczek1down.setFitHeight(60);
        skoczek1down.setRotate(180);
        skoczek2up.setFitWidth(50);
        skoczek2up.setFitHeight(60);
        skoczek2down.setFitWidth(50);
        skoczek2down.setFitHeight(60);
        skoczek2down.setRotate(180);
        srebrnyGeneral1up.setFitWidth(50);
        srebrnyGeneral1up.setFitHeight(60);
        srebrnyGeneral1down.setFitWidth(50);
        srebrnyGeneral1down.setFitHeight(60);
        srebrnyGeneral1down.setRotate(180);
        srebrnyGeneral2up.setFitWidth(50);
        srebrnyGeneral2up.setFitHeight(60);
        srebrnyGeneral2down.setFitWidth(50);
        srebrnyGeneral2down.setFitHeight(60);
        srebrnyGeneral2down.setRotate(180);
        wiezaup.setFitWidth(50);
        wiezaup.setFitHeight(60);
        wiezadown.setFitWidth(50);
        wiezadown.setFitHeight(60);
        wiezadown.setRotate(180);
        zlotyGeneral1up.setFitWidth(50);
        zlotyGeneral1up.setFitHeight(60);
        zlotyGeneral1down.setFitWidth(50);
        zlotyGeneral1down.setFitHeight(60);
        zlotyGeneral1down.setRotate(180);
        zlotyGeneral2up.setFitWidth(50);
        zlotyGeneral2up.setFitHeight(60);
        zlotyGeneral2down.setFitWidth(50);
        zlotyGeneral2down.setFitHeight(60);
        zlotyGeneral2down.setRotate(180);
        empty.setFitWidth(50);
        empty.setFitHeight(60);

        w0k0.setGraphic(lanca1down);
        w0k8.setGraphic(lanca2down);
        w8k0.setGraphic(lanca1up);
        w8k8.setGraphic(lanca2up);
        w0k1.setGraphic(skoczek1down);
        w0k7.setGraphic(skoczek2down);
        w8k1.setGraphic(skoczek1up);
        w8k7.setGraphic(skoczek2up);
        w0k2.setGraphic(srebrnyGeneral1down);
        w0k6.setGraphic(srebrnyGeneral2down);
        w8k2.setGraphic(srebrnyGeneral1up);
        w8k6.setGraphic(srebrnyGeneral2up);
        w0k3.setGraphic(zlotyGeneral1down);
        w0k5.setGraphic(zlotyGeneral2down);
        w8k3.setGraphic(zlotyGeneral1up);
        w8k5.setGraphic(zlotyGeneral2up);
        w0k4.setGraphic(kroldown);
        w8k4.setGraphic(krol2up);
        w1k1.setGraphic(wiezadown);
        w7k7.setGraphic(wiezaup);
        w1k7.setGraphic(goniecdown);
        w7k1.setGraphic(goniecup);
        w2k0.setGraphic(pionek1down);
        w2k1.setGraphic(pionek2down);
        w2k2.setGraphic(pionek3down);
        w2k3.setGraphic(pionek4down);
        w2k4.setGraphic(pionek5down);
        w2k5.setGraphic(pionek6down);
        w2k6.setGraphic(pionek7down);
        w2k7.setGraphic(pionek8down);
        w2k8.setGraphic(pionek9down);
        w6k0.setGraphic(pionek1up);
        w6k1.setGraphic(pionek2up);
        w6k2.setGraphic(pionek3up);
        w6k3.setGraphic(pionek4up);
        w6k4.setGraphic(pionek5up);
        w6k5.setGraphic(pionek6up);
        w6k6.setGraphic(pionek7up);
        w6k7.setGraphic(pionek8up);
        w6k8.setGraphic(pionek9up);*/









        //dodajBierki();
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
            /*Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/Empty.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            imageView.setRotate(180);
            w0k0.setGraphic(imageView);*/

            r.ruch(new Klikniecie(0,0));
            przyciski[r.aktywna.getNrKolumny()][r.aktywna.getNrWiersza()].setGraphic(imageViewww);
            //przyciski[r.klikniecie.getX()][r.klikniecie.getY()].setGraphic(r.ruch(r.klikniecie).instancja.imageView);
        });
        w0k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,0));
        });
        w0k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,0));
        });
        w0k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,0));
        });
        w0k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,0));
        });
        w0k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,0));
        });
        w0k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,0));
        });
        w0k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,0));
        });
        w0k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,0));
        });
        w1k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,1));
        });
        w1k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,1));
        });
        w1k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,1));
        });
        w1k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,1));
        });
        w1k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,1));
        });
        w1k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,1));
        });
        w1k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,1));
        });
        w1k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,1));
        });
        w1k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,1));
        });
        w2k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,2));
        });
        w2k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,2));
        });
        w2k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,2));
        });
        w2k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,2));
        });
        w2k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,2));
        });
        w2k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,2));
        });
        w2k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,2));
        });
        w2k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,2));
        });
        w2k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,2));
        });
        w3k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,3));
        });
        w3k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,3));
        });
        w3k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,3));
        });
        w3k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,3));
        });
        w3k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,3));
        });
        w3k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,3));
        });
        w3k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,3));
        });
        w3k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,3));
        });
        w3k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,3));
        });
        w4k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,4));
        });
        w4k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,4));
        });
        w4k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,4));
        });
        w4k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,4));
        });
        w4k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,4));
        });
        w4k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,4));
        });
        w4k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,4));
        });
        w4k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,4));
        });
        w4k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,4));
        });
        w5k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,5));
        });
        w5k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,5));
        });
        w5k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,5));
        });
        w5k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,5));
        });
        w5k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,5));
        });
        w5k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,5));
        });
        w5k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,5));
        });
        w5k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,5));
        });
        w5k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,5));
        });
        w6k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,6));
        });
        w6k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,6));
        });
        w6k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,6));
        });
        w6k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,6));
        });
        w6k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,6));
        });
        w6k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,6));
        });
        w6k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,6));
        });
        w6k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,6));
        });
        w6k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,6));
        });
        w7k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,7));
        });
        w7k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,7));
        });
        w7k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,7));
        });
        w7k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,7));
        });
        w7k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,7));
        });
        w7k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,7));
        });
        w7k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,7));
        });
        w7k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,7));
        });
        w7k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,7));
        });
        w8k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,8));
        });
        w8k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,8));
        });
        w8k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,8));
        });
        w8k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,8));
        });
        w8k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,8));
        });
        w8k5.setOnAction(event -> {
            r.ruch(new Klikniecie(5,8));
        });
        w8k6.setOnAction(event -> {
            r.ruch(new Klikniecie(6,8));
        });
        w8k7.setOnAction(event -> {
            r.ruch(new Klikniecie(7,8));
        });
        w8k8.setOnAction(event -> {
            r.ruch(new Klikniecie(8,8));
        });


    }




//    public void dodajBierki() {
//        listaBierek.add(new Krol(Kolor.BIALY, Stan.NA_PLANSZY, 4, 8));
//        listaBierek.add(new Wieza(Kolor.BIALY, Stan.NA_PLANSZY, 7, 7));
//        listaBierek.add(new Goniec(Kolor.BIALY, Stan.NA_PLANSZY, 1, 7));
//        listaBierek.add(new ZlotyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 3, 8));
//        listaBierek.add(new ZlotyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 5, 8));
//        listaBierek.add(new SrebrnyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 2, 8));
//        listaBierek.add(new SrebrnyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 6, 8));
//        listaBierek.add(new Skoczek(Kolor.BIALY, Stan.NA_PLANSZY, 1, 8));
//        listaBierek.add(new Skoczek(Kolor.BIALY, Stan.NA_PLANSZY, 7, 8));
//        listaBierek.add(new Lanca(Kolor.BIALY, Stan.NA_PLANSZY, 0, 8));
//        listaBierek.add(new Lanca(Kolor.BIALY, Stan.NA_PLANSZY, 8, 8));
//
//        for (int i = 0; i < 9; i++) {
//            listaBierek.add(new Pion(Kolor.BIALY, Stan.NA_PLANSZY, i, 6));
//        }
//
//        listaBierek.add(new Krol(Kolor.CZARNY, Stan.NA_PLANSZY, 4, 0));
//        listaBierek.add(new Wieza(Kolor.CZARNY, Stan.NA_PLANSZY, 7, 1));
//        listaBierek.add(new Goniec(Kolor.CZARNY, Stan.NA_PLANSZY, 1, 1));
//        listaBierek.add(new ZlotyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 3, 0));
//        listaBierek.add(new ZlotyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 5, 0));
//        listaBierek.add(new SrebrnyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 2, 0));
//        listaBierek.add(new SrebrnyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 6, 0));
//        listaBierek.add(new Skoczek(Kolor.CZARNY, Stan.NA_PLANSZY, 1, 0));
//        listaBierek.add(new Skoczek(Kolor.CZARNY, Stan.NA_PLANSZY, 7, 0));
//        listaBierek.add(new Lanca(Kolor.CZARNY, Stan.NA_PLANSZY, 0, 0));
//        listaBierek.add(new Lanca(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 0));
//
//        for (int i = 0; i < 9; i++) {
//            listaBierek.add(new Pion(Kolor.CZARNY, Stan.NA_PLANSZY, i, 2));
//        }
//    }



    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}