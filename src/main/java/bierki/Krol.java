package bierki;

import plansza.Board;

public class Krol extends Bierka{

    @Override
    public boolean czyLegalny(int x, int y) {
        return false;
    }

    //do sprite'a bierki
    public Krol(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 1);
    }
}
