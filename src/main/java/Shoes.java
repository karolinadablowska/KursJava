public class Shoes extends Product {

    private Maker maker;

    Shoes(String name, double price, int amount, Maker maker) {
        super(name, price, amount);
        this.maker = maker;
    }
}
