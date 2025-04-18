package bierki;

import Myapp.ScenaRozgrywkiController;

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
        if (x == this.logX - 1 && y == this.logY) return true;
        return czyLegalnyPrzedPromocja(x, y);
    }

    public Goniec(ScenaRozgrywkiController board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 3);
    }
}
