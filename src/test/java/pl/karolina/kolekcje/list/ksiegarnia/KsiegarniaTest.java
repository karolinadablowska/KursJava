package pl.karolina.kolekcje.list.ksiegarnia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

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
}
