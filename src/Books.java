public class Books extends Product {

        private Authors author;


        Books(String name, double price, int amount, Authors author) {
            super(name, price, amount);
            this.author = author;
        }
}
