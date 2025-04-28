package bierki;


public class Skoczek extends PromowalnaBierka {

    public Skoczek(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        nieSkoczek = false;
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        int odwrotka = (this.getKolor() == Kolor.BIALY)?1:-1;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza +2*odwrotka)return true;
        return kolumna == this.nrKolumny + 1 && wiersz == this.nrWiersza + 2*odwrotka;
    }
}
