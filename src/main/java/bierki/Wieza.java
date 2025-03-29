package bierki;


import plansza.Board;

import java.awt.*;

public class Wieza extends PromowalnaBierka{

    public Wieza(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna);
        // x i y są do pobierania obrazu z pliku graficznego
        this.sprite = bierki.getSubimage(2 * rozmiarSprite, 0, rozmiarSprite, rozmiarSprite).getScaledInstance(board.rozmiarKomorki, board.rozmiarKomorki, Image.SCALE_SMOOTH);
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
