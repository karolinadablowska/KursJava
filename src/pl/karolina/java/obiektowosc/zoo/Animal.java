package pl.karolina.java.obiektowosc.zoo;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void voice();
}
