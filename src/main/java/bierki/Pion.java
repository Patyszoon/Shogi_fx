package bierki;

import plansza.Board;

import java.awt.*;

public class Pion extends PromowalnaBierka{

    //do sprite'a bierki
    public Pion(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 8);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return (x == this.logX) && (y == this.logY+1);
    }
}
