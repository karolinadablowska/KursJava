package pl.karolina.java.obiektowosc.zoo;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("miau...");
    }
}
