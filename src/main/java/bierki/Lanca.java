package bierki;

import Myapp.ScenaRozgrywkiController;

public class Lanca extends PromowalnaBierka{

    //do sprite'a bierki
    public Lanca(ScenaRozgrywkiController board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 7);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return (x == this.logX) && (y > this.logY);
    }
}
