package pl.karolina.visibility;

import pl.karolina.Student;

public class VisibilityTest {
    public static void main(String[] args) {
        Student student = new Student("", "", 22, 22222);

        Lecturer lecturer = new Lecturer("Karol", "", 22);
        lecturer.displayName();
    }
}
