package bierki;

public abstract class PromowalnaBierka extends Bierka{
    protected boolean promowana = false;

    //konstruktor
    protected PromowalnaBierka(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
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

    protected abstract boolean czyLegalnyPrzedPromocja(int x, int y);

    //pomocnicza funkcja dla klas, ktore zmieniaja ruch po promocji
    // domyslnie zaimplementowan ruch jak dla zlotego generala, czyli prawidlowo dla wszystkich poza wieza i goncem
    protected boolean czyLegalnyPoPromocji(int x, int y){
        if(x == this.nrKolumny && y == this.nrWiersza)return false;
        if(x == this.nrKolumny -1 && y == this.nrWiersza -1)return false;
        if(x == this.nrKolumny +1 && y == this.nrWiersza -1)return false;
        for(int xl = x-1; xl <= (x + 1); xl++)
            for(int yl = y-1; yl <= (y + 1); yl++)
                if(xl == this.nrKolumny && yl == this.nrWiersza) return true;
        return false;
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        if (promowana) {
            return czyLegalnyPoPromocji(x, y);
        } else {
            return czyLegalnyPrzedPromocja(x, y);
        }
    }

}
