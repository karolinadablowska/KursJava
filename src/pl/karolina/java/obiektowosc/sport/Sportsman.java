package pl.karolina.java.obiektowosc.sport;

import Sport.Coach;
import Sport.FootballPlayer;
import Sport.Person;

import java.time.LocalDate;

abstract class Sportsman extends Person {

    private String diet;
    private LocalDate startOfCareer;
    private FootballPlayer.Club club;
    private Coach coach;


    Sportsman(String name, String surname, LocalDate birthDate, String diet, LocalDate startOfCareer, FootballPlayer.Club club, Coach coach) {
        super(name, surname, birthDate);
        this.diet = diet;
        this.startOfCareer = startOfCareer;
        this.club = club;
        this.coach = coach;

    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public LocalDate getStartOfCareer() {
        return startOfCareer;
    }

    public void setStartOfCareer(LocalDate startOfCareer) {
        this.startOfCareer = startOfCareer;
    }

    public FootballPlayer.Club getClub() {
        return club;
    }

    public void setClub(FootballPlayer.Club club) {
        this.club = club;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    abstract String train();


    public String toString() {
        return String.format(getName() + ", " + getSurname() + ", " + getBirthDate() + ", " + diet + "," + startOfCareer + ", " + club + ", " + coach);
    }
}


