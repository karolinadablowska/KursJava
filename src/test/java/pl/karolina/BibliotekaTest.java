package pl.karolina;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BibliotekaTest {


    Biblioteka biblioteka = new Biblioteka();

    @Order(3)
    @Test
    @DisplayName("Dodaj jedną książkę.")
    public void dodajJednaKsiazkeTest(){
        Ksiazka ksiazka = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        biblioteka.dodajKsiazke(ksiazka);

        // when
        int ileKsiazek = biblioteka.ileKsiazek();

        //then
        assertEquals(1,ileKsiazek);
    }

    @Order(4)
    @Test
    public void dodajKolejnaJednaKsiazkeTest(){
        Ksiazka ksiazka = new Ksiazka("Bezpieczeństwo aplikacji webowych.", "Jurek Nowak");
        biblioteka.dodajKsiazke(ksiazka);

        // when
        int ileKsiazek = biblioteka.ileKsiazek();

        //then
        assertEquals(2,ileKsiazek);
    }

    @Order(1)
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

    @Test
    public void poszukajKsiazkeKtoraNieIstniejeTest(){
        // given
        Ksiazka k1 = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        Ksiazka k2 = new Ksiazka("SQL od podstaw.", "Marek");
        Ksiazka[] ksiazki = {k1, k2};
        Biblioteka biblioteka = new Biblioteka(ksiazki);

        // when
        Ksiazka ksiazka = biblioteka.poszukajKsiazke("Takiej ksiazki nie ma");

        // then
        assertNull(ksiazka);
    }

    @Order(2)
    @ParameterizedTest(name = "Ksiazka o nazwie {0}, nie istenieje")
    @CsvSource({ "JKASdfjla", "ADKFA", "Nie istniejaca"	})
    public void poszukajKsiazkeKtoraNieIstniejeTest(String tytulKsiazki){
        // given
        Ksiazka k1 = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        Ksiazka k2 = new Ksiazka("SQL od podstaw.", "Marek");
        Ksiazka[] ksiazki = {k1, k2};
        Biblioteka biblioteka = new Biblioteka(ksiazki);

        // when
        Ksiazka ksiazka = biblioteka.poszukajKsiazke(tytulKsiazki);

        // then
        assertNull(ksiazka);
    }






}
