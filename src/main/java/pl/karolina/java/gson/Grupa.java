package pl.karolina.java.gson;

public class Grupa {

    private int index = 0;
    private String nazwa;
    private Osoba[] osoby;

    public Grupa(int size, String nazwa) {
        this.osoby = new Osoba[size];
        this.nazwa = nazwa;
    }

    public void dodaj(Osoba osoba) {
        try {
            osoby[index] = osoba;
            index++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Brak miejsca w grupie.");
        }
    }
}
