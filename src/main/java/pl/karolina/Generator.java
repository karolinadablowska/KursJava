package pl.karolina;

import java.util.Random;

public class Generator {
    public static int generuj() {
        return new Random().nextInt(10);
    }
}
