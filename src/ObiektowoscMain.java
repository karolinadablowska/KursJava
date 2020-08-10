public class ObiektowoscMain {
    public static void main(String[] args) {
        // deklaracja
        Samochod prywatny;

        // deklara i alokacja
        Samochod sluzbowy = new Samochod();
        sluzbowy.setMarka("Opel");
        sluzbowy.setRokProdukcji(2000);
        sluzbowy.setCena(100000);

        // alokacja
        prywatny = new Samochod("Fiat", "Czerwony", 1999, 2222);

        Samochod zony = prywatny;

        zony.info();
        prywatny.info();
        sluzbowy.info();

        zony.setKolor("zielony");

        System.out.println("zony, marka: " + zony.getMarka());
        System.out.println("zony, kolor: " + zony.getKolor());
        System.out.println("prywatny, marka: " + prywatny.getMarka());
        System.out.println("prywatny, kolor: " + prywatny.getKolor());
        System.out.println("sluzbowy, marka: " + sluzbowy.getMarka());
        System.out.println("sluzbowy, kolor: " + sluzbowy.getKolor());


        /******* wywołanie metody ****/
        // metoda bez argumentów, nic nie zwracająca
        prywatny.uruchom();
        sluzbowy.uruchom();

        prywatny.setRokProdukcji(1900);

        boolean czyPrywatnyJestZabytkiem = prywatny.czyJestZabytkiem();
        boolean czySluzbowyJestZabytkiem = sluzbowy.czyJestZabytkiem();
        System.out.println("czyPrywatnyJestZabytkiem: " + czyPrywatnyJestZabytkiem);
        System.out.println("czySluzbowyJestZabytkiem: " + czySluzbowyJestZabytkiem);

        System.out.println("Jaka jest cena auta? " + prywatny.getCena());
        System.out.println("Jaka jest cena po rabacie 20%? " + Utils.priceDicount(prywatny.getCena(), 0.2));

        System.out.println("Jaka jest cena auta? " + sluzbowy.getCena());
        System.out.println("Jaka jest cena po rabacie 90%? " + Utils.priceDicount(prywatny.getCena(), 0.9));

        // przeciążenie metody
        System.out.println("2 + 2 = "+Math.sum(2, 2));
        System.out.println("2 + 2 + 4 + 5 = "+Math.sum(2, 2, 4, 5));
        System.out.println("2.34 + 2.43 = "+Math.sum(2.34, 2.43));

        // konstruktory
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod("Opel", 2010);
        Samochod samochod3 = new Samochod("BMW", "granatowy", 2020, 999999);
        samochod1.info();
        samochod2.info();
        samochod3.info();
        samochod1.setMarka("Fiat");
        samochod1.info();

        // użycie this
        Samochod samochod4 = new Samochod("Opel", 2010);
        Samochod samochod5 = new Samochod("Mercedes", 2010);
        samochod4.info();

        // przekazywanie obiektów jako argumentu metody
        Narzedzia narzedzia = new Narzedzia();
        System.out.println("Czy równe? "+narzedzia.czyRowne(samochod1, samochod3));
        System.out.println("Czy równe? "+narzedzia.czyRowne(samochod1, samochod1));
        System.out.println("Czy równe? "+narzedzia.czyRowne(samochod4, samochod5));


        // przekazywanie przez wartość i referencję
        // typy proste
        int liczba = 5;
        System.out.println("Przed: "+liczba);
        narzedzia.zwieksz(liczba);
        System.out.println("Po: "+liczba);

        Liczba liczbaObiekt = new Liczba();
        liczbaObiekt.a = 5;
        System.out.println("Przed: "+liczbaObiekt.a);
        narzedzia.zwieksz(liczbaObiekt);
        System.out.println("Po: "+liczbaObiekt.a);

        // narzedzia.sum(1,1);

        //
        Author author1 = new Author("Marian", "B");
        Book book1 = new Book("It", "6677888", author1, 222);
        System.out.println(author1.getCount());
        System.out.println("Jaka jest cena po rabacie 90%? " + Utils.priceDicount(book1.getPrice(), 0.9));

        Author author2 = new Author("Jurek", "B");
        Book book2 = new Book("The Pickwick Papers", "667888", author2, 22.3);
        System.out.println(author2.getCount());
        System.out.println("Jaka jest cena po rabacie 90%? " + Utils.priceDicount(book2.getPrice(), 0.9));


        System.out.println("Adres WP: "+Properties.URL_TO_WP);
    }
}
