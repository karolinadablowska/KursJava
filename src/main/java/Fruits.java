public class Fruits extends Product {

    private String type;
    private String expireDate;


    public Fruits(String name, double price, int amount, String type, String expireDate) {
        super(name, price, amount);
        this.type = type;
        this.expireDate = expireDate;
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


