package bierki;

import plansza.Board;

import java.awt.*;

public class Goniec extends PromowalnaBierka{

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return false;
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        return super.czyLegalnyPoPromocji(x, y);
    }

    public Goniec(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna);
        // x i y są do pobierania obrazu z pliku graficznego
        this.sprite = bierki.getSubimage(3 * rozmiarSprite, 0, rozmiarSprite, rozmiarSprite).getScaledInstance(board.rozmiarKomorki, board.rozmiarKomorki, Image.SCALE_SMOOTH);
    }
}
