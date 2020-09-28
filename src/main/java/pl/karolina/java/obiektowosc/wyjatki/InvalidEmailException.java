package pl.karolina.java.obiektowosc.wyjatki;

public class InvalidEmailException extends Exception {
    public InvalidEmailException(){
        super("Niepoprawny email.");
    }
}
