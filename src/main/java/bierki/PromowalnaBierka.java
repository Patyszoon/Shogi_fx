package bierki;

import Myapp.ScenaRozgrywkiController;
import Myapp.ScenaRozgrywkiController;

public abstract class PromowalnaBierka extends Bierka{
    boolean promowana = false;

    //konstruktor
    protected PromowalnaBierka(ScenaRozgrywkiController plansza, Kolor kolor, Stan stan, int wiersz, int kolumna, int obrazek) {
        super(plansza, kolor, stan, wiersz, kolumna, obrazek);
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
        if(x == this.logX && y == this.logY)return false;
        if(x == this.logX-1 && y == this.logY-1)return false;
        if(x == this.logX+1 && y == this.logY-1)return false;
        for(int xl = x-1; xl <= (x + 1); xl++)
            for(int yl = y-1; yl <= (y + 1); yl++)
                if(xl == this.logX && yl == this.logY) return true;
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
