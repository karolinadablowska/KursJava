package pl.karolina;

public class Biblioteka {
    private int iterator = 0;
    Ksiazka[] ksiazki = new Ksiazka[10];

    public Biblioteka(){}

    public Biblioteka(Ksiazka[] ksiazki) {
        this.ksiazki = ksiazki;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki[iterator++] = ksiazka;
    }

    public int ileKsiazek() {
        return iterator;
    }

    public Ksiazka poszukajKsiazke(String tytulKsiazki) {
        for(int i = 0; i < ksiazki.length && ksiazki[i] != null; i++){
            if(ksiazki[i].getTytul().equals(tytulKsiazki)){
                return ksiazki[i];
            }
        }
        return null;
    }
}
