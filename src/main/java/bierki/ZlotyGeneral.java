package bierki;

public class ZlotyGeneral extends Bierka{

    @Override
    public boolean czyLegalny(int kolumna, int wiersz) {
        int odwrotka = (this.getKolor() == Kolor.BIALY)?1:-1;
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza)return false;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza -odwrotka)return false;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza -odwrotka)return false;
        for(int xl = kolumna-1; xl <= (kolumna + 1); xl++)
            for(int yl = wiersz-1; yl <= (wiersz + 1); yl++)
                if(xl == this.nrKolumny && yl == this.nrWiersza) return true;
        return false;
    }

    public ZlotyGeneral(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }
}
