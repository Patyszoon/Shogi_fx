package rozgrywka;

import bierki.*;

import java.util.ArrayList;

public class Rozgrywka {

    private ArrayList<Bierka> bierki = new ArrayList<>();
    private Bierka[][] plansza = new Bierka[9][9];
    private Bierka aktywna = null;
    private boolean czyAktywne = false;
    private Kolor strona = Kolor.CZARNY;


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
    void wypisNaKonsole()
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

    private void zmianaGracza()
    {
        strona = (strona == Kolor.BIALY)?Kolor.CZARNY:Kolor.BIALY;
    }

    private boolean czyDrogaWolna(int x1, int y1, int x2, int y2)
    {
        boolean zmianax = x1 != x2;
        boolean zmianay = y1 != y2;
        boolean xrosnie = x1 < x2;
        boolean yrosnie = y1 < y2;
        int roznica = (zmianax)?Math.abs(x1-x2):Math.abs(y1-y2);
        for (int i = 1; i < roznica; i++)
        {
            if(plansza[zmianax?(xrosnie?x1+i:x1-i):x1][zmianay?(yrosnie?y1+i:y1-i):y1] != null) return false;
        }
        return true;
    }

    //metoda zwraca true, jeżeli klikniecie sprawia zmianę sytuacji wyświetlanej na planszy
    public boolean ruch(Klikniecie klikniecie)
    {
        if (!klikniecie.czyPrawy())
        {
            if(aktywna != null)
            {
                //jest juz zaznaczona bierka

                if((plansza[klikniecie.getX()][klikniecie.getY()] == null) || (plansza[klikniecie.getX()][klikniecie.getY()].getKolor() != aktywna.getKolor()))
                //klikniecie na puste lub bierke przeciwnika - proba ruchu
                {
                    if (aktywna.czyLegalny(klikniecie.getX(), klikniecie.getY()))
                    {
                        if (aktywna.czyNieSkoczek())
                        {
                            if (czyDrogaWolna(aktywna.getLogX(), aktywna.getLogY(), klikniecie.getX(), klikniecie.getY()))
                            {
                                aktywna = null;
                                return true;
                            }
                        }
                        plansza[aktywna.getLogX()][aktywna.getLogY()] = null;
                        aktywna.ruch(klikniecie.getX(), klikniecie.getY());
                        if (plansza[klikniecie.getX()][klikniecie.getY()] != null)
                        {
                            plansza[aktywna.getLogX()][aktywna.getLogY()].zbity();
                        }
                        plansza[aktywna.getLogX()][aktywna.getLogY()] = aktywna;
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
                if(plansza[klikniecie.getX()][klikniecie.getY()] != null)
                {
                    if (plansza[klikniecie.getX()][klikniecie.getY()].getKolor() == strona)
                    {
                        aktywna = plansza[klikniecie.getX()][klikniecie.getY()];
                        //do debugowania
                        System.out.println("Aktywna bierka: " + aktywna.getClass().getName()+ " x = "+aktywna.getLogX()+" y = "+aktywna.getLogY());
                        return true;
                    }
                } else
                //klikniecie lewym na puste - brak interakcji
                {
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
                    if(((awansowana.getKolor() == Kolor.BIALY) && (awansowana.getLogY() >= 6)) ||
                            ((awansowana.getKolor() == Kolor.CZARNY) && (awansowana.getLogY() <= 2)))
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


}
