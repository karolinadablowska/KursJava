package pl.karolina;

import java.util.Arrays;

public class Biblioteka {
    private int iterator = 0;
    private Ksiazka[] ksiazki = new Ksiazka[10];

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

    public void zmienTytulKsiazki(String obecnyTytul, String nowyTytul) {
        Ksiazka ksiazka = poszukajKsiazke(obecnyTytul);
        ksiazka.setTytul(nowyTytul);
    }

    public Ksiazka poszukajKsiazke(String tytulKsiazki) {
        for(int i = 0; i < ksiazki.length && ksiazki[i] != null; i++){
            if(ksiazki[i].getTytul().equals(tytulKsiazki)){
                return ksiazki[i];
            }
        }
        return null;
    }

    public void zmienAutora(String obecnyAutor, String nowyAutor) {
        Ksiazka ksiazka = poszukajKsiazkePoAutorze(obecnyAutor);
        ksiazka.setAutor(nowyAutor);
    }

    public Ksiazka poszukajKsiazkePoAutorze(String nazwaAutora) {
        for(int i = 0; i < ksiazki.length && ksiazki[i] != null; i++){
            if(ksiazki[i].getAutor().equals(nazwaAutora)){
                return ksiazki[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                "ksiazki=" + Arrays.toString(ksiazki) +
                '}';
    }
}
