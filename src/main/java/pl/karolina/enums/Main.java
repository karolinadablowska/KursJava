package pl.karolina.enums;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.wyswietl();

        int option = 1;
        switch (option) {
            case Menu.DODAJ: System.out.println("Opcja 1"); break;
            case Menu.USUN: System.out.println("Opcja 2"); break;
            case Menu.WYSWIETL: System.out.println("Opcja 3"); break;
        }

        System.out.println();
        menu.wyswietlOpcje();

    }
}
