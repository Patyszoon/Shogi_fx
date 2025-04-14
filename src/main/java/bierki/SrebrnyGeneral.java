package bierki;

import Myapp.PlanszaController;

public class SrebrnyGeneral extends PromowalnaBierka{

    public SrebrnyGeneral(PlanszaController board, Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(board, kolor, stanb, wiersz, kolumna, 5);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.logX-1 && y == this.logY+1)return true;
        if(x == this.logX && y == this.logY+1)return true;
        if(x == this.logX+1 && y == this.logY+1)return true;
        if(x == this.logX-1 && y == this.logY-1)return true;
        return (x == (this.logX + 1)) && (y == (this.logY - 1));
    }
}
