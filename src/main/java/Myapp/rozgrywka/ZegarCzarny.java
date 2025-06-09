package Myapp.rozgrywka;

public class ZegarCzarny {
    private static int dziesiate = 9;
    private static int sekundy = 0;
    private static int minutyOpcja = 10;
    private static int minuty = minutyOpcja;


    public ZegarCzarny(int minuty) {
        ZegarCzarny.minuty = minuty;
    }

    public ZegarCzarny(){

    };

    public static void setMinuty(int nowaMinuty) {
        minuty = nowaMinuty;
    }
    public static void setSekundy(int nowaSekundy) {
        sekundy = nowaSekundy;
    }

    public static int getMinuty() {
        return minuty;
    }

    public static int getMinutyOpcja() {
        return minutyOpcja;
    }

    public static void setMinutyOpcja(int nowaMinutyOpcja) {
        minutyOpcja = nowaMinutyOpcja;
    }

    public static int getSekundy() {
        return sekundy;
    }

    public static String getObecnyCzas() {
        return minuty + ":" + sekundy;
    }

    public static void mijanieCzasu() {
        dziesiate--;
        if (dziesiate == -1) {
            sekundy--;
            dziesiate = 9;
            if (sekundy == -1) {
                sekundy = 59;
                minuty--;
            }
        }
    }

    public static boolean koniecCzasu() {
        if (sekundy == 0 && minuty == 0) {return true;} else {return false;}
    }

}
