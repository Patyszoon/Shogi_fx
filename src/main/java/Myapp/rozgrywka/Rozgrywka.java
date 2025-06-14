package Myapp.rozgrywka;

import Myapp.ScenaOpcjeController;
import Myapp.ScenaRozgrywkiController;
import Myapp.bierki.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import Myapp.rozgrywka.Rozgrywka;

import java.util.ArrayList;

public class Rozgrywka
{


    //*********************Pola**********************************************************
    public ArrayList<Bierka> bierki = new ArrayList<Bierka>();
    public Bierka[][] plansza = new Bierka[9][14];//[kolumna][wiersz]

    public Bierka aktywna = null;
    public Kolor strona = null;
    private Button[][] planszaPrzyciskow = null;

    public static String obecnaSkorka = "klasyczne";

    public static String getObecnaSkorka()
    {
        return obecnaSkorka;
    }

    public static void setObecnaSkorka(String nowaSkorka)
    {
        obecnaSkorka = nowaSkorka;
    }

    private static Rozgrywka jedynaPrawdziwa = null;

    //**********************Metody publiczne*********************************************


    public static void dropZwyczajny()
    {
        jedynaPrawdziwa = null;
    }

    //metoda zwracająca referencję do jedynej instancji rozgrywki
    //użyte po to, aby można było ją wywoływać z różnych klas interfejsu
    //i tak mamy syf, więc jeden singleton dużej różnicy nam nie zrobi
    public static Rozgrywka getInstancja(Button[][] planszaPioneczkow)
    {
        if (jedynaPrawdziwa == null)
        {
            jedynaPrawdziwa = new Rozgrywka(planszaPioneczkow);
        } else
        {
//            for (int i = 0; i < 9; i++)
//            {
//                for (int j = 0; j < 9; j++)
//                {
//                    System.out.print(planszaPioneczkow[i][j]);
//                }
//                System.out.println();
//            }
            jedynaPrawdziwa.planszaPrzyciskow = planszaPioneczkow;
            for (int i = 0; i < 9; i++)
                for (int j = 0; j < 13; j++)
                {
                    jedynaPrawdziwa.planszaPrzyciskow[i][j].setGraphic(jedynaPrawdziwa.obrazekBierki(jedynaPrawdziwa.plansza[i][j]));
                }
            for (int i = 0; i < 5; i++)
            {
                jedynaPrawdziwa.planszaPrzyciskow[i][12].setGraphic(jedynaPrawdziwa.obrazekBierki(jedynaPrawdziwa.plansza[i][12]));
            }
        }
        return jedynaPrawdziwa;
    }

    public static Rozgrywka getInstancja(ArrayList<Bierka> bierki, Kolor strona)
    {
        if (jedynaPrawdziwa == null)
            jedynaPrawdziwa = new Rozgrywka(bierki, strona);
        return jedynaPrawdziwa;
    }

    public static Rozgrywka getInstancja()
    {
        if (jedynaPrawdziwa == null)
            jedynaPrawdziwa = new Rozgrywka();
        return jedynaPrawdziwa;
    }

    //konstruktor
    private Rozgrywka()
    {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
            {
                plansza[i][j] = null;
            }
        strona = Kolor.CZARNY;
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
        for (int i = 0; i < 9; i++)
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
        for (int i = 0; i < 9; i++)
        {
            dodajBierke(new Pion(Kolor.CZARNY, Stan.NA_PLANSZY, i, 6));
        }
        //wypisNaKonsole();
        planszaPrzyciskow = null;
    }

    private Rozgrywka(ArrayList<Bierka> bierka, Kolor strona)
    {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
            {
                plansza[i][j] = null;
            }
        for (Bierka b : bierka)
            dodajBierke(b);
        this.strona = strona;
        //wypisNaKonsole();
        planszaPrzyciskow = null;
    }

