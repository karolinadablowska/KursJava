package pl.karolina.kolekcje.list.priorityqueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------- sklep 1 ----------------");
        Sklep sklep = new Sklep(new StatusComparator());
        Osoba osoba;

        osoba = new Osoba("Marek", Status.NIEPELNOSPRAWNY);
        sklep.dodaj(osoba);

        osoba = new Osoba("Ania");
        sklep.dodaj(osoba);

        osoba = new Osoba("Kasia", Status.W_CIAZY);
        sklep.dodaj(osoba);

        osoba = new Osoba("Krystyna");
        sklep.dodaj(osoba);

        osoba = new Osoba("Tomek");
        sklep.dodaj(osoba);

        osoba = new Osoba("Maria", Status.W_CIAZY);
        sklep.dodaj(osoba);

        sklep.wyswietlKolejke();


        System.out.println("----------------- sklep 2 ----------------");
        Sklep sklep2 = new Sklep(new StatusComparator2());
        osoba = new Osoba("Marek", Status.NIEPELNOSPRAWNY);
        sklep2.dodaj(osoba);

        osoba = new Osoba("Ania");
        sklep2.dodaj(osoba);

        osoba = new Osoba("Kasia", Status.W_CIAZY);
        sklep2.dodaj(osoba);

        osoba = new Osoba("Krystyna");
        sklep2.dodaj(osoba);

        osoba = new Osoba("Tomek");
        sklep2.dodaj(osoba);

        sklep2.wyswietlKolejke();
    }
}
