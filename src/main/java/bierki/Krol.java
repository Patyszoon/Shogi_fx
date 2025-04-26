package bierki;

public class Krol extends Bierka{

    @Override
    public boolean czyLegalny(int kolumna, int wiersz)
    {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza) return false;
        for(int xl = kolumna-1; xl <= kolumna+1; xl++)
            for(int yl = wiersz-1; yl <= wiersz+1; yl++)
                if(xl == this.nrKolumny && yl == this.nrWiersza) return true;
        return false;
    }

    public Krol(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }
}
