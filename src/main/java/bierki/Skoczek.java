package bierki;

public class Skoczek extends PromowalnaBierka{
    protected Skoczek(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        return false;
    }
}
