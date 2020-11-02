package pl.karolina.kolekcje.list;

import pl.karolina.kolekcje.list.ksiegarnia.Ksiazka;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ksiazka> ksiazki = new ArrayList<>();

        Ksiazka k1 = new Ksiazka("ABC");
        ksiazki.add(k1);

        Ksiazka k2 = new Ksiazka("DEF");
        ksiazki.add(k2);

        System.out.println(ksiazki);

        Ksiazka k3 = new Ksiazka("GHI");
        ksiazki.add(1, k3);

        System.out.println(ksiazki);

        List<Ksiazka> podlista = ksiazki.subList(1, 2);

        System.out.println(podlista);

        ksiazki.remove(2);
        System.out.println(ksiazki);


        Ksiazka k4 = new Ksiazka("DEF");
        Ksiazka k5 = new Ksiazka("AJK");
        Ksiazka k6 = new Ksiazka("ZZZ");
        ksiazki.add(k4);
        ksiazki.add(k5);
        ksiazki.add(k6);
        System.out.println(ksiazki);

        ksiazki.remove(k4);
        System.out.println(ksiazki);

        Ksiazka k7 = new Ksiazka("AJK");
        ksiazki.remove(k7);
        System.out.println(ksiazki);

        Ksiazka k8 = new Ksiazka("ZZZ");
        int index = ksiazki.indexOf(k8);
        System.out.println("Indeks ZZZ: "+index);

        boolean czyIstnieje = ksiazki.contains(new Ksiazka("AJK"));
        System.out.println("Czy istnieje AJK? "+czyIstnieje);

        System.out.println("Czy lista jest pusta? "+ksiazki.isEmpty());

        ArrayList<Ksiazka> ksiazki2 = new ArrayList<>();
        ksiazki2.add(new Ksiazka("AJK2"));
        ksiazki2.add(new Ksiazka("AJK3"));
        ksiazki2.add(new Ksiazka("AJK4"));

        ksiazki.addAll(ksiazki2);
        System.out.println(ksiazki);

        ksiazki.addAll(1, ksiazki2);
        System.out.println(ksiazki);

        int lastIndex = ksiazki.lastIndexOf(new Ksiazka("AJK4"));
        System.out.println("Ostatni indeks AJK4: "+lastIndex);

        System.out.println("Rozmiar listy: "+ksiazki.size());

        Ksiazka[] ksiazkiTab = new Ksiazka[ksiazki.size()];
        ksiazkiTab = ksiazki.toArray(ksiazkiTab);

        System.out.println("Tablica książek:");
        for(Ksiazka k : ksiazkiTab){
            System.out.println(k);
        }

        ksiazki.retainAll(ksiazki2);
        System.out.println(ksiazki);

        ksiazki.clear();
        System.out.println(ksiazki);

        System.out.println("Czy lista jest pusta? "+ksiazki.isEmpty());
    }

}
