package pl.karolina.kolekcje.list.ksiegarnia;

import org.junit.jupiter.api.Test;

public class KsiegarniaTest {

    @Test
    public void addTest(){
        // given
        Ksiegarnia ksiegarnia = new Ksiegarnia();

        // when
        Ksiazka ksiazka = new Ksiazka("ABC");

        // then
        assertFalse(ksiegarnia.getKsiazki().isEmpty());
    }
}
