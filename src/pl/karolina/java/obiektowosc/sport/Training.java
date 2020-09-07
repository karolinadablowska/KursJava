package Sport;

import java.time.LocalDateTime;

public class Training {

    private String Sportsman;
    private String Coach;
    private String FootballPlayer;
    private String Runner;
    private String Swimmer;
    private LocalDateTime time;

    public Training(String sportsman, String coach, String footballPlayer, String runner, String swimmer, LocalDateTime time) {
        this.Sportsman = sportsman;
        this.Coach = coach;
        this.FootballPlayer = footballPlayer;
        this.Runner = runner;
        this.Swimmer = swimmer;
        this.time = time;

    }



}
