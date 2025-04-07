package bierki;


import Myapp.PlanszaController;

public class Wieza extends PromowalnaBierka{

    public Wieza(PlanszaController board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 2);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        if(x == this.logX-1 && y == this.logY-1)return true;
        if(x == this.logX-1 && y == this.logY+1)return true;
        if(x == this.logX+1 && y == this.logY+1)return true;
        if(x == this.logX+1 && y == this.logY-1)return true;
        return czyLegalnyPrzedPromocja(x, y);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.logX && y == this.logY) return false;
        if((x == this.logX) || (y == this.logY)) return true;
        return false;
    }
}
