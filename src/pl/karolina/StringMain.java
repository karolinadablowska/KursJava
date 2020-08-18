package pl.karolina;

public class StringMain{
    public static void main(String[] args) {

        String imie = "Marekk";
        System.out.println("imie: "+imie);
        System.out.println("imie.length(): "+imie.length());
        System.out.println("imie.charAt(2) " +imie.charAt(2));
        imie = imie.replaceAll("kk", "k");
        System.out.println("imie: "+imie);

        int liczba1 = 1;
        int liczba2 = 1;

        System.out.println(liczba1 == liczba2);

        String imie1 = new String("Karol");
        String imie2 = new String("Karol");

        System.out.println(imie1 == imie2);

//        imie1.intern();
//        imie2.intern();
//
//        System.out.println(imie1 == imie2);

        String imie3 = "Karol";
        System.out.println(imie2 == imie3);

        String imie4 = "Karol";
        System.out.println(imie3 == imie4);

        System.out.println(imie2.equals(imie3));

    }
}
