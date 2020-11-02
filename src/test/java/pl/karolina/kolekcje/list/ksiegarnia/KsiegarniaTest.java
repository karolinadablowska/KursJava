package pl.karolina.kolekcje.list.ksiegarnia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void poszukajKsiazke(){
        // given
        Ksiegarnia ksiegarnia = new Ksiegarnia();
        Ksiazka ksiazka1 = new Ksiazka("ABC");
        ksiegarnia.add(ksiazka1);
        Ksiazka ksiazka2 = new Ksiazka("ZAC");
        ksiegarnia.add(ksiazka2);

        // when
        Ksiazka ksiazka3 = ksiegarnia.find(ksiazka1);

        // then
        assertEquals(ksiazka1, ksiazka3);
    }

    @Test
    public void poszukajNieistniejacaKsiazke(){
        // given
        Ksiegarnia ksiegarnia = new Ksiegarnia();
        Ksiazka ksiazka1 = new Ksiazka("ABC");
        ksiegarnia.add(ksiazka1);
        Ksiazka ksiazka2 = new Ksiazka("ZAC");
        ksiegarnia.add(ksiazka2);

        // when
        Ksiazka ksiazka3 = new Ksiazka("ZZZ");
        Ksiazka ksiazka4 = ksiegarnia.find(ksiazka3);

        // then
        assertNull(ksiazka4);
    }

}
