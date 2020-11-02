package pl.karolina.kolekcje.list.ksiegarnia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KsiegarniaTest {

    @Test
    public void addTest(){
        // given
        Ksiegarnia ksiegarnia = new Ksiegarnia();

        // when
        Ksiazka ksiazka = new Ksiazka("ABC");
        ksiegarnia.add(ksiazka);

        // then
        assertFalse(ksiegarnia.getKsiazki().isEmpty());
    }

    @Test
    public void removeTest(){
        // given
        Ksiegarnia ksiegarnia = new Ksiegarnia();
        Ksiazka ksiazka = new Ksiazka("ABC");
        ksiegarnia.add(ksiazka);

        // when
        ksiegarnia.remove(ksiazka);

        // then
        assertTrue(ksiegarnia.getKsiazki().isEmpty());
    }
}
