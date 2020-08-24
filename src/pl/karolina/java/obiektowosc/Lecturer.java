package pl.karolina.java.obiektowosc;

import java.util.Objects;

public class Lecturer extends Person {

    private String title;

    public Lecturer(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecturer lecturer = (Lecturer) o;
        return title.equals(lecturer.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
