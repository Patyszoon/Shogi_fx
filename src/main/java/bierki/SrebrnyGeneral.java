package bierki;

public class SrebrnyGeneral extends PromowalnaBierka{

    public SrebrnyGeneral(Kolor kolor, Stan stanb, int wiersz, int kolumna) {
        super(kolor, stanb, wiersz, kolumna);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        if(x == this.nrKolumny -1 && y == this.nrWiersza +1)return true;
        if(x == this.nrKolumny && y == this.nrWiersza +1)return true;
        if(x == this.nrKolumny +1 && y == this.nrWiersza +1)return true;
        if(x == this.nrKolumny -1 && y == this.nrWiersza -1)return true;
        return (x == (this.nrKolumny + 1)) && (y == (this.nrWiersza - 1));
    }
}
