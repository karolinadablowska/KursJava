package pl.karolina.kolekcje.list.hashset;

import lombok.EqualsAndHashCode;
import pl.karolina.kolekcje.list.linkedlist.Person;

@EqualsAndHashCode
public class Student extends Person {
    private int index;

    public Student(String name) {
        super(name);
        index = Generate.index();
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "index=" + index +
                '}';
    }
}
