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

    //rozmiar okna
    public Board(){
        this.setPreferredSize(new Dimension(kolumny * rozmiarKomorki, wiersze *rozmiarKomorki));
        dodajBierki();
    }

    //bierki
    public void dodajBierki(){
        listaBierek.add(new Krol(this, Kolor.BIALY, Stan.NA_PLANSZY, 4,8));
        listaBierek.add(new Wieza(this, Kolor.BIALY, Stan.NA_PLANSZY, 7,7));
        listaBierek.add(new Goniec(this, Kolor.BIALY, Stan.NA_PLANSZY, 1,7));
        listaBierek.add(new ZlotyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 3,8));
        listaBierek.add(new ZlotyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 5,8));
        listaBierek.add(new SrebrnyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 2,8));
        listaBierek.add(new SrebrnyGeneral(this, Kolor.BIALY, Stan.NA_PLANSZY, 6,8));
        listaBierek.add(new Skoczek(this, Kolor.BIALY, Stan.NA_PLANSZY, 1,8));
        listaBierek.add(new Skoczek(this, Kolor.BIALY, Stan.NA_PLANSZY, 7,8));
        listaBierek.add(new Lanca(this, Kolor.BIALY, Stan.NA_PLANSZY, 0,8));
        listaBierek.add(new Lanca(this, Kolor.BIALY, Stan.NA_PLANSZY, 8,8));
        //to nie jest dobre rozwiązanie, ale na razie wystarczy tylko po to żeby ustawić bierki
        // na planszy (ciężko będzie wyciągnąć jedną bierke z pętli)
        for (wiersze = 0; wiersze < 9; wiersze++)
            listaBierek.add(new Pion(this, Kolor.BIALY, Stan.NA_PLANSZY, wiersze ,6));
    }
    //plansza
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
