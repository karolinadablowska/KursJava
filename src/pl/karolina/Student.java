package pl.karolina;

public class Student extends Person {
    int index;

    public Student(String name, String surname, int age, int index) {
        super(name, surname, age);
        this.index = index;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", index: "+index);
    }

    public void display(char separator) {
        for(int i = 0; i<10; i++){
            System.out.print(separator);
        }
        System.out.println();

        super.display();
        System.out.println(", index: "+index);

        for(int i = 0; i<10; i++){
            System.out.print(separator);
        }
    }
}
