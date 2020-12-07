package pl.karolina.kolekcje.list.priorityqueue;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Osoba {
    private String imie;
    private Status status;

    public Osoba(String imie) {
        this.imie = imie;
        this.status = Status.DOMYSLNY;
    }

    public Osoba(String imie, Status status) {
        this.imie = imie;
        this.status = status;
    }
}
