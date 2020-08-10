public class Book {
    private String name;
    private String isbn;
    private boolean borrow;
    private Author author;
    private double price;

    public Book(String name, String isbn, Author author, double price) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
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
}