package bierki;

import Myapp.ScenaRozgrywkiController;

public class Skoczek extends PromowalnaBierka {

    public Skoczek(ScenaRozgrywkiController board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 6);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.logX-1 && y == this.logY+2)return true;
        return x == this.logX + 1 && y == this.logY + 2;
    }
}
