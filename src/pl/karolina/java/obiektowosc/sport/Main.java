package Sport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>(5);
        persons.add(new Person("Basia", "kkkkk", LocalDate.of(1996, 02, 25)));
        persons.add(new Person("Kasia", "hhhhh", LocalDate.of(2000, 01, 16)));
        persons.add(new Coach("Bartek", "K", LocalDate.of(1998, 2, 5), 2500, "Bayern"));

        System.out.println("Your list: ");
        for (Person p : persons) {
            System.out.println(p.toString());
        }

        System.out.println(".................................................................");

        System.out.println("How old are persons? ");
        for (Person p : persons) {
            System.out.println(p.getName() + " is " + p.calculateAge(p.getBirthDate(), LocalDate.of(2020, 9, 01)) + " years old");
        }

        System.out.println(".................................................................");

        System.out.println("What person do you want to remove? Please enter an index....");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        persons.remove(index);

        System.out.println(".................................................................");

        System.out.println("Your list after remove: ");
        for (Person p : persons) {
            System.out.println(p);
        }

        String name;
        String surname;
        String birthDate;

        for (int i = 0; i < 5; i++) {
            System.out.println("Adding of persons");
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter surname");
            surname = sc.next();
            System.out.println("Enter birthdate [yyy,MM,dd]");
            birthDate = sc.next();

            DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("yyyy,MM,dd");
            LocalDate date = LocalDate.parse(birthDate, dateFormater);

            persons.add(new Person(name, surname, date));

            System.out.println("Your list after add: ");
            for (Person p : persons) {
                System.out.println(p);
            }


        }

    }

}

