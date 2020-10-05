package pl.karolina;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratorTest {

    @RepeatedTest(100)
    public void wygenerujLiczbe(){
        // when
        int i = Generator.generuj();

        //then
        assertTrue(i >= 0 && i < 10);
    }
}
