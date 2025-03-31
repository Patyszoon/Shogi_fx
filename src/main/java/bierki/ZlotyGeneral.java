package bierki;

import plansza.Board;

public class ZlotyGeneral extends Bierka{

    @Override
    public boolean czyLegalny(int x, int y) {
        return false;
    }

    public ZlotyGeneral(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 4);
    }
}
