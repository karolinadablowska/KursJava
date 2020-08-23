public class Milk extends Product {

    private String expireDate;
    private double percentageOfProtein;


    Milk(String name, double price, int amount, String expireDate, double percentageOfProtein) {
        super(name, price, amount);
        this.expireDate = expireDate;
        this.percentageOfProtein = percentageOfProtein;

    }

    public String getexpireDate() {
        return expireDate;
    }

    public void setExpireDate (String expireDate) {
        this.expireDate = expireDate;
    }

    public void getInfo() {
        System.out.println(getName() + ", " + getexpireDate());

    }
}

