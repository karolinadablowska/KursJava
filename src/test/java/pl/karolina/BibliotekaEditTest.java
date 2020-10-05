package pl.karolina;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotekaEditTest {

    Ksiazka ksiazka;
    Biblioteka biblioteka;

    @BeforeEach
    public void init(){
        ksiazka = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        Ksiazka[] ksiazki = {ksiazka};
        biblioteka = new Biblioteka(ksiazki);
        System.out.println(biblioteka);
    }

    @Test
    public void edytujTytulKsiazki(){
        // when
        String nowyTytul = "Kompendium programisty Java. Wydanie XI";
        biblioteka.zmienTytulKsiazki("Kompendium programisty Java.", nowyTytul);

        // then
        assertEquals(ksiazka.getTytul(), nowyTytul);
    }

    @Test
    public void edytujAutoraKsiazki(){
        // when
        String nowyAutor = "Filip Kowalski";
        biblioteka.zmienAutora("Jurek Nowak", nowyAutor);

        // then
        assertEquals(ksiazka.getAutor(), nowyAutor);
    }

    @AfterEach
    public void display(){
        System.out.println(biblioteka);
    }
}
