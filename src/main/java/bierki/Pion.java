package bierki;


public class Pion extends PromowalnaBierka{


    public Pion(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        return (kolumna == this.nrKolumny) && (wiersz == this.nrWiersza +1);
    }
}
