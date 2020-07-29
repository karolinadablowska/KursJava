public class ObiektowoscMain {
    public static void main(String[] args) {
        // deklaracja
        Samochod prywatny;

        // alokacja
        prywatny = new Samochod();
        prywatny.marka = "Fiat";
        prywatny.rokProdukcji = 1999;
        prywatny.kolor = "czerwony";
        prywatny.cena = 2222;

        // deklara i alokacja
        Samochod sluzbowy = new Samochod();
        sluzbowy.marka = "Opel";
        sluzbowy.rokProdukcji = 2000;
        sluzbowy.cena = 100000;


        Samochod zony = prywatny;

        zony.info();
        prywatny.info();
        sluzbowy.info();

        zony.kolor = "zielony";

        System.out.println("zony, marka: " + zony.marka);
        System.out.println("zony, kolor: " + zony.kolor);
        System.out.println("prywatny, marka: " + prywatny.marka);
        System.out.println("prywatny, kolor: " + prywatny.kolor);
        System.out.println("sluzbowy, marka: " + sluzbowy.marka);
        System.out.println("sluzbowy, kolor: " + sluzbowy.kolor);


        /******* wywołanie metody ****/
        // metoda bez argumentów, nic nie zwracająca
        prywatny.uruchom();
        sluzbowy.uruchom();

        prywatny.rokProdukcji = 1900;

        boolean czyPrywatnyJestZabytkiem = prywatny.czyJestZabytkiem();
        boolean czySluzbowyJestZabytkiem = sluzbowy.czyJestZabytkiem();
        System.out.println("czyPrywatnyJestZabytkiem: " + czyPrywatnyJestZabytkiem);
        System.out.println("czySluzbowyJestZabytkiem: " + czySluzbowyJestZabytkiem);

        System.out.println("Jaka jest cena auta? " + prywatny.cena);
        System.out.println("Jaka jest cena po rabacie 20%? " + prywatny.cenaPoRabacie(0.2));

        System.out.println("Jaka jest cena auta? " + sluzbowy.cena);
        System.out.println("Jaka jest cena po rabacie 90%? " + sluzbowy.cenaPoRabacie(0.9));

    }
}
