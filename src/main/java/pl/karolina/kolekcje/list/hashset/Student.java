package pl.karolina.kolekcje.list.hashset;

import lombok.EqualsAndHashCode;
import pl.karolina.kolekcje.list.linkedlist.Person;

@EqualsAndHashCode
public class Student extends Person implements Comparable<Student>{
    private int index;
    private double average;


    public Student(String name) {
        super(name);
        index = Generate.index();
    }

    public Student(String name, double average){
        this(name);
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "index=" + index +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(average == o.average){
            return getName().compareTo(o.getName());
        } else if(average > o.average){
            return 1;
        } else {
            return -1;
        }
    }
}
