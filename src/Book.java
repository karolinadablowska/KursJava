public class Book {
    private String name;
    private Isbn isbn;
    private boolean borrow;
    private Author author;
    private double price;

    public Book(String name, String isbn, Author author, double price) {
        this.name = name;
        this.isbn = new Isbn(12, isbn);
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Isbn getIsbn() {
        return isbn;
    }

    public void setIsbn(Isbn isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void getInfo() {
        System.out.println("Book is: " + name + ", " + isbn + ", " + borrow + ", ");
        author.getInfo();
    }

    private class Isbn {
        private int insb1;
        private String isbn2;

        public Isbn(int insb1, String isbn2) {
            this.insb1 = insb1;
            this.isbn2 = isbn2;
        }

        boolean valid(){
            if(insb1 != 0 && isbn2 != null){
                return true;
            }
            return false;
        }

    }
}