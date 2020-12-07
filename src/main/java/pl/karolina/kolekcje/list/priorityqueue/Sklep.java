package pl.karolina.kolekcje.list.priorityqueue;

import lombok.ToString;

import java.util.Comparator;
import java.util.PriorityQueue;

@ToString
public class Sklep {
    PriorityQueue<Osoba> kolejka;

    public Sklep(Comparator<Osoba> comp) {
        kolejka = new PriorityQueue<>(comp);
    }

    public void dodaj(Osoba osoba) {
        kolejka.offer(osoba);
    }

    public void wyswietlKolejke() {
        do {
            System.out.println(kolejka.poll());
        } while(!kolejka.isEmpty());
    }
}
