package bierki;

public class Goniec extends PromowalnaBierka{

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.nrKolumny && y == this.nrWiersza)return false;
        int odlegloscX = x - this.nrKolumny;
        int odlegloscY = y - this.nrWiersza;
        return (odlegloscY == odlegloscX) || ((odlegloscY * (-1)) == odlegloscX);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        if(x == this.nrKolumny && y == this.nrWiersza -1)return true;
        if(x == this.nrKolumny && y == this.nrWiersza +1)return true;
        if(x == this.nrKolumny +1 && y == this.nrWiersza)return true;
        if (x == this.nrKolumny - 1 && y == this.nrWiersza) return true;
        return czyLegalnyPrzedPromocja(x, y);
    }

    public Goniec(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
    }
}