    private Rozgrywka(Button[][] planszaPioneczkow)
    {
        this();
//        for (int i = 0; i < 9; i++)
//        {
//            for (int j = 0; j < 9; j++)
//            {
//                System.out.print(planszaPioneczkow[i][j]);
//            }
//            System.out.println();
//        }
        planszaPrzyciskow = planszaPioneczkow;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 13; j++)
            {
                planszaPrzyciskow[i][j].setGraphic(obrazekBierki(plansza[i][j]));
            }
        for (int i = 0; i < 4; i++)
        {
            planszaPrzyciskow[i][13].setGraphic(obrazekBierki(plansza[i][13]));
        }
    }

    //metoda zwraca true, jeżeli klikniecie sprawia zmianę sytuacji wyświetlanej na planszy
    public boolean ruch(Klikniecie klikniecie)
    {
        System.out.println("*******************************************");
        System.out.println(klikniecie.getX() + " " + klikniecie.getY());
        if (aktywna != null)
        {
            //jest juz zaznaczona bierka
            System.out.println("Bierka aktywna - " + aktywna);
            if ((plansza[klikniecie.getX()][klikniecie.getY()] == null) || (plansza[klikniecie.getX()][klikniecie.getY()].getKolor() != aktywna.getKolor()))
            //klikniecie na puste lub bierke przeciwnika - proba ruchu
            {
                System.out.println("Proba ruchu");
                System.out.println("Wiersz - " + aktywna.getNrWiersza());
                if (aktywna.getNrWiersza() < 9)
                {
                    System.out.println("Proba ruchu normalnego");
                    if (aktywna.czyLegalny(klikniecie.getX(), klikniecie.getY()))
                    {//sprawdza czy ruch jest legalny
                        if (aktywna.czyNieSkoczek())
                        {//sprawdza czy dana figura skacze
                            if (!czyDrogaWolna(aktywna.getNrKolumny(), aktywna.getNrWiersza(), klikniecie.getX(), klikniecie.getY()))
                            {
                                aktywna = null;
                                return true;
                            }
                        }
                        przemieszczenie(klikniecie);
                    }
                } else
                //podjeto probe wrzutki
                {
                    System.out.println("proba zrzutki");
                    if ((plansza[klikniecie.getX()][klikniecie.getY()] == null) && czyLegalnaZrzutka(klikniecie))
                    {
                        System.out.println("Zrzutka legalna");
                        przemieszczenie(klikniecie);
                    } else System.out.println("Zrzutka nielegalna");
                }
                aktywna = null;
                return true;
            } else if (aktywna.getNrKolumny() == klikniecie.getX() && aktywna.getNrWiersza() == klikniecie.getY())
            //dwa razy kliknieto ta samą bierkę swojego koloru - próba promocji
            {
                return probaAwansu(klikniecie);
            } else
            //klikniecie na bierke swojego koloru - zmiana aktywnej
            {
                aktywna = plansza[klikniecie.getX()][klikniecie.getY()];
            }
        } else return brakAktywnej(klikniecie);
        return false;
    }

    private void przemieszczenie(Klikniecie klikniecie)
    {
        plansza[aktywna.getNrKolumny()][aktywna.getNrWiersza()] = null;

        planszaPrzyciskow[aktywna.getNrKolumny()][aktywna.getNrWiersza()].setGraphic(obrazekBierki(null));

        aktywna.ruch(klikniecie.getX(), klikniecie.getY());
        if (plansza[klikniecie.getX()][klikniecie.getY()] != null)
        {
            Bierka zbijany = plansza[aktywna.getNrKolumny()][aktywna.getNrWiersza()].zbity();
//            System.out.println("Zbijany = NULL ? " + zbijany==null);
            //wyszukiwanie podstawienia na poprawne wolne pole przechowywania
            int rzadTymczasowy = (zbijany.getKolor() == Kolor.BIALY) ? 9 : 11;
            for (int i = rzadTymczasowy; i < rzadTymczasowy + 2; i++)
            {
                for (int j = 0; j < 9; j++)
                    if (plansza[j][i] == null)
                    {
                        plansza[j][i] = zbijany;
                        planszaPrzyciskow[j][i].setGraphic(obrazekBierki(plansza[j][i]));
//                        System.out.println("Zbijany = NULL ? " + (plansza[j][i] == null));
//                        System.out.println("Kolumna = " + i + " Wiersz  " + j);
                        plansza[j][i].setNrKolumny(j);
                        plansza[j][i].setNrWiersza(i);
//                        System.out.println(plansza[j][i].getKolor());
                        zbijany = null;
                        break;
                    }
                if (zbijany == null) break;
            }

            if (zbijany != null)
            {
                if (rzadTymczasowy == 9)
                {
                    plansza[0][13] = zbijany;
                    planszaPrzyciskow[0][13].setGraphic(obrazekBierki(plansza[0][13]));
                    plansza[0][13].setNrKolumny(0);
                    plansza[0][13].setNrWiersza(13);
                    //plansza[0][13].ustawPozycje(0,13);
                } else
                {
                    plansza[2][13] = zbijany;
                    planszaPrzyciskow[2][13].setGraphic(obrazekBierki(plansza[2][13]));
                    plansza[2][13].setNrKolumny(2);
                    plansza[2][13].setNrWiersza(13);
                    //plansza[2][13].ustawPozycje(2,13);
                }

            }
        }
        plansza[aktywna.getNrKolumny()][aktywna.getNrWiersza()] = aktywna;
        planszaPrzyciskow[aktywna.getNrKolumny()][aktywna.getNrWiersza()].setGraphic(obrazekBierki(aktywna));
        czyKoniecGry();
        zmianaGracza();
    }

    private boolean czyKoniecGry()
    {
        for (Bierka q : bierki)
        {
            if (q instanceof Krol)
            {
                if (q.czyWNiewoli()) return true;
            }
        }
        return false;
    }

    public ArrayList<Bierka> getBierki()
    {
        return bierki;
    }

    public ImageView obrazekBierki(Bierka bierka)
    {
        String adres = "";

        if (bierka != null)
        {
            if (bierka instanceof PromowalnaBierka)
            {
                switch (bierka.getClass().getName())
                {
                    case "Myapp.bierki.Lanca":
                        adres = ((PromowalnaBierka) bierka).czyPromowana() ? "/Myapp/" + Rozgrywka.obecnaSkorka + "/PromowanaLanca.png" : "/Myapp/" + Rozgrywka.obecnaSkorka + "/Lanca.png";
                        break;
                    case "Myapp.bierki.Pion":
                        adres = ((PromowalnaBierka) bierka).czyPromowana() ? "/Myapp/" + Rozgrywka.obecnaSkorka + "/PromowanyPion.png" : "/Myapp/" + Rozgrywka.obecnaSkorka + "/Pionek.png";
                        break;
                    case "Myapp.bierki.Goniec":
                        adres = ((PromowalnaBierka) bierka).czyPromowana() ? "/Myapp/" + Rozgrywka.obecnaSkorka + "/PromowanyGoniec.png" : "/Myapp/" + Rozgrywka.obecnaSkorka + "/Goniec.png";
                        break;
                    case "Myapp.bierki.Skoczek":
                        adres = ((PromowalnaBierka) bierka).czyPromowana() ? "/Myapp/" + Rozgrywka.obecnaSkorka + "/PromowanySkoczek.png" : "/Myapp/" + Rozgrywka.obecnaSkorka + "/Skoczek.png";
                        break;
                    case "Myapp.bierki.Wieza":
                        adres = ((PromowalnaBierka) bierka).czyPromowana() ? "/Myapp/" + Rozgrywka.obecnaSkorka + "/PromowanaWieza.png" : "/Myapp/" + Rozgrywka.obecnaSkorka + "/Wieza.png";
                        break;
                    case "Myapp.bierki.SrebrnyGeneral":
                        adres = ((PromowalnaBierka) bierka).czyPromowana() ? "/Myapp/" + Rozgrywka.obecnaSkorka + "/PromowanySrebrny.png" : "/Myapp/" + Rozgrywka.obecnaSkorka + "/SrebrnyGeneral.png";
                        break;
                }
            } else
            {
                switch (bierka.getClass().getName())
                {
                    case "Myapp.bierki.ZlotyGeneral":
                        adres = "/Myapp/" + Rozgrywka.obecnaSkorka + "/ZlotyGeneral.png";
                        break;
                    case "Myapp.bierki.Krol":
                        if (bierka.getKolor() == Kolor.BIALY)
                        {
                            adres = "/Myapp/" + Rozgrywka.obecnaSkorka + "/Krol2.png";
                        } else
                        {
                            adres = "/Myapp/" + Rozgrywka.obecnaSkorka + "/Krol.png";
                        }
                        break;
                }
            }
        } else adres = "/Myapp/" + Rozgrywka.obecnaSkorka + "/Empty.png";
        Image obrazek = new Image(getClass().getResourceAsStream(adres));
        ImageView widokObrazka = new ImageView(obrazek);
        widokObrazka.setFitWidth(50);
        widokObrazka.setFitHeight(60);
        if ((bierka != null) ? bierka.getKolor() == Kolor.BIALY : false)
        {
            widokObrazka.setRotate(180);
        }
        return widokObrazka;
    }

    //*****************************metody do debugowania***********************************

    //wypisuje na konsole stan planszy
    void wypisNaKonsole()
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (plansza[j][i] != null)
                {
                    System.out.print(" " + konsolaZnak(plansza[j][i]) + " ");
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
        if (bierka.getKolor() == Kolor.BIALY)
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
        } else
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
        strona = (strona == Kolor.BIALY) ? Kolor.CZARNY : Kolor.BIALY;
    }

    private boolean czyDrogaWolna(int kolumna1, int wiersz1, int kolumna2, int wiersz2)
    {
        boolean czyZmianaKolumny = kolumna1 != kolumna2;
        boolean czyZmianaWiersza = wiersz1 != wiersz2;
        boolean czyKolumnaRosnie = kolumna1 < kolumna2;
        boolean czyWierszRosnie = wiersz1 < wiersz2;
        int roznica = (czyZmianaKolumny) ? Math.abs(kolumna1 - kolumna2) : Math.abs(wiersz1 - wiersz2);
        System.out.println("czyZmianaKolumny = " + czyZmianaKolumny);
        System.out.println("czyZmianaWiersza = " + czyZmianaWiersza);
        System.out.println("czyKolumnaRosnie = " + czyKolumnaRosnie);
        System.out.println("czyWierszRosnie = " + czyWierszRosnie);
        System.out.println("roznica = " + roznica);
        for (int i = 1; i < roznica; i++)
        {
            System.out.println("wykonalo sie");
            if (plansza[kolumna1 + (czyZmianaKolumny ? (czyKolumnaRosnie ? i : i * (-1)) : 0)][wiersz1 + (czyZmianaWiersza ? (czyWierszRosnie ? i : i * (-1)) : 0)] != null)
                return false;
        }
        return true;
    }


    private boolean brakAktywnej(Klikniecie klikniecie)
    {
        System.out.println("nie ma jeszcze aktywnej bierki");
        if (plansza[klikniecie.getX()][klikniecie.getY()] != null)
        {
            System.out.println("kliknieta na zajete pole");
            System.out.println(plansza[klikniecie.getX()][klikniecie.getY()].getKolor());
            System.out.println(strona);
            if (plansza[klikniecie.getX()][klikniecie.getY()].getKolor() == strona)
            {
                System.out.println("kolor sie zgadza");
                aktywna = plansza[klikniecie.getX()][klikniecie.getY()];
                //do debugowania
                System.out.println("Aktywna bierka: " + aktywna.getClass().getName() + " x = " + aktywna.getNrKolumny() + " y = " + aktywna.getNrWiersza());
                return true;
            }
        } else
        //klikniecie lewym na puste - brak interakcji
        {
            System.out.println("Kliknieto na puste pole");
            return false;
        }
        return false;
    }

    private boolean probaAwansu(Klikniecie klikniecie)
    {

        System.out.println("HEHEHEHEHEHEHEH");
        if (plansza[klikniecie.getX()][klikniecie.getY()] instanceof PromowalnaBierka)
        {
            System.out.println("awansowalna");
            PromowalnaBierka awansowana = (PromowalnaBierka) plansza[klikniecie.getX()][klikniecie.getY()];
            if (((awansowana.getKolor() == Kolor.BIALY) && (awansowana.getNrWiersza() >= 6)) ||
                    ((awansowana.getKolor() == Kolor.CZARNY) && (awansowana.getNrWiersza() <= 2)))
            {
                if (!awansowana.czyPromowana())
                {
                    awansowana.promocja();
                    planszaPrzyciskow[klikniecie.getX()][klikniecie.getY()].setGraphic(obrazekBierki(plansza[klikniecie.getX()][klikniecie.getY()]));
                    aktywna = null;
                    czyKoniecGry();
                    zmianaGracza();
                    return true;
                }
            }
        }
        return false;
    }

    private boolean czyLegalnaZrzutka(Klikniecie klikniecie)
    {
        System.out.println("Witamy państwa z wnętrza funkcji czy legalna zrzutka");
        System.out.println(klikniecie.getX() + " " + klikniecie.getY());
        System.out.println(aktywna);
        if (aktywna instanceof Pion)
        {
            //zakaz wstawiania pionów bez ruchu
            System.out.println("To jest pion");
            if (klikniecie.getY() == ((strona == Kolor.BIALY) ? 8 : 0))
            {
                System.out.println("ZAKAZ BRAK RUCHU");
                return false;
            }
            //zakaz podwójnego wstawiania pionów
            for (int i = 0; i < 9; i++)
            {
                if ((plansza[klikniecie.getX()][i] instanceof Pion) && (plansza[klikniecie.getX()][i].getKolor() == aktywna.getKolor()))
                {
                    System.out.println("ZAKAZ PODWÓJNY PION");
                    return false;
                }
            }
        }
        if ((aktywna instanceof Lanca) &&
                (klikniecie.getY() == ((strona == Kolor.BIALY) ? 8 : 0))) return false;
        if ((aktywna instanceof Skoczek) &&
                ((klikniecie.getY() == ((strona == Kolor.BIALY) ? 8 : 0))) ||
                (klikniecie.getY() == ((strona == Kolor.BIALY) ? 7 : 1))) return false;
        return true;
    }
}
