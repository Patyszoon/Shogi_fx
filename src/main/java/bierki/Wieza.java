package bierki;


import plansza.Board;

import java.awt.*;

public class Wieza extends PromowalnaBierka{

    public Wieza(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 2);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        if(x == this.logX-1 && y == this.logY-1)return true;
        if(x == this.logX-1 && y == this.logY+1)return true;
        if(x == this.logX+1 && y == this.logY+1)return true;
        if(x == this.logX+1 && y == this.logY-1)return true;
        return false;
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.logX && y == this.logY) return false;
        if((x == this.logX) || (y == this.logY)) return true;
        return false;
    }
}
