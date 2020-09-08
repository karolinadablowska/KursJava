package pl.karolina.java.obiektowosc.interfejsy.radio;

public class Main {

    public static void main(String[] args) {
        Radio radio;

        radio = new SamsungRadio("2131MASDF");
        radio.wlacz();
        radio.zmienStacje(1);

        radio = new LGRadio("ASKL23421");
        radio.wlacz();
        radio.zmienStacje(1);

        radio = new FergusonRadio();
        radio.wlacz();
        radio.zmienStacje(1);
    }
}
