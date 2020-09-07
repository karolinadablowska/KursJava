package pl.karolina.java.obiektowosc.interfejsy.samochod;

public class Main {
    public static void main(String[] args) {
        Silnik silnik;
        Komputer komputer;

        Samochod s1 = new SamochodOsobowy();
        Samochod s2 = new SamochodOsobowy();
        Samochod s3 = new SamochodOsobowy();
        Samochod s4 = new SamochodOsobowy();

        s1.wlacz();
        s1.zatrzymaj();
        s1.wlaczMape();

        silnik = s1;
        silnik.wlacz();

        komputer = s1;
        komputer.wlacz();
    }
}
