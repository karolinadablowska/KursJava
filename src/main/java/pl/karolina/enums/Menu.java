package pl.karolina.enums;

public class Menu {
    public static final int DODAJ = 1;
    public static final int USUN = 2;
    public static final int WYSWIETL = 3;

    public void wyswietl() {
        System.out.println(DODAJ+" - dodaj");
        System.out.println(USUN+" - usuń");
        System.out.println(WYSWIETL+" - wyświetl");
    }

    public void wyswietlOpcje(){
        for(OpcjeMenu opcja : OpcjeMenu.values()){
            System.out.println(opcja.value+" - "+opcja);
        }
    }
}
