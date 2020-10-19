package pl.karolina.generyki.pojazdy;

public class Main {
    public static void main(String[] args) {
        Rower r = new Rower("AASDF");
        Samochod s = new Samochod("BMW");

        Narzedzia.uruchom(r);
        Narzedzia.uruchom(s);
    }
}
