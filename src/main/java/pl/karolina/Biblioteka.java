package pl.karolina;

public class Biblioteka {
    private int iterator = 0;
    Ksiazka[] ksiazki = new Ksiazka[10];

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki[iterator++] = ksiazka;
    }

    public int ileKsiazek() {
        return iterator;
    }
}
