package pl.karolina.kolekcje.list.treeset;

public class Main {
    public static void main(String[] args) {
        DeanarySorted deanary = new DeanarySorted();

        for (int i = 0; i < 3; i++) {
            deanary.addStudent();
            System.out.println(deanary);
        }

        System.out.println("Max avg: "+deanary.maxAverage());
    }
}
