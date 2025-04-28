package bierki;

public class Lanca extends PromowalnaBierka{

    //do sprite'a bierki
    public Lanca(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        return (kolumna == this.nrKolumny) && ((this.getKolor() == Kolor.BIALY)?wiersz > this.nrWiersza:wiersz < this.nrWiersza);
    }
}
