package bierki;


public class Pion extends PromowalnaBierka{


    public Pion(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return (x == this.nrKolumny) && (y == this.nrWiersza +1);
    }
}
