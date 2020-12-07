package pl.karolina.kolekcje.list.priorityqueue;

import java.util.Comparator;

public class StatusComparator implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getStatus().compareTo(o2.getStatus());
    }
}
