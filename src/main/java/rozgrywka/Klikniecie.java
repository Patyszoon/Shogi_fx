package rozgrywka;

public class Klikniecie {
    //ta klasa powinna pozwolić na przekazanie parametrów z kliknięcia

    //nie upieram się przy tym rozwiązaniu, równie dobrze można w inny sposób to rozwiązać,
    //np od razu przeliczać na współrzędne logiczne i je przekazywać do rozgrywki

    private int x, y;
    private boolean prawyKlawisz = false;
    public Klikniecie(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public boolean czyPrawy()
    {
        return prawyKlawisz;
    }

    public Klikniecie(int x, int y, boolean klawisz)
    {
        this.x = x;
        this.y = y;
        prawyKlawisz = klawisz;
    }
}
