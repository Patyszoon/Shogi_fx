package bierki;

import plansza.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class Bierka {

    //************************POLA********************************
    protected Kolor kolor;
    protected Stan stan;
    protected int logY;
    protected int logX;
    Image sprite;
    Board board;

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

    //*****************************METODY**********************************

    //Konstruktor
    protected Bierka(Board plansza, Kolor kolor, Stan stan, int x, int y, int obrazek) {
        this.kolor = kolor;
        this.stan = stan;
        this.logY = y;
        this.logX = x;
        this.board = plansza;
        wybierzImage(obrazek);
    }

    protected void wybierzImage(int numer)
    {
        this.sprite = bierki.getSubimage(numer * rozmiarSprite, 0, rozmiarSprite, rozmiarSprite).getScaledInstance(board.rozmiarKomorki, board.rozmiarKomorki, Image.SCALE_SMOOTH);
    }

    public int grafX()
    {
        return logX*board.rozmiarKomorki;
    }

    public int grafY()
    {
        return logY*board.rozmiarKomorki;
    }

    //po zadaniu koordynatow na planszy zwraca informacje, czy jest to ruch zgodny z zasadami ruchu dla danej bierki
    public abstract boolean czyLegalny(int x, int y);

    //wywolywane gdy zbijany - zmienia jego stan an zbity i zmienia kolor
    public void zbity()
    {
        stan = Stan.ZBITY;
        if(kolor == Kolor.CZARNY) kolor = Kolor.BIALY; else kolor = Kolor.CZARNY; //zmiana koloru
        logY = 0;
        logX = 0;
    }

    public boolean czyWNiewoli()
    {
        return stan == Stan.ZBITY;
    }

    //przemieszcza na zadane pole i zwraca tablice z podanymi argumentami
    public int[] ruch(int x, int y)
    {
        logY = x;
        logX = y;
        return new int[]{logY, logX};
    }
    public int[] ruch(int[] pozycja)
    {
        logY = pozycja[0];
        logX = pozycja[1];
        return new int[]{logY, logX};
    }

    public int[] getPozycja()
    {
        return new int[]{logY, logX};
    }

    public int getLogY() {
        return logY;
    }

    public int getLogX() {
        return logX;
    }

    public void paint(Graphics2D g2d){
        g2d.drawImage(sprite, grafX(), grafY(), null);
    }

}
