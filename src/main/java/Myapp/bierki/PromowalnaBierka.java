package Myapp.bierki;

public abstract class PromowalnaBierka extends Bierka{
    protected boolean promowana = false;

    //konstruktor
    protected PromowalnaBierka(Kolor kolor, Stan stan, int kolumna, int wiersz) {
        super(kolor, stan, kolumna, wiersz);
    }

    public boolean czyPromowana()
    {
        return promowana;
    }

    //przy promocji zmienia status pionka
    public void promocja()
    {
        promowana = true;
    }

    @Override
    public void zbity()
    {
        promowana = false;
        super.zbity();
    }

    protected abstract boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz);

    //pomocnicza funkcja dla klas, ktore zmieniaja ruch po promocji
    // domyslnie zaimplementowan ruch jak dla zlotego generala, czyli prawidlowo dla wszystkich poza wieza i goncem
    protected boolean czyLegalnyPoPromocji(int kolumna, int wiersz){
        int odwrotka = (this.getKolor() == Kolor.BIALY)?1:-1;
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza)return false;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza -odwrotka)return false;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza -odwrotka)return false;
        for(int xl = kolumna-1; xl <= (kolumna + 1); xl++)
            for(int yl = wiersz-1; yl <= (wiersz + 1); yl++)
                if(xl == this.nrKolumny && yl == this.nrWiersza) return true;
        return false;
    }

    @Override
    public boolean czyLegalny(int kolumna, int wiersz) {
        if (promowana) {
            return czyLegalnyPoPromocji(kolumna, wiersz);
        } else {
            return czyLegalnyPrzedPromocja(kolumna, wiersz);
        }
    }

}
