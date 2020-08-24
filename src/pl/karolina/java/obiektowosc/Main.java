package pl.karolina.java.obiektowosc;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Marek", 33);
        System.out.println(p1);
        System.out.println(p1.hashCode());

        System.out.println("-------------------------");

        Person p2 = new Person("Marek", 33);
        System.out.println(p2);
        System.out.println(p2.hashCode());

        System.out.println("-------------------------");

        Person p3 = p2;
        System.out.println(p2);
        System.out.println(p2.hashCode());

        System.out.println("--------------------------");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        Lecturer l = new Lecturer("Jurek", 22, "prof.");
        System.out.println(l);

        XYZ xyz = new XYZ();
        System.out.println(xyz);
    }
}
