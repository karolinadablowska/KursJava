package pl.karolina.java.obiektowosc.zoo;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("hau hau...");
    }
}
