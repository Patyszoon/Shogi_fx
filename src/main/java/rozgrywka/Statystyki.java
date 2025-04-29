package rozgrywka;

import java.io.*;
import java.util.Scanner;

public class Statystyki {
    private static final String PLIK_STATYSTYKI = "statystyki.txt";

    private int wygrane;
    private int przegrane;
    private int gry;

    public Statystyki() {
        wczytajStatystyki();
    }

    public int getWygrane() {
        return wygrane;
    }

    public int getPrzegrane() {
        return przegrane;
    }

    public int getLiczbaGier() {
        return gry;
    }

    public void dodajWygrana() {
        wygrane++;
        gry++;
        zapiszStatystyki();
    }

    public void dodajPrzegrana() {
        przegrane++;
        gry++;
        zapiszStatystyki();
    }

    private void wczytajStatystyki() {
        File plik = new File(PLIK_STATYSTYKI);

        if (!plik.exists()) {
            wygrane = 0;
            przegrane = 0;
            gry = 0;
            zapiszStatystyki();
            return;
        }

        try (Scanner scanner = new Scanner(plik)) {
            wygrane = scanner.nextInt();
            przegrane = scanner.nextInt();
            gry = scanner.nextInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void zapiszStatystyki() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PLIK_STATYSTYKI))) {
            writer.println(wygrane);
            writer.println(przegrane);
            writer.println(gry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
