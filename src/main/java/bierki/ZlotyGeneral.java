package bierki;

import plansza.Board;

import java.awt.*;

public class ZlotyGeneral extends Bierka{

    @Override
    public boolean czyLegalny(int x, int y) {
        return false;
    }

    public ZlotyGeneral(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna);
        this.sprite = bierki.getSubimage(1 * rozmiarSprite, 0, rozmiarSprite, rozmiarSprite).getScaledInstance(board.rozmiarKomorki, board.rozmiarKomorki, Image.SCALE_SMOOTH);
    }
}
