package bierki;

public class Wieza extends PromowalnaBierka{

    public Wieza(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza -1)return true;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza +1)return true;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza +1)return true;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza -1)return true;
        return czyLegalnyPrzedPromocja(kolumna, wiersz);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza) return false;
        if((kolumna == this.nrKolumny) || (wiersz == this.nrWiersza)) return true;
        return false;
    }
}
