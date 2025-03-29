package bierki;

import plansza.Board;

import java.util.LinkedList;

public abstract class PromowalnaBierka extends Bierka{
    boolean promowana = false;

    //konstruktor
    protected PromowalnaBierka(Board plansza, Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(plansza, kolor, stan, wiersz, kolumna);
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
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        boolean legalny = false;
        int[][] mozliwe = {{-1, 1}, {0, 1}, {1, 1},
                {-1, 0},/*{0,  0},*/{1, 0},
                /*{-1, -1},*/{0, -1},/*{1, -1}*/};
        int k = (kolor == Kolor.BIALY) ? 1 : -1;

        for (int[] ints : mozliwe) {
            if (((wiersz + ints[0]) == x) && ((kolumna + ints[1]) == y)) {
                legalny = true;
                break;
            }
        }
        return legalny;
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        if (promowana) {
            if (czyLegalnyPoPromocji(x, y)) return true;
        }
        return czyLegalnyPrzedPromocja(x, y);
    }

}
