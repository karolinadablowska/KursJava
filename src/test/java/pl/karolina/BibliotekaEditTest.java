package pl.karolina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotekaEditTest {

    @Test
    public void edytujTytulKsiazki(){
        // given
        Ksiazka k1 = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        Ksiazka[] ksiazki = {k1};
        Biblioteka biblioteka = new Biblioteka(ksiazki);

        // when
        String nowyTytul = "Kompendium programisty Java. Wydanie XI";
        biblioteka.zmienTytulKsiazki("Kompendium programisty Java.", nowyTytul);

        // then
        assertEquals(k1.getTytul(), nowyTytul);
    }

    @Test
    public void edytujAutoraKsiazki(){
        // given
        Ksiazka k1 = new Ksiazka("Kompendium programisty Java.", "Jurek Nowak");
        Ksiazka[] ksiazki = {k1};
        Biblioteka biblioteka = new Biblioteka(ksiazki);

        // when
        String nowyAutor = "Filip Kowalski";
        biblioteka.zmienAutora("Jurek Nowak", nowyAutor);

        // then
        assertEquals(k1.getAutor(), nowyAutor);
    }
}
