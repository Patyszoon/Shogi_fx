package rozgrywka;

public class Testowa
{
    public static void main(String[] args)
    {
        Rozgrywka p = new Rozgrywka();
        p.ruch(new Klikniecie(0,2));
        p.ruch(new Klikniecie(0,3));
        p.wypisNaKonsole();
    }
}
