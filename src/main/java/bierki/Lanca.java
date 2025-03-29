package bierki;

import plansza.Board;

import java.awt.*;

public class Lanca extends PromowalnaBierka{

    //do sprite'a bierki
    public Lanca(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 7);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return false;
    }
}
