package rozgrywka;

public class Testowa
{
    public static void main(String[] args)
    {
        Rozgrywka p = new Rozgrywka();
        p.ruch(new Klikniecie(0,6));
        p.ruch(new Klikniecie(0,5));
        p.wypisNaKonsole();
    }
}
