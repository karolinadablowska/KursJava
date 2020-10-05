package pl.karolina.java.gson;

import com.google.gson.Gson;
import pl.szymonleyk.generateddata.GeneratePersonData;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Osoba os1 = new Osoba(GeneratePersonData.generateName(), 45);
        String os1AsJson = gson.toJson(os1);
        System.out.println(os1AsJson);

        int sizeOfGroup = 100_000;

        Grupa grupa = new Grupa(sizeOfGroup, "Grupa 1");
        for(int i = 0; i < sizeOfGroup; i++){
            grupa.dodaj(new Osoba(GeneratePersonData.generateName(), GeneratePersonData.generateAge()));
        }

        os1AsJson = gson.toJson(grupa);
        System.out.println(os1AsJson);
    }
}
