package pl.karolina.generyki.uczelnia;

import pl.karolina.generyki.Lista;
import pl.karolina.generyki.pojazdy.Pojazd;
import pl.karolina.generyki.sklep.MinMax;

public class Dziekanat implements MinMax<Student> {
    Lista<Student> studenci;

    public Dziekanat(Student ... studenci) {
        this.studenci = new Lista<>(studenci);
    }

    @Override
    public Student min() {
        Student student = studenci.getWartosci()[0];
        for(Student s : studenci.getWartosci()){
            if(s.getSredniaOcen() < student.getSredniaOcen()){
                student = s;
            }
        }
        return student;
    }

    @Override
    public Student max() {
        Student student = studenci.getWartosci()[0];
        for(Student s : studenci.getWartosci()){
            if(s.getSredniaOcen() > student.getSredniaOcen()){
                student = s;
            }
        }
        return student;
    }
}
