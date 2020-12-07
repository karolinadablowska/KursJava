package pl.karolina.kolekcje.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();

        liczby.add(-2);
        liczby.add(5);
        liczby.add(4);
        liczby.add(-100);
        liczby.add(50);
        liczby.add(10);

        System.out.println(liczby);


        Iterator<Integer> iterator = liczby.iterator();

        for(int i = 0; i < 3; i++) {
            System.out.println(iterator.next());
        }

        for(int i = 0; i < 3; i++) {
            System.out.println(iterator.next());
        }

        System.out.println("--------------- litst iterator ---------------");
        ListIterator<Integer> listIterator = liczby.listIterator();
        for(int i = 0; i < 3; i++) {
            System.out.println(listIterator.next());
        }
        for(int i = 0; i < 3; i++) {
            System.out.println(listIterator.previous());
        }
        for(int i = 0; i < 2; i++) {
            System.out.println(listIterator.next());
        }
        for(int i = 0; i < 1; i++) {
            System.out.println(listIterator.previous());
        }

        System.out.println("-------------- zamiana -----------------");

        listIterator = liczby.listIterator();
        while(listIterator.hasNext()) {
            Integer liczba = listIterator.next();
            if(liczba < 0){
                listIterator.set(-liczba);
            }
        }

        System.out.println(liczby);

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}

// adfaklsdf fdslkafda
