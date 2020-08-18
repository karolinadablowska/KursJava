package pl.karolina.visibility;

import pl.karolina.Person;

public class Lecturer extends Person {

    public Lecturer(String name, String surname, int age) {
        super(name, surname, age);
    }

    public void displayName(){
        System.out.println("Name lokalne: "+name);
        System.out.println("Name z klasy lecturer: "+this.name);
        System.out.println("Name z klasy nadrzędnej (student): "+super.name);
    }

}
