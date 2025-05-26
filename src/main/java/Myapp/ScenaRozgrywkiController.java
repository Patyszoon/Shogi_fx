package Myapp;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import Myapp.rozgrywka.Klikniecie;
import Myapp.rozgrywka.Rozgrywka;
import javafx.scene.text.Text;
import javafx.util.Duration;
import Myapp.rozgrywka.ZegarBialy;
import Myapp.rozgrywka.ZegarCzarny;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static Myapp.bierki.Kolor.BIALY;

public class  ScenaRozgrywkiController {

    private String wybrany;
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
    @FXML
    private Button Bialew0k0;
    @FXML
    private Button Bialew0k1;
    @FXML
    private Button Bialew0k2;
    @FXML
    private Button Bialew0k3;
    @FXML
    private Button Bialew0k4;
    @FXML
    private Button Bialew1k0;
    @FXML
    private Button Bialew1k1;
    @FXML
    private Button Bialew1k2;
    @FXML
    private Button Bialew1k3;
    @FXML
    private Button Bialew1k4;
    @FXML
    private Button Bialew2k0;
    @FXML
    private Button Bialew2k1;
    @FXML
    private Button Bialew2k2;
    @FXML
    private Button Bialew2k3;
    @FXML
    private Button Bialew2k4;
    @FXML
    private Button Bialew3k0;
    @FXML
    private Button Bialew3k1;
    @FXML
    private Button Bialew3k2;
    @FXML
    private Button Bialew3k3;
    @FXML
    private Button Bialew3k4;
    @FXML
    private Button Czarnew0k0;
    @FXML
    private Button Czarnew0k1;
    @FXML
    private Button Czarnew0k2;
    @FXML
    private Button Czarnew0k3;
    @FXML
    private Button Czarnew0k4;
    @FXML
    private Button Czarnew1k0;
    @FXML
    private Button Czarnew1k1;
    @FXML
    private Button Czarnew1k2;
    @FXML
    private Button Czarnew1k3;
    @FXML
    private Button Czarnew1k4;
    @FXML
    private Button Czarnew2k0;
    @FXML
    private Button Czarnew2k1;
    @FXML
    private Button Czarnew2k2;
    @FXML
    private Button Czarnew2k3;
    @FXML
    private Button Czarnew2k4;
    @FXML
    private Button Czarnew3k0;
    @FXML
    private Button Czarnew3k1;
    @FXML
    private Button Czarnew3k2;
    @FXML
    private Button Czarnew3k3;
    @FXML
    private Button Czarnew3k4;
    @FXML
    private ChoiceBox wyborZapisu;
    @FXML
    public Text zegar1;
    @FXML
    public Text zegar2;
    @FXML
    public Text tura_b;
    @FXML
    public Text tura_c;

    private Main mainApp;

