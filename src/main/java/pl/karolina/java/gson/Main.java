package pl.karolina.java.gson;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Osoba os1 = new Osoba("Marek", 45);
        String os1AsJson = gson.toJson(os1);
        System.out.println(os1AsJson);

        Grupa grupa = new Grupa(5, "Grupa 1");
        grupa.dodaj(new Osoba("Jurek", 22));
        grupa.dodaj(new Osoba("Czarek", 25));
        grupa.dodaj(new Osoba("Franek", 11));
        grupa.dodaj(new Osoba("Kasia", 75));
        grupa.dodaj(new Osoba("Ania", 66));
        os1AsJson = gson.toJson(grupa);
        System.out.println(os1AsJson);
    }
}
