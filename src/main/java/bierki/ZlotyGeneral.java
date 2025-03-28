package bierki;

import plansza.Board;

import java.awt.*;

public class ZlotyGeneral extends Bierka{
    protected ZlotyGeneral(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        return false;
    }

    public ZlotyGeneral(Board board, int wiersz, int kolumna) {
        super(board);
        this.wiersz = wiersz;
        this.kolumna = kolumna;
        this.x = wiersz * board.rozmiarKomorki;
        this.y = kolumna * board.rozmiarKomorki;

        this.sprite = bierki.getSubimage(1 * rozmiarSprite, 0, rozmiarSprite, rozmiarSprite).getScaledInstance(board.rozmiarKomorki, board.rozmiarKomorki, Image.SCALE_SMOOTH);
    }
}
