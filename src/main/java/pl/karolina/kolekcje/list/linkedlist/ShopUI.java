package pl.karolina.kolekcje.list.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;
import static pl.karolina.kolekcje.list.linkedlist.MenuOptions.*;


public class ShopUI {
    private Scanner scanner = new Scanner(System.in);
    private LinkedList<Person> queue = new LinkedList<>();
    boolean open = true;

    public void open() {
        do {
            System.out.println("--------- sklep --------");
            System.out.println("1. dodaj do kolejki");
            System.out.println("2. wyświetl");
            System.out.println("3. zamknij");
            System.out.println("4. obsłóż osobę z kolejki");
            int option = scanner.nextInt();
            run(option);
        } while(open);
    }

    public void close(){
        open = false;
    }

    private void run(int option) {
        switch (option){
            case ADD_TO_QUEUE:
                    Person person = inputPerson();
                    queue.addLast(person);
                break;
            case DISPLAY:
                    System.out.println(queue);
                break;
            case CLOSE:
                    close();
                break;
            case REMOVE:
                    person = queue.poll();
                    System.out.println("Obsłużono: "+person.getName());
                break;
        }
    }

    private Person inputPerson() {
        System.out.println("Name: ");
        String name = scanner.next();
        return new Person(name);
    }
}
