package pl.karolina;

public class Person {
    protected String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void display(){
        System.out.print("name: "+name+", surname: "+surname+", age: "+age);
    }
}
