package bierki;

public class SrebrnyGeneral extends PromowalnaBierka{
    protected SrebrnyGeneral(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        return false;
    }
}
