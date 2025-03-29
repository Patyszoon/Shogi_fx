package bierki;

import plansza.Board;

import java.awt.*;

public class SrebrnyGeneral extends PromowalnaBierka{

    public SrebrnyGeneral(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 5);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return false;
    }
}
