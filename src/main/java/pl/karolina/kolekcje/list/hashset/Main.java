package pl.karolina.kolekcje.list.hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Deanary deanary = new Deanary();

        for (int i = 0; i < 1000; i++) {
            deanary.addStudent();
            System.out.println(deanary);
        }

    }
}
