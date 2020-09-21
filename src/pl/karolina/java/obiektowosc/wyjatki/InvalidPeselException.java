package pl.karolina.java.obiektowosc.wyjatki;

public class InvalidPeselException extends Exception {
    public InvalidPeselException(){
        super("Niepoprawny pesel.");
    }
}
