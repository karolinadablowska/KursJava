package pl.karolina.kolekcje.list.ksiegarnia;

public class KsiegarniaTest {


    public void addTest(){
        // given
        Ksiegarnia ksiegarnia = new Ksiegarnia();

        // when
        Ksiazka ksiazka = new Ksiazka("ABC");

        // then
        assertFalse(ksiegarnia.getKsiazki().isEmpty());
    }
}
