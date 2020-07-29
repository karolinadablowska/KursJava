import javax.xml.transform.sax.SAXSource;

class Samochod {
    String marka;
    String kolor;
    int rokProdukcji;
    double cena;

    // metoda nic nie zwraca, nic nie przyjmuje
    void uruchom(){
        System.out.println("Uruchomiłem samochód... "+marka);
    }

    // metoda coś wzraca, nic nie przyjmuje
    boolean czyJestZabytkiem(){
        boolean czyZabytek;
        int obecnyRok = 2020;
        int ileMaLat = obecnyRok - rokProdukcji;

        if(ileMaLat > 50) {
            czyZabytek = true;
        } else {
            czyZabytek = false;
        }

        return czyZabytek;
    }

    // coś zwraca, coś przyjmuje
    // założenie jest takie, że rabat jest w formie 0,1 -> 10%
    double cenaPoRabacie(double rabat){
        return cena - (cena * rabat);
    }

    void info(){
        System.out.println("-------- samochod --------");
        System.out.println("marka: "+marka);
        System.out.println("cena: "+cena);
        System.out.println("kolor: "+kolor);
        System.out.println("rokProdukcji: "+rokProdukcji);
    }
}
