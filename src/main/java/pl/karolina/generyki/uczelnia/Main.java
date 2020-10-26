package pl.karolina.generyki.uczelnia;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Marek", 3.3);
        Student s2 = new Student("Jarek", 5.3);
        Student s3 = new Student("Czarek", 2.0);
        Student s4 = new Student("Stefan", 4.1);

        Dziekanat dziekanat = new Dziekanat(s1, s2, s3, s4);

        System.out.println("Student z najniższą średnią: "+dziekanat.min());
        System.out.println("Student z najwyższą średnią: "+dziekanat.max());


    }
}
