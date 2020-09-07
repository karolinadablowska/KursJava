package pl.karolina.java.obiektowosc.sport;

import java.time.LocalDate;

public class Swimmer extends Sportsman {

    private String style;
    private double bestTime;

    public Swimmer() { super(); }

    Swimmer(String name, String surname, LocalDate birthDate, String diet, LocalDate startOfCareer, FootballPlayer.Club club, Coach coach, String style, double bestTime) {
        super(name, surname, birthDate, diet, startOfCareer, club, coach);
        this.style = style;
        this.bestTime = bestTime;
    }

    @Override
    String train() {
        return "I swim ... ";
    }

    public String toString() {
        return String.format(getName() + ", " + getSurname() + ", " + getBirthDate() + ", " + getDiet() + "," + getStartOfCareer() + ", " + getClub() + ", " + getCoach() + style + bestTime);
    }
}
