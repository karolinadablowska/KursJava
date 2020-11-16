package pl.karolina.kolekcje.list.hashset;

import lombok.ToString;

import java.util.HashSet;
import java.util.Scanner;

@ToString
public class Deanary {
    private HashSet<Student> students = new HashSet<>();

    public void addStudent() {

        boolean added = false;
        do {
            Student student = inputStudenData();
            added = students.add(student);
            System.out.println(student);
        } while (!added);

    }

    private Student inputStudenData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        return new Student(name);
    }
}
