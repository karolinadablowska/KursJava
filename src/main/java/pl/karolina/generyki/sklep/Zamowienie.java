package pl.karolina.generyki.sklep;

import java.time.LocalDate;

public class Zamowienie {
    private Lista<?> zamowienia;
    private LocalDate dataNadania = LocalDate.now();

    public Zamowienie(Lista<?> zamowienia) {
        this.zamowienia = zamowienia;
    }

    public void zamow() {
        System.out.println(zamowienia);
    }
}
