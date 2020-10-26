import java.util.Scanner;

public class Computer {

    private String models;
    private String cpu;
    private int RAM;

    public Computer(String models, String cpu, int RAM) {
        this.models = models;
        this.cpu = cpu;
        this.RAM = RAM;
    }

      public void addComputer() throws ArrayIndexOut, WrongEnterException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a id: ");
        int id = sc.nextInt(); // do poprawy

        System.out.println("Enter model: ");
        String models = sc.next();

        System.out.println("Enter cpu: ");
        String cpu = sc.next();

        System.out.println("Enter RAM:");
        int RAM = sc.nextInt();

        Computer computer = new Computer(models, cpu, RAM);


        if (!cpu.equals("inteli5") && !cpu.equals("inteli6")) {
            throw new WrongEnterException("Wadliwy procesor");
        }

        if (id == 2) {
          throw new ArrayIndexOut("Za dużo już!");
        }

    }

      public String toString() {
        return models + ", " + cpu + ", " + RAM;
    }

}






