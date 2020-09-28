package pl.karolina.java.obiektowosc.zoo;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Abc");
        cat.voice();

        Dog dog = new Dog("Azor");
        dog.voice();

        Fish fish = new Fish("Okoń");
        fish.voice();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = fish;

        for(Animal animal : animals){
            animal.voice();
        }

    }
}
