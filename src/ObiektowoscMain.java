public class ObiektowoscMain {
    public static void main(String[] args) {
        // deklaracja
        Samochod prywatny;

        // alokacja
        prywatny = new Samochod();
        prywatny.marka = "Fiat";
        prywatny.rokProdukcji = 1999;
        prywatny.kolor = "czerwony";

        // deklara i alokacja
        Samochod sluzbowy = new Samochod();
        sluzbowy.marka = "Opel";


        Samochod zony = prywatny;

        System.out.println("zony, marka: "+zony.marka);
        System.out.println("zony, kolor: "+zony.kolor);
        System.out.println("zony, rok produkcji: "+zony.rokProdukcji);
        System.out.println("prywatny, marka: "+prywatny.marka);
        System.out.println("prywatny, kolor: "+prywatny.kolor);
        System.out.println("prywatny, rok produkcji: "+prywatny.rokProdukcji);
        System.out.println("sluzbowy, marka: "+sluzbowy.marka);
        System.out.println("sluzbowy, kolor: "+sluzbowy.kolor);
        System.out.println("sluzbowy, rok produkcji: "+sluzbowy.rokProdukcji);

        zony.kolor = "zielony";

        System.out.println("zony, marka: "+zony.marka);
        System.out.println("zony, kolor: "+zony.kolor);
        System.out.println("prywatny, marka: "+prywatny.marka);
        System.out.println("prywatny, kolor: "+prywatny.kolor);
        System.out.println("sluzbowy, marka: "+sluzbowy.marka);
        System.out.println("sluzbowy, kolor: "+sluzbowy.kolor);

    }
}
