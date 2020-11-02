package pl.karolina.kolekcje.list.ksiegarnia;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Ksiegarnia {
    List<Ksiazka> ksiazki = new ArrayList<>();

    public void add(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
    }

    public void remove(Ksiazka ksiazka) {
        ksiazki.remove(ksiazka);
    }

    public Ksiazka find(Ksiazka ksiazka1) {
        for(Ksiazka ksiazka : ksiazki){
            if(ksiazka.equals(ksiazka1)){
                return ksiazka;
            }
        }
        return null;
    }
}
