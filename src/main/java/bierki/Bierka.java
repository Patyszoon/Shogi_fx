package bierki;

public abstract class Bierka {

    //************************POLA********************************
    protected Kolor kolor;
    protected Stan stan;
    protected int nrWiersza;
    protected int nrKolumny;
    protected boolean nieSkoczek = true;
    //*****************************METODY**********************************

    //Konstruktor
    protected Bierka(Kolor kolor, Stan stan, int x, int y) {
        this.kolor = kolor;
        this.stan = stan;
        this.nrWiersza = y;
        this.nrKolumny = x;
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

    //po zadaniu koordynatow na planszy zwraca informacje, czy jest to ruch zgodny z zasadami ruchu dla danej bierki
    public abstract boolean czyLegalny(int x, int y);

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
    public int[] ruch(int x, int y)
    {
        nrWiersza = x;
        nrKolumny = y;
        return new int[]{nrWiersza, nrKolumny};
    }
    public int[] ruch(int[] pozycja)
    {
        nrWiersza = pozycja[0];
        nrKolumny = pozycja[1];
        return new int[]{nrWiersza, nrKolumny};
    }

    public int[] getPozycja()
    {
        return new int[]{nrWiersza, nrKolumny};
    }

    public int getNrWiersza() {
        return nrWiersza;
    }

    public int getNrKolumny() {
        return nrKolumny;
    }

}
