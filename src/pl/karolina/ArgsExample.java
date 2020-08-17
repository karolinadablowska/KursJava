package pl.karolina;

public class ArgsExample {

    public static void main(String[] args) {
        System.out.println("łączę się z bazą...");
        System.out.println("nazwa bazy: "+args[0]);
        System.out.println("adres bazy: "+args[1]);
    }
}
