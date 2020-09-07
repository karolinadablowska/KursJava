package pl.karolina.java.obiektowosc.sport;

import java.time.LocalDate;

public class FootballPlayer extends Sportsman {

    private String position;

    FootballPlayer(String name, String surname, LocalDate birthDate, String diet, LocalDate startOfCareer, Club club, Coach coach, String position) {
        super(name, surname, birthDate, diet, startOfCareer, club, coach);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    String train() {
        return "I kick the ball ...";
    }

    public String toString() {
        return String.format(getName() + ", " + getSurname() + ", " + getBirthDate() + ", " + getDiet() + "," + getStartOfCareer() + ", " + getClub() + ", " + getCoach() + position);
    }

    public static class Club {

        private String nameOfClub;
        private LocalDate dateOfStarting;



    }
}
