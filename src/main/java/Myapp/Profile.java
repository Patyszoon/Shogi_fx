package Myapp;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Profile {
    private Map<String, Statystyki> profileStatystyki = new HashMap<>();
    private String aktualnyProfil;

    public Profile() {
        wczytajWszystkieProfileZPlikow();

        if (!profileStatystyki.containsKey("domyslny")) {
            stworzNowyProfil("domyslny");
        }
        if (!profileStatystyki.containsKey("gosc")) {
            stworzNowyProfil("gosc");
        }

        if (profileStatystyki.isEmpty()) {
            aktualnyProfil = "domyslny";
        } else {
            aktualnyProfil = profileStatystyki.keySet().iterator().next();
        }
    }

    private void wczytajWszystkieProfileZPlikow() {
        File katalog = new File(".");
        File[] pliki = katalog.listFiles((dir, name) ->
                name.startsWith("statystyki_") && name.endsWith(".txt"));

        if (pliki != null) {
            for (File plik : pliki) {
                String nazwaPliku = plik.getName();
                String nazwaProfilu = nazwaPliku.substring("statystyki_".length(), nazwaPliku.length() - 4);
                stworzNowyProfil(nazwaProfilu);
            }
        }
    }

    public void stworzNowyProfil(String nazwaProfilu) {
        if (!profileStatystyki.containsKey(nazwaProfilu)) {
            Statystyki noweStatystyki = new Statystyki(nazwaProfilu);
            profileStatystyki.put(nazwaProfilu, noweStatystyki);
        }
    }

    public void ustawAktualnyProfil(String nazwaProfilu) {
        if (profileStatystyki.containsKey(nazwaProfilu)) {
            aktualnyProfil = nazwaProfilu;
        }
    }

    public Statystyki getAktualneStatystyki() {
        return profileStatystyki.get(aktualnyProfil);
    }

    public String[] getDostepneProfile() {
        return profileStatystyki.keySet().toArray(new String[0]);
    }

    public boolean czyProfilIstnieje(String nazwaProfilu) {
        return profileStatystyki.containsKey(nazwaProfilu);
    }


}

