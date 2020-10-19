package pl.karolina.generyki.pojazdy;

import lombok.AllArgsConstructor;
import pl.karolina.generyki.Lista;
import pl.karolina.generyki.sklep.MinMax;

@AllArgsConstructor
public class SklepZPojazdami implements MinMax<Pojazd> {
    private Lista<Pojazd> pojazdy;

    @Override
    public Pojazd min() {
        Pojazd pojazdSzukany = pojazdy.getWartosci()[0];
        for(Pojazd pojazd : pojazdy.getWartosci()){
            if(pojazd.getCena() < pojazdSzukany.getCena()){
                pojazdSzukany = pojazd;
            }
        }
        return pojazdSzukany;
    }

    @Override
    public Pojazd max() {
        Pojazd pojazdSzukany = pojazdy.getWartosci()[0];
        for(Pojazd pojazd : pojazdy.getWartosci()){
            if(pojazd.getCena() > pojazdSzukany.getCena()){
                pojazdSzukany = pojazd;
            }
        }
        return pojazdSzukany;
    }
}
