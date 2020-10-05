package pl.karolina.java.obiektowosc;

import javax.xml.transform.sax.SAXSource;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p2 = (Person) obj;
            if (age == p2.getAge() && name.equals(p2.getName())) {
                return true;
            }
        }
        return false;
    }

    // 1
    // dla o1 i o2
    // jeżeli o1.equals(o2) jest true to o1.hashCode() == o2.hashCode() też true

    // 2
    // dla o1 i o2
    // jeżeli o1.hashCode() == o2.hashCode() true to o1.equals(o2) nie musi być true
}
