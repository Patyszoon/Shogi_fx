package bierki;


public class Skoczek extends PromowalnaBierka {

    public Skoczek(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        nieSkoczek = false;
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza +2)return true;
        return kolumna == this.nrKolumny + 1 && wiersz == this.nrWiersza + 2;
    }
}
