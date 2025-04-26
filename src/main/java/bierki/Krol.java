package bierki;

public class Krol extends Bierka{

    @Override
    public boolean czyLegalny(int x, int y)
    {
        if(x == this.nrKolumny && y == this.nrWiersza) return false;
        for(int xl = x-1; xl <= x+1; xl++)
            for(int yl = y-1; yl <= y+1; yl++)
                if(xl == this.nrKolumny && yl == this.nrWiersza) return true;
        return false;
    }

    public Krol(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
    }
}
