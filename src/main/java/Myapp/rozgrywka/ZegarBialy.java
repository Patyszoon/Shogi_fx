package Myapp.rozgrywka;

public class ZegarBialy {
    private static int sekundy = 0;
    private static int minuty = 10;

    public ZegarBialy(int minuty) {
        ZegarBialy.minuty = minuty;
    }

    public ZegarBialy(){

    };

    public static void setMinuty(int nowaMinuty) {
        minuty = nowaMinuty;
    }

    public static int getMinuty() {
        return minuty;
    }
    public static int getSekundy() {
        return sekundy;
    }

    public static String getObecnyCzas() {
        return minuty + ":" + sekundy;
    }

    public static void mijanieSekundy() {
        sekundy--;
        if (sekundy == -1) {
            sekundy = 59;
            minuty--;
        }
    }

    public static boolean koniecCzasu() {
        if (sekundy == 0 && minuty == 0) {return true;} else {return false;}
    }

}
