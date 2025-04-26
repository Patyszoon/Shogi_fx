package bierki;

public class Wieza extends PromowalnaBierka{

    public Wieza(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
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
