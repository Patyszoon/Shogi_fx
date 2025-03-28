package bierki;

import plansza.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class Bierka {
    protected Kolor kolor;
    protected Stan stan;
    protected int kolumna;
    protected int wiersz;
    public int x;
    public int y;

    //po zadaniu koordynatow na planszy zwraca informacje, czy jest to ruch zgodny z zasadami ruchu dla danej bierki
    public abstract boolean czyLegalny(int x, int y);

    //wywolywane gdy zbijany - zmienia jego stan an zbity i zmienia kolor
    public void zbity()
    {
        stan = Stan.ZBITY;
        if(kolor == Kolor.CZARNY) kolor = Kolor.BIALY; else kolor = Kolor.CZARNY; //zmiana koloru
        kolumna = 0;
        wiersz = 0;
    }

    public boolean czyWNiewoli()
    {
        return stan == Stan.ZBITY;
    }

    //przemieszcza na zadane pole i zwraca tablice z podanymi argumentami
    public int[] ruch(int x, int y)
    {
        kolumna = x;
        wiersz = y;
        return new int[]{kolumna, wiersz};
    }
    public int[] ruch(int[] pozycja)
    {
        kolumna = pozycja[0];
        wiersz = pozycja[1];
        return new int[]{kolumna, wiersz};
    }

    protected Bierka(Kolor kolor, Stan stan, int wiersz, int kolumna)
    {
        this.kolor = kolor;
        this.stan = stan;
        this.kolumna = kolumna;
        this.wiersz = wiersz;
    }

    public int[] getPozycja()
    {
        return new int[]{kolumna, wiersz};
    }

    public int getKolumna() {
        return kolumna;
    }

    public int getWiersz() {
        return wiersz;
    }

//sprite'y do bierek
    BufferedImage bierki;
    {
        try{
            bierki = ImageIO.read(ClassLoader.getSystemResourceAsStream("bierki.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //szerokość pliku graficznego/liczbę bierek
    protected int rozmiarSprite = bierki.getWidth()/9;

    Image sprite;
    Board board;

    public Bierka(Board board){
        this.board = board;
    }

    public void paint(Graphics2D g2d){
        g2d.drawImage(sprite, kolumna, wiersz, null);
    }

}
