package pl.karolina.java.obiektowosc.interfejsy.samochod;

public abstract class Samochod implements Komputer, Silnik {
    void zatrzymaj(){
        System.out.println("Zatrzymuję samochód.");
    }

    @Override
    public void wlacz() {
        System.out.println("Włączam... ");
    }
}
