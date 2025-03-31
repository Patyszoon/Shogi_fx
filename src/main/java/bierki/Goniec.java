package bierki;

import plansza.Board;

import java.awt.*;

public class Goniec extends PromowalnaBierka{

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.logX && y == this.logY)return false;
        int odlegloscX = x - this.logX;
        int odlegloscY = y - this.logY;
        return (odlegloscY == odlegloscX) || ((odlegloscY * (-1)) == odlegloscX);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        if(x == this.logX && y == this.logY-1)return true;
        if(x == this.logX && y == this.logY+1)return true;
        if(x == this.logX+1 && y == this.logY)return true;
        return x == this.logX - 1 && y == this.logY;
    }

    public Goniec(Board board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 3);
    }
}
