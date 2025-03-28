package bierki;

public class Pion extends PromowalnaBierka{
    protected Pion(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        return false;
    }
}
