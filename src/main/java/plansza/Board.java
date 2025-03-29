package plansza;

import bierki.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
    public int rozmiarKomorki = 75;
    int kolumny = 9;
    int wiersze = 9;

    ArrayList<Bierka> listaBierek = new ArrayList<>();

    public Board(){
        this.setPreferredSize(new Dimension(kolumny * rozmiarKomorki, wiersze *rozmiarKomorki));
        dodajBierki();
    }


    public void dodajBierki(){
        listaBierek.add(new Krol(this, Kolor.BIALY, Stan.NA_PLANSZY, 2,2));
        listaBierek.add(new Wieza(this, Kolor.BIALY, Stan.NA_PLANSZY, 300,2));
        listaBierek.add(new Goniec(this, Kolor.BIALY, Stan.NA_PLANSZY, 4,2));
        listaBierek.add(new ZlotyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 5,2));
        listaBierek.add(new SrebrnyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 6,2));
        listaBierek.add(new Skoczek(this, Kolor.BIALY, Stan.NA_PLANSZY, 7,2));
        listaBierek.add(new Lanca(this, Kolor.BIALY, Stan.NA_PLANSZY, 8,2));
        listaBierek.add(new Pion(this, Kolor.BIALY, Stan.NA_PLANSZY, 9,2));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (int w = 0; w < wiersze; w++) {
            for (int k = 0; k < kolumny; k++) {
                g2d.setColor(Color.white);
                g2d.fillRect( k * rozmiarKomorki, w * rozmiarKomorki, rozmiarKomorki, rozmiarKomorki);

                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawRect(k*rozmiarKomorki,w*rozmiarKomorki,rozmiarKomorki,rozmiarKomorki);
            }
        }
        for(Bierka bierka : listaBierek){
            bierka.paint(g2d);
        }
    }
}
