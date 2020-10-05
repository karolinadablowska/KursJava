package pl.karolina.java.obiektowosc.wyjatki;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WyjatkiNieoznaczone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Podaj dzielną: ");
            int a = scanner.nextInt();

            System.out.print("Podaj dzielnik: ");
            int b = scanner.nextInt();

            int wynik = a / b;
            System.out.println(a + "/" + b + "=" + wynik);
        } catch (ArithmeticException dfjklasfd) {
            System.out.print("Sory, nie mogę dzielić przez 0.");
        } catch (NoSuchElementException e) {
            System.out.print("Podałeś niepoprawny format. Oczekuję liczby całkowitej.");
        } finally {
            scanner.close();
        }
    }
}
