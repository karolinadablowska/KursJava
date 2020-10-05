package pl.karolina.java.obiektowosc.sport;

import pl.karolina.java.obiektowosc.sport.Coach;
import pl.karolina.java.obiektowosc.sport.FootballPlayer;

import java.time.LocalDate;

public class Runner extends Sportsman {

    private double distance;
    private double bestTime;

    public Runner(){ super(); }

    Runner(String name, String surname, LocalDate birthDate, String diet, LocalDate startOfCareer, FootballPlayer.Club club, Coach coach, double distance, double bestTime) {
        super(name, surname, birthDate, diet, startOfCareer, club, coach);
        this.distance = distance;
        this.bestTime = bestTime;

    }

    @Override
    String train() {
        return "I run ... ";
    }

    public String toString() {
        return String.format(getName() + ", " + getSurname() + ", " + getBirthDate() + ", " + getDiet() + "," + getStartOfCareer() + ", " + getClub() + ", " + getCoach() + distance + bestTime);
    }
}
