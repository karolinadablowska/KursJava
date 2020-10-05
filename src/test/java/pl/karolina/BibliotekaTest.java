package pl.karolina;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotekaTest {

    @Test
    @DisplayName("Dodaj jedną książkę.")
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

    @Test
    public void poszukajKsiazkeTest(){
        // given
        Ksiazka k1 = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        Ksiazka k2 = new Ksiazka("SQL od podstaw.", "Marek");
        Ksiazka[] ksiazki = {k1, k2};
        Biblioteka biblioteka = new Biblioteka(ksiazki);

        // when
        Ksiazka ksiazka = biblioteka.poszukajKsiazke("SQL od podstaw.");

        // then
        assertEquals(ksiazka, k2);
    }


}
