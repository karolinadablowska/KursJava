package pl.karolina.generyki.sklep;

import java.util.Arrays;

public class Lista<T> {
    private T[] wartosci;

    public Lista(T... wartosci) {
        this.wartosci = wartosci;
    }

    public void zamien(int i, T wartosc) {
        wartosci[i] = wartosc;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "wartosci=" + Arrays.toString(wartosci) +
                '}';
    }
}
