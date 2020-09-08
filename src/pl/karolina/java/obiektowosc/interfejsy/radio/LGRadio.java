package pl.karolina.java.obiektowosc.interfejsy.radio;

public class LGRadio implements Radio {
    private String model;

    public LGRadio(String model) {
        this.model = model;
    }

    @Override
    public void wlacz() {
        System.out.println("Wlączam LG-"+model);
    }

    @Override
    public void wylacz() {
        System.out.println("Wyłączam LG-"+model);
    }

    @Override
    public void zmienStacje(int numer) {
        Radio.super.zmienStacje(1);
        System.out.println("Wyświetl na ekranie.");
    }
}
