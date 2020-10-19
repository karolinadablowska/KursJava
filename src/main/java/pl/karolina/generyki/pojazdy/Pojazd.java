package pl.karolina.generyki.pojazdy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Pojazd {
    private String nazwa;

    public void uruchom(){
        System.out.println("Jadę.");
    }
}
