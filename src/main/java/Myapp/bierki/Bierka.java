package Myapp.bierki;

import java.io.Serializable;

public abstract class Bierka implements Serializable {

    //************************POLA********************************
    protected Kolor kolor;
    protected Stan stan;
    protected int nrWiersza;
    protected int nrKolumny;
    protected boolean nieSkoczek = true;
    //*****************************METODY**********************************

    //Konstruktor
    protected Bierka(Kolor kolor, Stan stan, int kolumna, int wiersz) {
        this.kolor = kolor;
        this.stan = stan;
        this.nrWiersza = wiersz;
        this.nrKolumny = kolumna;
    }

    public boolean czyNieSkoczek()
    {
        return nieSkoczek;
    }

    //metoda do debugowania
    public Kolor getKolor()
    {
        return kolor;
    }

    //po zadaniu koordynatow na planszy zwraca informacje, czy jest to ruch zgodny z zasadami ruchu dla danej Myapp.bierki
    public abstract boolean czyLegalny(int kolumna, int wiersz);

    //wywolywane gdy zbijany - zmienia jego stan an zbity i zmienia kolor
    public void zbity()
    {
        stan = Stan.ZBITY;
        if(kolor == Kolor.CZARNY) kolor = Kolor.BIALY; else kolor = Kolor.CZARNY; //zmiana koloru
        nrWiersza = -1;
        nrKolumny = -1;
    }

    public boolean czyWNiewoli()
    {
        return stan == Stan.ZBITY;
    }

    //przemieszcza na zadane pole i zwraca tablice z podanymi argumentami
    public int[] ruch(int kolumna, int wiersz)
    {
        nrWiersza = wiersz;
        nrKolumny = kolumna;
        return new int[]{nrKolumny, nrWiersza};
    }
    public int[] ruch(int[] pozycja)
    {
        nrKolumny = pozycja[0];
        nrWiersza = pozycja[1];
        return new int[]{nrKolumny, nrWiersza};
    }

    public int[] getPozycja()
    {
        return new int[]{nrKolumny, nrWiersza};
    }

    public int getNrWiersza() {
        return nrWiersza;
    }

    public int getNrKolumny() {
        return nrKolumny;
    }

    public String obecnaSkorka;
    public String setSkorka(String obecnaSkorka) {
        this.obecnaSkorka = obecnaSkorka;
        return obecnaSkorka;
    }
}
