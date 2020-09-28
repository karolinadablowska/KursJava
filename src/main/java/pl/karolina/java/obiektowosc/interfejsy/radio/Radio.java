package pl.karolina.java.obiektowosc.interfejsy.radio;

public interface Radio {
    void wlacz();
    void wylacz();
    default void zmienStacje(int numer){
        System.out.println("Zmieniam na stacje numer "+numer);
    }
}

