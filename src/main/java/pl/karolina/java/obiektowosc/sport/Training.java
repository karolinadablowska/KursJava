package pl.karolina.java.obiektowosc.sport;

import java.time.LocalDateTime;

public class Training {

    private Sportsman[] sportsmans;
    private Coach Coach;
    private LocalDateTime time;

    public Training(Sportsman[] sportsmans, Coach coach, LocalDateTime time) {
        this.sportsmans = sportsmans;
        Coach = coach;
        this.time = time;
    }

    void train() {
        for (Sportsman sportsman : sportsmans){
            System.out.println(sportsman.train());
        }
    }
}
