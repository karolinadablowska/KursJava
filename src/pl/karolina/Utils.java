package pl.karolina;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;
import java.lang.Math;

public class Utils {

    static double priceDicount(double price, double discount) {
        return price - (price * discount);
    }

    //metoda przyjmuje pesel i sprawdza czy jest poprawny. Poprawny jest wtedy gdy jego d�ugo�� jest r�wna 11 oraz wszystkie znaki to cyfry. Wykorzystaj Integer.parseInt();
    static boolean validatePesel(String pesel) {
        for (int i = 0; i < pesel.length(); i++) {
            if (pesel.length() == 11) {
                if (pesel.charAt(i) > 48 && pesel.charAt(i) < 58) {
                    return true;

                }
            }
        }
        return false;
    }

    //validateEmail - metoda przyjmuje email i sprawdza czy jest poprawny. Eemail musi posiada� znak @ oraz po ma�pie musi by� tekst a potem kropka i znowu tekst. Uzyj macher oraz regex.
    //https://www.samouczekprogramisty.pl/wyrazenia-regularne-w-jezyku-java/
    static boolean validateEmail(String mail) {
        Pattern pattern = Pattern.compile(".+@.+\\.com.");
        if (pattern.matcher(mail).matches()) {
            return true;
        }
        return false;
    }

    // metoda przyjmuje informacj� ile liczb ma wygenerowa� i w jakim zakresie. Metoda zwraca tablic� z wygenerowanymi liczbami.
    static String generateNumbes(int howMany, int min, int max) {
        Random random = new Random();
        int[] numbers = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            numbers[i] = min + (int) (Math.random() * ((max - min) + 1));
        }

        return Arrays.toString(numbers);

    }

    //contains - metoda przyjmuje tablic� warto�ci oraz pojedyncz� warto�� do poszukania w tablicy. Metoda zwraca informacj� czy istnieje lub nie istnieje podana warto�� w podanej tablicy.
    static boolean contains(int[] table, int number) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == number) {
                return true;
            }
        }
        return false;
    }


    //isEven - metoda otrzymuje tablic� liczb i sprawdza, czy wszystkie warto�ci w tej tablicy s� parzyste
    static boolean isEven(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    // nwd - dla podanych dw�ch liczb metoda zwraca najwi�kszy wsp�lny dzielnik
    public static int nwd(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return firstNumber;
    }

    public static void dispalyIndex(String name, int ... values){
        System.out.println("Name: "+name);
        for(int value : values){
            System.out.print(value+", ");
        }
        System.out.println();
    }
}


