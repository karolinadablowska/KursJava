public class Product {

    private String name;
    private double price;
    private int amount;


    Product (String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product(String name, double price, int amount, String date) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount (int amount) {
        this.amount = amount;
    }

    public double valueOfProducts(){
        double value = amount * price;
        return value;
    }

    public void getInfo() {
        System.out.println("Product is: " + name + ", " + price + ", " + amount + ", ");
    }

}
