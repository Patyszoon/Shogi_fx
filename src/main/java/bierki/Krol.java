package bierki;

import plansza.Board;

public class Krol extends Bierka{

    @Override
    public boolean czyLegalny(int x, int y)
    {
        if(x == this.logX && y == this.logY) return false;
        for(int xl = x-1; xl <= x+1; xl++)
            for(int yl = y-1; yl <= y+1; yl++)
                if(xl == this.logX && yl == this.logY) return true;
        return false;
    }

    public Krol(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 1);
    }
}
