package pl.karolina.java.obiektowosc.zoo;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("...");
    }
}
