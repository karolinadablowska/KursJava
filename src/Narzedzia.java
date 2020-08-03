public class Narzedzia {

    boolean czyRowne(Samochod a, Samochod b){
        return a.getRokProdukcji() == b.getRokProdukcji();
    }

    int zwieksz(int a ){
        a++;
        System.out.println("Wewnątrz: "+a);
        return a;
    }

    int zwieksz(Liczba a){
        a.a++;
        System.out.println("Wewnątrz: "+a.a);
        return a.a;
    }

    Liczba zwieksz1(Liczba a){
        a.a++;
        System.out.println("Wewnątrz: "+a.a);
        return a;
    }

    int i = 0;
    int sum(int a, int b){
        System.out.println(i++);
        return sum(a, b);
    }

}
