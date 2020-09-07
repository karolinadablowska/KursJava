package pl.karolina.java.obiektowosc.interfejsy.radio;

public class FergusonRadio implements RadioInternetowe {
    @Override
    public void polaczZWiFi(String nazwa) {
        System.out.println("Ferguson, WIFI...");
    }

    @Override
    public void wlacz() {
        System.out.println("Ferguson, włącz...");
    }

    @Override
    public void wylacz() {
        System.out.println("Ferguson, wyłącz...");
    }
}
