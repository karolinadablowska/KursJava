package pl.karolina.java.obiektowosc.interfejsy.radio;

public class SamsungRadio implements Radio {
    private String model;

    public SamsungRadio(String model) {
        this.model = model;
    }

    @Override
    public void wlacz() {
        System.out.println("Wlączam Samsung-"+model);
    }

    @Override
    public void wylacz() {
        System.out.println("Wyłączam Samsung-"+model);
    }

    @Override
    public void zmienStacje(int numer) {
        System.out.println("Zmieniam stację w Samsung-"+model);
    }
}
