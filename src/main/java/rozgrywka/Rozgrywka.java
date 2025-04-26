package rozgrywka;

import bierki.*;

import java.util.ArrayList;

public class Rozgrywka {

    private ArrayList<Bierka> bierki = new ArrayList<>();
    private Bierka[][] plansza = new Bierka[9][9];

    public Rozgrywka()
    {
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
            {
                plansza[i][j] = null;
            }
        //DODANIE BIAŁYCH NA PLANSZE
        dodajBierke(new Krol(Kolor.BIALY, Stan.NA_PLANSZY, 0, 4));
        dodajBierke(new ZlotyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 0, 3));
        dodajBierke(new ZlotyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 0, 5));
        dodajBierke(new SrebrnyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 0, 2));
        dodajBierke(new SrebrnyGeneral(Kolor.BIALY, Stan.NA_PLANSZY, 0, 6));
        dodajBierke(new Skoczek(Kolor.BIALY, Stan.NA_PLANSZY, 0, 1));
        dodajBierke(new Skoczek(Kolor.BIALY, Stan.NA_PLANSZY, 0, 7));
        dodajBierke(new Lanca(Kolor.BIALY, Stan.NA_PLANSZY, 0, 0));
        dodajBierke(new Lanca(Kolor.BIALY, Stan.NA_PLANSZY, 0, 8));
        dodajBierke(new Goniec(Kolor.BIALY, Stan.NA_PLANSZY, 1, 7));
        dodajBierke(new Wieza(Kolor.BIALY, Stan.NA_PLANSZY, 1, 1));
        for(int i = 0; i < 9; i++)
        {
            dodajBierke(new Pion(Kolor.BIALY, Stan.NA_PLANSZY, 2, i));
        }

        //DODANIE CZARNYCH NA PLANSZE
        dodajBierke(new Krol(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 4));
        dodajBierke(new ZlotyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 3));
        dodajBierke(new ZlotyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 5));
        dodajBierke(new SrebrnyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 2));
        dodajBierke(new SrebrnyGeneral(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 6));
        dodajBierke(new Skoczek(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 1));
        dodajBierke(new Skoczek(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 7));
        dodajBierke(new Lanca(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 0));
        dodajBierke(new Lanca(Kolor.CZARNY, Stan.NA_PLANSZY, 8, 8));
        dodajBierke(new Goniec(Kolor.CZARNY, Stan.NA_PLANSZY, 7, 1));
        dodajBierke(new Wieza(Kolor.CZARNY, Stan.NA_PLANSZY, 7, 7));
        for(int i = 0; i < 9; i++)
        {
            dodajBierke(new Pion(Kolor.CZARNY, Stan.NA_PLANSZY, 6, i));
        }
        wypisNaKonsole();
    }

    private void dodajBierke(Bierka bierka)
    {
        bierki.add(bierka);
        plansza[bierka.getLogX()][bierka.getLogY()] = bierka;

    }

    //metoda do debugowania
    private void wypisNaKonsole()
    {
        for(int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (plansza[i][j] != null)
                {
                    System.out.print(" "+ konsolaZnak(plansza[i][j]) + " ");
                } else
                {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    //metoda do debugowania
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

    //metoda zwraca true, jeżeli klikniecie sprawia zmianę sytuacji wyświetlanej na planszy
    public boolean ruch(Klikniecie klikniecie)
    {

        return false;
    }


}
