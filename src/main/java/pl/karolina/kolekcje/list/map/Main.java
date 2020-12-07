package pl.karolina.kolekcje.list.map;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SlownikAngPol slownik = new SlownikAngPol();
        slownik.dodaj("dog", "pies");
        slownik.dodaj("cat", "kot");
        slownik.dodaj("book", "książka");
        slownik.dodaj("window", "okno");
        slownik.dodaj("microphone", "mikrofon");

        Scanner scanner = new Scanner(System.in);
        String naszaOdp, poprawnaOdpowiedz;
        do{
            String ang = slownik.wylosujSlowko();
            System.out.println(ang);

            naszaOdp = scanner.next();
            poprawnaOdpowiedz = slownik.sprawdzOdpowiedz(ang);
        } while(naszaOdp.equals(poprawnaOdpowiedz));
    }
}
