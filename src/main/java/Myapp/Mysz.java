package Myapp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mysz extends MouseAdapter {

    public int x, y;
    public boolean nacisnieto;

    public void mousePressed(MouseEvent e) {
        nacisnieto = true;
    }

    public void mouseReleased(MouseEvent e) {
        nacisnieto = false;
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
}
