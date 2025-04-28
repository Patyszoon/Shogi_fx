package bierki;


public class Pion extends PromowalnaBierka{


    public Pion(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        int odwrotka = (this.getKolor() == Kolor.BIALY)?1:-1;
        System.out.println((kolumna == this.nrKolumny) && (wiersz == this.nrWiersza + odwrotka));
        return (kolumna == this.nrKolumny) && (wiersz == this.nrWiersza +odwrotka);
    }
}
