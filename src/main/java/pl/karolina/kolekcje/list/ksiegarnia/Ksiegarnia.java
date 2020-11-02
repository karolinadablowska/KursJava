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
}
