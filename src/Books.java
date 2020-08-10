public class Books extends Author {

    private String bookName;
    private String isbn;
    private String status;


    public Books(String name, String surname, String bookName, String isbn, String status) {
        super(name, surname);
        this.bookName = bookName;
        this.isbn = isbn;
        this.status = status;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName (String bookName) {
        this.bookName = bookName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus (String isbn) {
        this.status = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }

    public void getInfo() {
        System.out.println("Book is: " + getName() + ", " + getSurname() +", " + getBookName() + ", " + getIsbn() + ", " + getStatus());
    }




}