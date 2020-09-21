package pl.karolina.java.obiektowosc.wyjatki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pesel:");
        String pesel = scanner.nextLine();

        System.out.println("Podaj email: ");
        String email = scanner.nextLine();

        UtilsValidate.validateForm(pesel, email);

    }
}
