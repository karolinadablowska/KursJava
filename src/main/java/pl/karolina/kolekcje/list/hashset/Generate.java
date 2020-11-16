package pl.karolina.kolekcje.list.hashset;

import java.util.Random;

public class Generate {
    private static final int MIN = 1000;
    private static final int MAX = 1010;

    public static int index() {
        return new Random().nextInt(MAX - MIN) + MIN;
    }
}
