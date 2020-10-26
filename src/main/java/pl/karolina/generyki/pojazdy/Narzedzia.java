package pl.karolina.generyki.pojazdy;

public class Narzedzia {

    public static <T extends Pojazd> void uruchom(T t){
        t.uruchom();
        System.out.println("("+t.getNazwa()+")");
    }
}
