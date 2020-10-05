import javax.xml.transform.sax.SAXSource;

class Samochod {
    private String marka;
    private String kolor;
    private int rokProdukcji;
    private double cena;

    Samochod(){}

    Samochod(String marka, int rokProdukcji) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }

    Samochod(String nowaMarka, String nowyKolor, int nowyRokProdukcji, double nowaCena) {
        marka = nowaMarka;
        kolor = nowyKolor;
        rokProdukcji = nowyRokProdukcji;
        cena = nowaCena;
    }

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

    void info(){
        System.out.println("-------- samochod --------");
        System.out.println("marka: "+marka);
        System.out.println("cena: "+cena);
        System.out.println("kolor: "+kolor);
        System.out.println("rokProdukcji: "+rokProdukcji);
    }

    public String getMarka(){
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
