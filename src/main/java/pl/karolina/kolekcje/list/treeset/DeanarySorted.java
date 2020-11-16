package pl.karolina.kolekcje.list.treeset;

import lombok.ToString;
import pl.karolina.kolekcje.list.hashset.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

@ToString
public class DeanarySorted {
    private TreeSet<Student> students = new TreeSet<>();

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
        System.out.println("Average: ");
        Double avg = scanner.nextDouble();
        return new Student(name, avg);
    }

    public Student maxAverage() {
        return students.last();
    }
}
