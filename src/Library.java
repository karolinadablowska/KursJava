import java.util.Scanner;

public class Library {

    public static void main (String [] args) {
        Books [] book = new Books[4];
        book[0] = new Books ("Stephen", "King", "It", "6677888", "to borrow");
        book[1] = new Books ("Charles", "Dickens", "The Pickwick Papers", "667888", "borrowed");
        book[2] = new Books ("Kevin", "Baker", "Paradise Alley", "899000", "to borrow");
        book[3] = new Books ("Noam", "Chomsky", "Syntactic Structures", "878999", "borrowed");

        System.out.println("Books in your libray: ");

        for (Books books: book) {
            System.out.println(books.getName() + ", " + books.getSurname() + ", " + books.getBookName() + ", " + books.getIsbn() + ", " + books.getStatus());
        }

        System.out.println("Books in your libray to boorow: ");
             for (Books books: book) {
                if (books.getStatus() == "to borrow") {
                    System.out.println(books.getName() + ", " + books.getSurname() + ", " + books.getBookName() + ", " + books.getIsbn());
                }
             }

             Scanner sc  = new Scanner(System.in);
             System.out.println("What book do you want to borrow? Press 1 to enter the name of author, 2 to enter a title of book..." );
             int press = sc.nextInt();

             switch (press) {
                     case 1:
                         System.out.println("Enter the surname of author: ");
                         String nameOfAuthor = sc.next();
                         for (Books books: book) {
                             if (nameOfAuthor.equals(books.getSurname()) && books.getStatus().equals("to borrow")) {
                                 System.out.println ("Yes. Of course");
                             } else {
                                 System.out.println("Your book is already borrowed!");

                             }
                         }

                         break;
                     case 2:
                         System.out.println("Enter the title of the book: ");
                         String titleOftheBook = sc.next();
                         for (Books books: book) {
                             if (titleOftheBook.equals(books.getBookName()) && books.getStatus().equals("to borrow")) {
                                 System.out.println ("Yes. Of course");
                             } else {
                                 System.out.println("Your book is already borrowed!");
                             }
                         }
                         break;

                 }
             }




             

    }

