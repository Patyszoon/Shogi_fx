package bierki;

import plansza.Board;

import java.awt.*;

public class Skoczek extends PromowalnaBierka {

    public Skoczek(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 6);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return false;
    }
}
