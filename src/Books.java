public class Books extends Product {

        private Author author;


        Books(String name, double price, int amount, Author author) {
            super(name, price, amount);
            this.author = author;
        }
}
