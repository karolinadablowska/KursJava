package pl.karolina.java.obiektowosc.sport;

import java.time.LocalDate;

public class Coach extends Person {

    private double salary;
    private String experience;

    Coach(String name, String surname, LocalDate birthDate, double salary, String experience) {
        super(name, surname, birthDate);
        this.salary = salary;
        this.experience = experience;
    }


}
