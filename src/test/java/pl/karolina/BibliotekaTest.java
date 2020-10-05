package pl.karolina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotekaTest {

    @Test
    public void dodajJednaKsiazkeTest(){
        // given
        Biblioteka biblioteka = new Biblioteka();
        Ksiazka ksiazka = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        biblioteka.dodajKsiazke(ksiazka);

        // when
        int ileKsiazek = biblioteka.ileKsiazek();

        //then
        assertEquals(1,ileKsiazek);
    }
}
