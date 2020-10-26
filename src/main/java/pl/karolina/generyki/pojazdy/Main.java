package pl.karolina.generyki.pojazdy;

import pl.karolina.generyki.Lista;

public class Main {
    public static void main(String[] args) {
        Rower r1 = new Rower("A234", 1231.12);
        Rower r2 = new Rower("B234", 123);
        Rower r3 = new Rower("C123", 991);
        Samochod s = new Samochod("BMW", 12312);

        Narzedzia.uruchom(r1);
        Narzedzia.uruchom(s);

        Lista<Pojazd> rowery = new Lista<>(r1, r2, r3);


        SklepZPojazdami sklepZPojazdami = new SklepZPojazdami(rowery);
        System.out.println("Najtańszy rower: "+sklepZPojazdami.min());
        System.out.println("Najdroższy rower: "+sklepZPojazdami.max());
    }
}
