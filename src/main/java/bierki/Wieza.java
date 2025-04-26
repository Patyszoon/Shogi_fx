package bierki;

public class Wieza extends PromowalnaBierka{

    public Wieza(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        if(x == this.nrKolumny -1 && y == this.nrWiersza -1)return true;
        if(x == this.nrKolumny -1 && y == this.nrWiersza +1)return true;
        if(x == this.nrKolumny +1 && y == this.nrWiersza +1)return true;
        if(x == this.nrKolumny +1 && y == this.nrWiersza -1)return true;
        return czyLegalnyPrzedPromocja(x, y);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.nrKolumny && y == this.nrWiersza) return false;
        if((x == this.nrKolumny) || (y == this.nrWiersza)) return true;
        return false;
    }
}
