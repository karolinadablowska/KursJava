import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static final int STOP_PROGRAM = 0;

    public static void main(String[] args) {


        ArrayList<Computer> arrlist = new ArrayList<>(2);
        arrlist.add(new Computer ("hhh", "h", 6 ));


        Scanner sc = new Scanner(System.in);

        System.out.println("Computers in the shop: ");

        for (Computer computer : arrlist) {
            System.out.println(computer.toString());
        }

        int option;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - add computer");
            System.out.println("2 - display computers");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    try {
                        for (Computer computer : arrlist) {
                            computer.addComputer();
                        }

                    } catch (ArrayIndexOut arrayIndexOut) {
                        System.err.println("Brak miejsca w magazynie");
                        arrayIndexOut.printStackTrace();

                    } catch (WrongEnterException wrongEnterException) {
                        System.err.println("Podałeś zły procesor");
                        wrongEnterException.printStackTrace();
                    }
                    break;
            }
        }
            while (option != STOP_PROGRAM) ;


    }
}

