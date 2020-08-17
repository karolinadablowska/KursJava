package pl.karolina;

import pl.karolina.visibility.Lecturer;

public class InheritExample {

    public static void main(String[] args) {

        Person p1 = new Person("Marek", "Kowalski", 22);
        p1.display();
        System.out.println();

        Student s1 = new Student("Kasia", "Nowak", 22, 2223423);
        s1.display(); // overload
        s1.display('*'); // override

        System.out.println();
        s1.display('-');

        Lecturer lecturer = new Lecturer("","",22);

        Person[] persons = new Person[3];
        persons[0] = p1;
        persons[1] = s1;
        persons[2] = lecturer;

        for(Person p : persons){
            System.out.println(p.name);
        }

    }
}
