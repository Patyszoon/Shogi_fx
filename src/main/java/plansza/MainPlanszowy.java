package plansza;

import javax.swing.*;
import java.awt.*;

public class MainPlanszowy {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setLayout(new GridBagLayout());
        okno.setMinimumSize(new Dimension(1000, 1000));
        okno.setTitle("Shogi");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLocationRelativeTo(null);

        Board plansza = new Board();
        okno.add(plansza);

        okno.setVisible(true);
    }
}