import java.awt.print.Book;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("It", "6677888", new Author("Stephen", "King"), 222);
        books[1] = new Book("The Pickwick Papers", "667888", new Author("Charles", "Dickens"), 22.3);
        books[2] = new Book("Paradise Alley", "899000", new Author("Kevin", "Baker"), 112.87);
        books[3] = new Book("Syntactic Structures", "878999", new Author("Noam", "Chomsky"), 121.2);

        System.out.println("Books in your libray: ");

        for (Book book : books) {
            book.getInfo();
        }

        System.out.println("Books in your libray to boorow: ");
        for (Book book : books) {
            if (!book.isBorrow()) {
                book.getInfo();
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("What books do you want to borrow? Press 1 to enter the surname of author, 2 to enter a title of books...");
        int press = sc.nextInt();

        switch (press) {
            case 1:
                System.out.println("Enter the surname of author: ");
                String surnameOfAuthor = sc.next();
                for (Book book : books) {
                    if (surnameOfAuthor.equals(book.getAuthor().getSurname())) {
                        if (!book.isBorrow()) {
                            System.out.println("Yes. Of course");
                            book.setBorrow(true);
                        } else {
                            System.out.println("Your books is already borrowed!");
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Enter the title of the books: ");
                String titleOftheBook = sc.next();
                for (Book book : books) {
                    if (titleOftheBook.equals(book.getName()) && !book.isBorrow()) {
                        System.out.println("Yes. Of course");
                        book.setBorrow(true);
                    } else {
                        System.out.println("Your books is already borrowed!");
                    }
                }
                break;
        }
    }


}

