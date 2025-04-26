package bierki;


public class Skoczek extends PromowalnaBierka {

    public Skoczek(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
        nieSkoczek = false;
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.logX-1 && y == this.logY+2)return true;
        return x == this.logX + 1 && y == this.logY + 2;
    }
}
