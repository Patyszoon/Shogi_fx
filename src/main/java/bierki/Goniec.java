package bierki;

public class Goniec extends PromowalnaBierka{

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza)return false;
        int odlegloscX = kolumna - this.nrKolumny;
        int odlegloscY = wiersz - this.nrWiersza;
        return (odlegloscY == odlegloscX) || ((odlegloscY * (-1)) == odlegloscX);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza -1)return true;
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza +1)return true;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza)return true;
        if (kolumna == this.nrKolumny - 1 && wiersz == this.nrWiersza) return true;
        return czyLegalnyPrzedPromocja(kolumna, wiersz);
    }

    public Goniec(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }
}
