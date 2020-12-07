package pl.karolina.kolekcje.list.map;

import java.util.*;

public class SlownikAngPol {
    Map<String, String> slowka = new HashMap<>();

    public void dodaj(String key, String value) {
        slowka.put(key, value);
    }

    public String wylosujSlowko() {
        Set<String> klucze = slowka.keySet();

        Random random = new Random();
        int kluczZKolei = random.nextInt(klucze.size());

        Iterator<String> itarator = klucze.iterator();
        for(int i = 0; i < kluczZKolei; i++){
            itarator.next();
        }

        return itarator.next();
    }

    public String sprawdzOdpowiedz(String klucz) {
        return slowka.get(klucz);
    }
}
