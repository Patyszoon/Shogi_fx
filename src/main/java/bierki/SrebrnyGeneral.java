package bierki;

public class SrebrnyGeneral extends PromowalnaBierka{

    public SrebrnyGeneral(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        int odwrotka = (this.getKolor() == Kolor.BIALY)?1:-1;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza +odwrotka)return true;
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza +odwrotka)return true;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza +odwrotka)return true;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza -odwrotka)return true;
        return (kolumna == (this.nrKolumny + 1)) && (wiersz == (this.nrWiersza - odwrotka));
    }
}
