package pl.karolina.generyki;

import lombok.Getter;

import java.util.Arrays;

@Getter
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
