package Myapp.rozgrywka;

import Myapp.ScenaOpcjeController;
import Myapp.ScenaRozgrywkiController;
import Myapp.bierki.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Rozgrywka {

    private ArrayList<Bierka> bierki = new ArrayList<Bierka>();
    public Bierka[][] plansza = new Bierka[9][9];//[kolumna][wiersz]
    public Bierka aktywna = null;
    private boolean czyAktywne = false;
    private Kolor strona = Kolor.CZARNY;
    private Button[][] planszaPrzyciskow = null;

    //**********************Metody publiczne*********************************************

    //konstruktor
    public Rozgrywka()
    {
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
            {
                plansza[i][j] = null;
            }
        //DODANIE BIAŁYCH NA PLANSZE
        dodajBierke(new Krol(Kolor.BIALY, Stan.NA_PLANSZY, 4, 0));
        dodajBierke(new ZlotyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 3, 0));
        dodajBierke(new ZlotyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 5, 0));
        dodajBierke(new SrebrnyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 2, 0));
        dodajBierke(new SrebrnyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 6, 0));
        dodajBierke(new Skoczek(Kolor.BIALY, Stan.NA_PLANSZY, 1, 0));
        dodajBierke(new Skoczek(Kolor.BIALY, Stan.NA_PLANSZY, 7, 0));
        dodajBierke(new Lanca(Kolor.BIALY, Stan.NA_PLANSZY, 0, 0));
        dodajBierke(new Lanca(Kolor.BIALY, Stan.NA_PLANSZY, 8, 0));
        dodajBierke(new Goniec(Kolor.BIALY, Stan.NA_PLANSZY, 7, 1));
        dodajBierke(new Wieza(Kolor.BIALY, Stan.NA_PLANSZY, 1, 1));
        for(int i = 0; i < 9; i++)
        {
            dodajBierke(new Pion(Kolor.BIALY, Stan.NA_PLANSZY, i, 2));
        }

        //DODANIE CZARNYCH NA PLANSZE
        dodajBierke(new Krol(Kolor.CZARNY, Stan.NA_PLANSZY, 4, 8));
        dodajBierke(new ZlotyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 3, 8));
        dodajBierke(new ZlotyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 5, 8));
        dodajBierke(new SrebrnyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 2, 8));
        dodajBierke(new SrebrnyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 6, 8));
        dodajBierke(new Skoczek(Kolor.CZARNY, Stan.NA_PLANSZY, 1, 8));
        dodajBierke(new Skoczek(Kolor.CZARNY, Stan.NA_PLANSZY, 7, 8));
        dodajBierke(new Lanca(Kolor.CZARNY, Stan.NA_PLANSZY, 0, 8));
        dodajBierke(new Lanca(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 8));
        dodajBierke(new Goniec(Kolor.CZARNY, Stan.NA_PLANSZY, 1, 7));
        dodajBierke(new Wieza(Kolor.CZARNY, Stan.NA_PLANSZY, 7, 7));
        for(int i = 0; i < 9; i++)
        {
            dodajBierke(new Pion(Kolor.CZARNY, Stan.NA_PLANSZY, i, 6));
        }
        wypisNaKonsole();
        planszaPrzyciskow = null;
    }

    public Rozgrywka(Button[][] planszaPioneczkow)
    {
        this();
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(planszaPioneczkow[i][j]);
            }
            System.out.println();
        }
        planszaPrzyciskow = planszaPioneczkow;
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
            {
                planszaPrzyciskow[i][j].setGraphic(obrazekBierki(plansza[i][j]));
            }
    }

    //public Klikniecie klikniecie;
    //metoda zwraca true, jeżeli klikniecie sprawia zmianę sytuacji wyświetlanej na planszy
    public boolean ruch(Klikniecie klikniecie)
    {
        //this.klikniecie = klikniecie;
        System.out.println("kliknieto na pole: " + klikniecie.getX() + " " + klikniecie.getY());
        if (!klikniecie.czyPrawy())
        {
            System.out.println("Kliknieto lewym klawiszem myszy");
            if(aktywna != null)
            {
                //jest juz zaznaczona bierka
                System.out.println("Jest juz aktywna bierka");
                if((plansza[klikniecie.getX()][klikniecie.getY()] == null) || (plansza[klikniecie.getX()][klikniecie.getY()].getKolor() != aktywna.getKolor()))
                //klikniecie na puste lub bierke przeciwnika - proba ruchu
                {
                    System.out.println("podjeta proba ruchu");
                    if (aktywna.czyLegalny(klikniecie.getX(), klikniecie.getY()))
                    {
                        System.out.println("ruch jest legalny");
                        if (aktywna.czyNieSkoczek()) {
                            System.out.println("nieskoczek");
                            if (!czyDrogaWolna(aktywna.getNrKolumny(), aktywna.getNrWiersza(), klikniecie.getX(), klikniecie.getY())) {
                                //System.out.println("droga zajeta na polu: "+klikniecie.getX() + " " + klikniecie.getY());

                                aktywna = null;
                                return true;
                            }// else System.out.println("droga wolna na polu: "+klikniecie.getX() + " " + klikniecie.getY());
                        }
                        plansza[aktywna.getNrKolumny()][aktywna.getNrWiersza()] = null;
                        System.out.println(planszaPrzyciskow[aktywna.getNrKolumny()][aktywna.getNrWiersza()]);
                        for(int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                System.out.print(planszaPrzyciskow[i][j]);
                            }
                            System.out.println();
                        }
                        planszaPrzyciskow[aktywna.getNrKolumny()][aktywna.getNrWiersza()].setGraphic(obrazekBierki(null));

                        aktywna.ruch(klikniecie.getX(), klikniecie.getY());
                        if (plansza[klikniecie.getX()][klikniecie.getY()] != null)
                        {
                            plansza[aktywna.getNrKolumny()][aktywna.getNrWiersza()].zbity();
                        }
                        plansza[aktywna.getNrKolumny()][aktywna.getNrWiersza()] = aktywna;
                        planszaPrzyciskow[aktywna.getNrKolumny()][aktywna.getNrWiersza()].setGraphic(obrazekBierki(aktywna));
                        zmianaGracza();
                    }
                    aktywna = null;
                    return true;
                } else
                //klikniecie na bierke wsojego koloru - zmiana aktywnej
                {
                    aktywna = plansza[klikniecie.getX()][klikniecie.getY()];
                    return true;
                }
            }
            else
            {
                //nie ma jeszcze zaznaczonej bierki

                //klikniecie lewym na bierke - wybranie bierki
                System.out.println("nie ma jeszcze aktywnej bierki");
                if(plansza[klikniecie.getX()][klikniecie.getY()] != null)
                {
                    System.out.println("kliknieta na zajete pole");
                    System.out.println(plansza[klikniecie.getX()][klikniecie.getY()].getKolor());
                    System.out.println(strona);
                    if (plansza[klikniecie.getX()][klikniecie.getY()].getKolor() == strona)
                    {
                        System.out.println("kolor sie zgadza");
                        aktywna = plansza[klikniecie.getX()][klikniecie.getY()];
                        //do debugowania
                        System.out.println("Aktywna bierka: " + aktywna.getClass().getName()+ " x = "+aktywna.getNrKolumny()+" y = "+aktywna.getNrWiersza());
                        return true;
                    }
                } else
                //klikniecie lewym na puste - brak interakcji
                {
                    System.out.println("Kliknieto na puste pole");
                    return false;
                }
            }
        } else
        {
            //klikniecie prawym przyciskiem
            aktywna = null;
            //klikniecie prawym na pusty - proba wstawienia bierki
            if(plansza[klikniecie.getX()][klikniecie.getY()] == null)
            {
                //nie mamy jeszcze dopracowanego wstawiania
            } else
            //klikniecie prawym na bierke - proba promocji
            {
                if(plansza[klikniecie.getX()][klikniecie.getY()] instanceof PromowalnaBierka)
                {
                    PromowalnaBierka awansowana = (PromowalnaBierka) plansza[klikniecie.getX()][klikniecie.getY()];
                    if(((awansowana.getKolor() == Kolor.BIALY) && (awansowana.getNrWiersza() >= 6)) ||
                            ((awansowana.getKolor() == Kolor.CZARNY) && (awansowana.getNrWiersza() <= 2)))
                    {
                        if(!awansowana.czyPromowana())
                        {
                            awansowana.promocja();
                            zmianaGracza();
                            return true;
                        }
                    }

                }

            }
        }
        return false;
    }

    public ArrayList<Bierka> getBierki()
    {
        return bierki;
    }

    public Bierka[][] getPlansza()
    {
        return plansza;
    }

    public ImageView obrazekBierki(Bierka bierka)
    {
        String adres = "";

        if (bierka != null) {
            if(bierka instanceof PromowalnaBierka)
            {
                switch (bierka.getClass().getName())
                {
                    case "bierki.Lanca":
                        adres = ((PromowalnaBierka) bierka).czyPromowana()?"/Myapp/klasyczne/PromowanaLanca.png":"/Myapp/klasyczne/Lanca.png";
                        break;
                    case "bierki.Pion":
                        adres = ((PromowalnaBierka) bierka).czyPromowana()?"/Myapp/klasyczne/PromowanyPion.png":"/Myapp/klasyczne/Pionek.png";
                        break;
                    case "bierki.Goniec":
                        adres = ((PromowalnaBierka) bierka).czyPromowana()?"/Myapp/klasyczne/PromowanyGoniec.png":"/Myapp/klasyczne/Goniec.png";
                        break;
                    case "bierki.Skoczek":
                        adres = ((PromowalnaBierka) bierka).czyPromowana()?"/Myapp/klasyczne/PromowanySkoczek.png":"/Myapp/klasyczne/Skoczek.png";
                        break;
                    case "bierki.Wieza":
                        adres = ((PromowalnaBierka) bierka).czyPromowana()?"/Myapp/klasyczne/PromowanaWieza.png":"/Myapp/klasyczne/Wieza.png";
                        break;
                    case "bierki.SrebrnyGeneral":
                        adres = ((PromowalnaBierka) bierka).czyPromowana()?"/Myapp/klasyczne/PromowanySrebrny.png":"/Myapp/klasyczne/SrebrnyGeneral.png";
                        break;
                }
            } else {
                switch (bierka.getClass().getName())
                {
                    case "bierki.ZlotyGeneral":
                        adres = "/Myapp/klasyczne/ZlotyGeneral.png";
                        break;
                    case "bierki.Krol":
                        if(bierka.getKolor() == Kolor.BIALY) {
                            adres = "/Myapp/klasyczne/Krol2.png";
                        }
                        else
                        {adres = "/Myapp/klasyczne/Krol.png";}
                        break;
                }
            }
        } else adres = "/Myapp/klasyczne/Empty.png";
        System.out.println(adres);
        Image obrazek = new Image(getClass().getResourceAsStream(adres));
        ImageView widokObrazka = new ImageView(obrazek);
        System.out.println(adres);
        widokObrazka.setFitWidth(50);
        System.out.println(adres);
        widokObrazka.setFitHeight(60);
        System.out.println(adres);
        if((bierka != null)?bierka.getKolor()==Kolor.BIALY:false){
            widokObrazka.setRotate(180);
        }
        System.out.println(adres);
        return widokObrazka;
    }

    //*****************************metody do debugowania***********************************

    //wypisuje na konsole stan planszy
    void wypisNaKonsole()
    {
        for(int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (plansza[j][i] != null)
                {
                    System.out.print(" "+ konsolaZnak(plansza[j][i]) + " ");
                } else
                {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //decyduje o wypisywanym znaku w wypisNaKonsole()
    private char konsolaZnak(Bierka bierka)
    {
        if(bierka.getKolor() == Kolor.BIALY)
        {
            switch (bierka.getClass().getName())
            {
                case "bierki.Lanca":
                    return 'L';
                case "bierki.Pion":
                    return 'P';
                case "bierki.Goniec":
                    return 'G';
                case "bierki.Skoczek":
                    return 'S';
                case "bierki.Wieza":
                    return 'W';
                case "bierki.ZlotyGeneral":
                    return 'Z';
                case "bierki.SrebrnyGeneral":
                    return 'X';
                case "bierki.Krol":
                    return 'K';
            }
        }else
        {
            switch (bierka.getClass().getName())
            {
                case "bierki.Lanca":
                    return 'l';
                case "bierki.Pion":
                    return 'p';
                case "bierki.Goniec":
                    return 'g';
                case "bierki.Skoczek":
                    return 's';
                case "bierki.Wieza":
                    return 'w';
                case "bierki.ZlotyGeneral":
                    return 'z';
                case "bierki.SrebrnyGeneral":
                    return 'x';
                case "bierki.Krol":
                    return 'k';
            }
        }
        return ' ';
    }

    //********************metody prywatne, nie grzebać*************************************

    private void dodajBierke(Bierka bierka)
    {
        bierki.add(bierka);
        plansza[bierka.getNrKolumny()][bierka.getNrWiersza()] = bierka;

    }

    private void zmianaGracza()
    {
        strona = (strona == Kolor.BIALY)?Kolor.CZARNY:Kolor.BIALY;
    }

    private boolean czyDrogaWolna(int kolumna1, int wiersz1, int kolumna2, int wiersz2)
    {
        boolean czyZmianaKolumny = kolumna1 != kolumna2;
        boolean czyZmianaWiersza = wiersz1 != wiersz2;
        boolean czyKolumnaRosnie = kolumna1 < kolumna2;
        boolean czyWierszRosnie = wiersz1 < wiersz2;
        int roznica = (czyZmianaKolumny)?Math.abs(kolumna1-kolumna2):Math.abs(wiersz1-wiersz2);
        System.out.println("czyZmianaKolumny = " + czyZmianaKolumny);
        System.out.println("czyZmianaWiersza = " + czyZmianaWiersza);
        System.out.println("czyKolumnaRosnie = " + czyKolumnaRosnie);
        System.out.println("czyWierszRosnie = " + czyWierszRosnie);
        System.out.println("roznica = " + roznica);
        for (int i = 1; i < roznica; i++)
        {
            System.out.println("wykonalo sie");
            if(plansza[kolumna1+(czyZmianaKolumny?(czyKolumnaRosnie?i:i*(-1)):0)][wiersz1+(czyZmianaWiersza?(czyWierszRosnie?i:i*(-1)):0)] != null)
                return false;
            //if(plansza[czyZmianaKolumny?(czyKolumnaRosnie?kolumna1+i:kolumna1-i):kolumna1][czyZmianaWiersza?(czyWierszRosnie?wiersz1+i:wiersz1-i):wiersz1] != null) return false;
        }
        return true;
    }
}
