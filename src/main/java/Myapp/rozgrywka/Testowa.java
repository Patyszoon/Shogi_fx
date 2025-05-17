package Myapp.rozgrywka;

public class Testowa
{
    public static void main(String[] args)
    {
        //ABY TESTOWAĆ NALEŻY DODAWAĆ KOLEJNE KLIKNIECIA

        Rozgrywka p = Rozgrywka.getInstancja();
        p.ruch(new Klikniecie(0,6));
        p.ruch(new Klikniecie(0,5));
        p.ruch(new Klikniecie(3,0));
        p.ruch(new Klikniecie(3,1));
        p.ruch(new Klikniecie(0,8));
        p.ruch(new Klikniecie(0,6));
        p.ruch(new Klikniecie(0,0));
        p.ruch(new Klikniecie(0,8));
        p.wypisNaKonsole();
    }
}
