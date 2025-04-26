package bierki;

public class Lanca extends PromowalnaBierka{

    //do sprite'a bierki
    public Lanca(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return (x == this.logX) && (y > this.logY);
    }
}
