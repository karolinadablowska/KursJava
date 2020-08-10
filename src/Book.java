public class Book {
    private String name;
    private String isbn;
    private boolean borrow;
    private Author author;

    public Book(String name, String isbn, Author author) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
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

    public void getInfo() {
        System.out.println("Book is: " + name + ", " + isbn + ", " + borrow + ", ");
        author.getInfo();
    }
}