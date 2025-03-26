package plansza;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    int rozmiarKomorki = 75;
    int kolumny = 9;
    int wiersze = 9;

    public Board(){
        this.setPreferredSize(new Dimension(kolumny * rozmiarKomorki, wiersze *rozmiarKomorki));
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
    }
}
