package pl.karolina.generyki.sklep;

import pl.karolina.generyki.Lista;

public class Main {
    public static void main(String[] args) {
        Klient k1 = new Klient("Marek");
        Klient k2 = new Klient("Ania");
        Klient k3 = new Klient("Kasia");

        ListaKlientow listaKlientow = new ListaKlientow(k1, k2, k3);

        Komputer komp1 = new Komputer("ASUS 1231", 6);
        Komputer komp2 = new Komputer("DELL Vostro 3550", 32);
        Komputer komp3 = new Komputer("HP 34234", 4);

        ListaKomputerow listaKomputerow = new ListaKomputerow(komp1, komp2, komp3);

        Lista<Klient> listaKlientowGeneryk = new Lista<Klient>(k1, k2, k3);
        Lista<Komputer> listaKomputerowGeneryk = new Lista<Komputer>(komp1, komp2, komp3);

        System.out.println(listaKlientowGeneryk);

        Klient k4 = new Klient("Przemek");
        listaKlientowGeneryk.zamien(1, k4);

        System.out.println(listaKlientowGeneryk);
        System.out.println(listaKomputerowGeneryk);

        Klient k5 = new Klient("Jurek");
        Generator.wyswietl(k5);
        Sprzedawca s1 = new Sprzedawca("Sprzedawca");
        Generator.wyswietl(s1);

        Zamowienie z = new Zamowienie(listaKlientowGeneryk);
        z.zamow();

    }
}
