package bierki;


import plansza.Board;

import java.awt.*;

public class Wieza extends PromowalnaBierka{

    public Wieza(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 2);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        return super.czyLegalnyPoPromocji(x, y);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return false;
    }
}
