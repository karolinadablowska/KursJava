public class Shop {

    public static void main(String[] args) {

        Product[] products = new Product[4];


        products[0] = new Books("It", 22.5, 60, new Authors("Stephen", "King", new Address(2, 6, "Jaworzno", "43-603", "Kalinowa")));
        products[1] = new Shoes("Adidas", 220, 50, new Maker("5555567", "Nike", "Kalinowa"));
        products[2] = new Milk("Milka", 3, 20, "20-05-2020", 5.5);
        products[3] = new Fruits("Grape", 1.40, 222, "...", "22-05-2020");


        System.out.println("Products in the shop: ");
        for (Product product : products) {
            product.getInfo();
        }

        int totalAmount = 0;

        System.out.println("Number of products in the shop: ");
        for (int i = 0; i < products.length; i++) {
            totalAmount += products[i].getAmount();
        }
        System.out.println(totalAmount);

        int sum = 0;
        System.out.println("Value of products in the shop: ");
        for (int i = 0; i < products.length; i++) {
            sum += products[i].valueOfProducts();

        }
        System.out.println(sum);

        System.out.println("Expire date of products in the shop");
        for (Product product : products) {
            if (product instanceof Milk || product instanceof Fruits) {
                product.getInfo();
            }
        }


    }
}