    public Button[][] przyciski = new Button[9][14];
    Rozgrywka r = null;

    Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(1),
                    event -> {
                        if (ZegarBialy.koniecCzasu() || ZegarCzarny.koniecCzasu()) {
                            System.out.println("Czas się skończył");
                        }
                        if(r.strona == BIALY){
                            ZegarBialy.mijanieSekundy();
                            zegar2.setText(ZegarBialy.getObecnyCzas());
                            tura_b.setText("BIAŁE");
                            tura_c.setText(" ");
                        } else {
                            ZegarCzarny.mijanieSekundy();
                            zegar1.setText(ZegarCzarny.getObecnyCzas());
                            tura_c.setText("CZARNE");
                            tura_b.setText(" ");
                        }
                    }
            ));


    @FXML
    private AnchorPane plansza;

    public ScenaRozgrywkiController() {
    }

    public ScenaRozgrywkiController(AnchorPane plansza) {
        this.plansza = plansza;
    }

    @FXML
    public void initialize() {
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
        wyborZapisu.getItems().add(zapisy[0]);
        wyborZapisu.getItems().add(zapisy[1]);
        wyborZapisu.getItems().add(zapisy[2]);
        wyborZapisu.getItems().add(zapisy[3]);
        wyborZapisu.getItems().add(zapisy[4]);
        wyborZapisu.getItems().add(zapisy[5]);
        wyborZapisu.getItems().add(zapisy[6]);
        wyborZapisu.getItems().add(zapisy[7]);
        wyborZapisu.getItems().add(zapisy[8]);
        wyborZapisu.getItems().add(zapisy[9]);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Wybrany zapis już istnieje, czy chcesz go nadpisać?", ButtonType.YES, ButtonType.CANCEL);


        wyborZapisu.setOnAction((event -> {
            int selectedIndex = wyborZapisu.getSelectionModel().getSelectedIndex();
            wybrany = wyborZapisu.getSelectionModel().getSelectedItem().toString();
        }));


        zapiszMenu.setOnAction(event -> {
            String kolorowy=wybrany+"_kolor";

            File file1 = new File(wybrany);
            if (file1.exists()) {
                alert.showAndWait();

                if (alert.getResult() == ButtonType.YES) {
                    if (file1.delete()) {
                        System.out.println("Usunięto istniejący plik: " + wybrany);
                    }
                }

            }
            file1=null;

            File file2 = new File(kolorowy);
            if (file2.exists()) {
                if (file2.delete()) {
                    System.out.println("Usunięto istniejący plik: " + kolorowy);
                }
            }
            file2=null;

            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(wybrany))) {
                out.writeObject(r.bierki);
                System.out.println("Zapisano tablicę obiektów do pliku: " + wybrany);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(kolorowy))) {
                out.writeObject(r.strona);
                System.out.println("Zapisano kolor do pliku: " + kolorowy);
            } catch (IOException e) {
                e.printStackTrace();
            }


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
            String kolorowy=wybrany+"_kolor";
            File file1 = new File(wybrany);
            if (file1.exists()) {
                alert.showAndWait();

                if (alert.getResult() == ButtonType.YES) {
                    if (file1.delete()) {
                        System.out.println("Usunięto istniejący plik: " + wybrany);
                    }
                }

            }
            file1=null;

            File file2 = new File(kolorowy);
            if (file2.exists()) {
                if (file2.delete()) {
                    System.out.println("Usunięto istniejący plik: " + kolorowy);
                }
            }
            file2=null;

            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(wybrany))) {
                out.writeObject(r.bierki);
                System.out.println("Zapisano tablicę obiektów do pliku: " + wybrany);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(kolorowy))) {
                out.writeObject(r.strona);
                System.out.println("Zapisano kolor do pliku: " + kolorowy);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        zegar1.setText(ZegarCzarny.getObecnyCzas());
        zegar2.setText(ZegarBialy.getObecnyCzas());
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        w0k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,0));
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
        Bialew0k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,9));
        });
        Bialew0k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,9));
        });
        Bialew0k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,9));
        });
        Bialew0k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,9));
        });
        Bialew0k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,9));
        });
        Bialew1k0.setOnAction(event -> {
            r.ruch(new Klikniecie(5,9));
        });
        Bialew1k1.setOnAction(event -> {
            r.ruch(new Klikniecie(6,9));
        });
        Bialew1k2.setOnAction(event -> {
            r.ruch(new Klikniecie(7,9));
        });
        Bialew1k3.setOnAction(event -> {
            r.ruch(new Klikniecie(8,9));
        });
        Bialew1k4.setOnAction(event -> {
            r.ruch(new Klikniecie(0,10));
        });
        Bialew2k0.setOnAction(event -> {
            r.ruch(new Klikniecie(1,10));
        });
        Bialew2k1.setOnAction(event -> {
            r.ruch(new Klikniecie(2, 10));
        });
        Bialew2k2.setOnAction(event -> {
            r.ruch(new Klikniecie(3, 10));
        });
        Bialew2k3.setOnAction(event -> {
            r.ruch(new Klikniecie(4,10));
        });
        Bialew2k4.setOnAction(event -> {
            r.ruch(new Klikniecie(5,10));
        });
        Bialew3k0.setOnAction(event -> {
            r.ruch(new Klikniecie(6,10));
        });
        Bialew3k1.setOnAction(event -> {
            r.ruch(new Klikniecie(7,10));
        });
        Bialew3k2.setOnAction(event -> {
            r.ruch(new Klikniecie(8,10));
        });
        Bialew3k3.setOnAction(event -> {
            r.ruch(new Klikniecie(0,13));
        });
        Bialew3k4.setOnAction(event -> {
            r.ruch(new Klikniecie(1,13));
        });
        Czarnew0k0.setOnAction(event -> {
            r.ruch(new Klikniecie(0,11));
        });
        Czarnew0k1.setOnAction(event -> {
            r.ruch(new Klikniecie(1,11));
        });
        Czarnew0k2.setOnAction(event -> {
            r.ruch(new Klikniecie(2,11));
        });
        Czarnew0k3.setOnAction(event -> {
            r.ruch(new Klikniecie(3,11));
        });
        Czarnew0k4.setOnAction(event -> {
            r.ruch(new Klikniecie(4,11));
        });
        Czarnew1k0.setOnAction(event -> {
            r.ruch(new Klikniecie(5,11));
        });
        Czarnew1k1.setOnAction(event -> {
            r.ruch(new Klikniecie(6,11));
        });
        Czarnew1k2.setOnAction(event -> {
            r.ruch(new Klikniecie(7,11));
        });
        Czarnew1k3.setOnAction(event -> {
            r.ruch(new Klikniecie(8,11));
        });
        Czarnew1k4.setOnAction(event -> {
            r.ruch(new Klikniecie(0,12));
        });
        Czarnew2k0.setOnAction(event -> {
            r.ruch(new Klikniecie(1,12));
        });
        Czarnew2k1.setOnAction(event -> {
            r.ruch(new Klikniecie(2,12));
        });
        Czarnew2k2.setOnAction(event -> {
            r.ruch(new Klikniecie(3,12));
        });
        Czarnew2k3.setOnAction(event -> {
            r.ruch(new Klikniecie(4,12));
        });
        Czarnew2k4.setOnAction(event -> {
            r.ruch(new Klikniecie(5,12));
        });
        Czarnew3k0.setOnAction(event -> {
            r.ruch(new Klikniecie(6,12));
        });
        Czarnew3k1.setOnAction(event -> {
            r.ruch(new Klikniecie(7,12));
        });
        Czarnew3k2.setOnAction(event -> {
            r.ruch(new Klikniecie(8,12));
        });
        Czarnew3k3.setOnAction(event -> {
            r.ruch(new Klikniecie(2,13));
        });
        Czarnew3k4.setOnAction(event -> {
            r.ruch(new Klikniecie(3,13));
        });





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
        przyciski[0][9]=Bialew0k0;
        przyciski[1][9]=Bialew0k1;
        przyciski[2][9]=Bialew0k2;
        przyciski[3][9]=Bialew0k3;
        przyciski[4][9]=Bialew0k4;
        przyciski[5][9]=Bialew1k0;
        przyciski[6][9]=Bialew1k1;
        przyciski[7][9]=Bialew1k2;
        przyciski[8][9]=Bialew1k3;
        przyciski[0][10]=Bialew1k4;
        przyciski[1][10]=Bialew2k0;
        przyciski[2][10]=Bialew2k1;
        przyciski[3][10]=Bialew2k2;
        przyciski[4][10]=Bialew2k3;
        przyciski[5][10]=Bialew2k4;
        przyciski[6][10]=Bialew3k0;
        przyciski[7][10]=Bialew3k1;
        przyciski[8][10]=Bialew3k2;
        przyciski[0][11]=Czarnew0k0;
        przyciski[1][11]=Czarnew0k1;
        przyciski[2][11]=Czarnew0k2;
        przyciski[3][11]=Czarnew0k3;
        przyciski[4][11]=Czarnew0k4;
        przyciski[5][11]=Czarnew1k0;
        przyciski[6][11]=Czarnew1k1;
        przyciski[7][11]=Czarnew1k2;
        przyciski[8][11]=Czarnew1k3;
        przyciski[0][12]=Czarnew1k4;
        przyciski[1][12]=Czarnew2k0;
        przyciski[2][12]=Czarnew2k1;
        przyciski[3][12]=Czarnew2k2;
        przyciski[4][12]=Czarnew2k3;
        przyciski[5][12]=Czarnew2k4;
        przyciski[6][12]=Czarnew3k0;
        przyciski[7][12]=Czarnew3k1;
        przyciski[8][12]=Czarnew3k2;
        przyciski[0][13]=Bialew3k3;
        przyciski[1][13]=Bialew3k4;
        przyciski[2][13]=Czarnew3k3;
        przyciski[3][13]=Czarnew3k4;

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(przyciski[i][j]);
            }
            System.out.println();
        }
        System.out.println(w8k8);
        r = Rozgrywka.getInstancja(przyciski);

    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}