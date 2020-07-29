import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // deklaracja zmiennej
        // typ nazwa;
        int i;

        // inicjalizacja zmiennej
        // nazwa = wartość;
        i = 5;

        // w jednej lini
        char znak = 's';
        long l = 222;
        byte i2 = 22;
        l = i2;
        l = 222;

        i2 = (byte) l;
        // -127, -126, ..... , 0, 1, ..... 128 // 256

        System.out.println(i2);
        short s = 2;
        int suma = (int) (s + l + i2);

        // deklaracja
        // typ[] nazwa;

        // alokacja
        // nazwa = new typ[rozmiar];

        int[] liczby = new int[5];

        // boolean wartosc = true;
        // wartosc = false;

        liczby[0] = 44;
        liczby[1] = -222;
        // liczby[2]
        liczby[3] = 0;
        liczby[4] = 4111114;

        System.out.println(liczby[1]);
        System.out.println(liczby[2]);

        int[][] macierz = new int[10][4];
        macierz[0][1] = 4;
        macierz[1][1] = 5;

        System.out.println(macierz[3][3]);

        // krzyzowka
        //
        // a l a
        // s z y m o n
        // a n i a

        char[][] krzyzowka = new char[3][];
        krzyzowka[0] = new char[3];
        krzyzowka[1] = new char[6];
        krzyzowka[2] = new char[4];

        // liczby [1, 2, 3, 4]
        // krzyzowka [ ['a' , 'l', 'a'], [], []];

        int l1 = 1;
        int l2 = 2;
        double roznica = (double) 1 / 2; // 1.0 / 2.0

        int reszta = 5 % 2;
        System.out.println("reszta: " + reszta);

        System.out.println(roznica);

        i = 2;
        int i5 = i++ + 4;
        System.out.println(i5);
        System.out.println("ile równa się i ? " + i);

        i++;

        // -4 i++ (int)2.2

        i += 6;
        i = i + 6;

        i %= 2;
        i = i % 2;

        // 2 <= 2
        // 2 == 2
        // 2 != 2

        // 2 > 0 && 2 % 2 == 0

        // koniunkcja

        // _ & _ // true tylko gdy oba są true (lewe i prawe)
        // _ | _ // wystarczy że jesdna strona równania będzie poprawna (true) to całe
        // wyrażenie jest true

        // _ && // sprawdza prawą stronę tylko gdy lewa jest true

        // _ || _ // jęśli lewa prawda, to zwraca true (nie sprawdza prawej)

        int wiek = 22;
        boolean pelnoletni = false;

        // wyrażenie ? co jeśli tak : co jeśli nie

        pelnoletni = ((wiek >= 18) && (1 == 1)) ? true : false;

        --i;

        System.out.println("Czy pełnoletni? " + pelnoletni);

        /*
         * INSTRUKCJE STERUJĄCE
         *
         *
         *
         */

        // instrukcje wyboru - JEDNA Z DRÓG

        /*
         * if(warunek) { // warunek zwraca true albo false instrukcja; // wykona się
         * tylko gdy warunke równy true }
         *
         */

        System.out.println("Chciałbym kupić piwo.");
        wiek = 18;

        if (wiek >= 18) {
            System.out.println("Tak możesz kupić.");
        } else {
            System.out.println("Nie mogę Tobie sprzedać.");
        }

        // < 1 niemowlak
        // < 13 dziecko
        // >= 18 dorosly

        /*
         * if(warunek1){ instrukcja1; } else if(warunek2){ instrukcja 2; } else {
         * instrukcja 3; }
         *
         */

        if (wiek < 1) {
            System.out.println("niemowlak");
        } else if (wiek < 13) {
            System.out.println("dziecko");
        } else if (wiek < 18) {
            System.out.println("nastolatek");
        } else {
            System.out.println("dorosły");
        }

        int miesiac = 1;
        switch (miesiac) {
            case 1: {
                System.out.println("Styczeń");
                break;
            }
            case 2: {
                System.out.println("Luty");
                break;
            }

            default: {
                System.out.println("Nie ma takiego miesiąca.");
            }
        }

        miesiac = 456;
        switch (miesiac) {
            case 1:
            case 2:
            case 3: {
                System.out.println("I kwartał.");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("II kwartał.");
                break;
            }
            default: {
                System.out.println("Ciężko powiedzieć.");
            }
        }

        /******* instrukcje iteracyjne **********/
        // do-while
        /*
         * do{ instrukcje; } while(warunek);
         *
         */

//		int liczba;
//		Scanner scanner = new Scanner(System.in);
//		do {
//			System.out.print("Podaj liczbę parzystą: ");
//			liczba = scanner.nextInt();
//		} while(liczba % 2 != 0);
//		System.out.println("Podałeś poprawną liczbę parzystą.");

        // while
        /*
         * while(warunek){ instrukcje; }
         *
         */
        int[] liczbyDoZsumowania = {4, 1, 5, 666, 2, 3, 611, 1};
        int sumaLiczb = 0;

        int z = 0;
        while (z < liczbyDoZsumowania.length) {
            sumaLiczb += liczbyDoZsumowania[z];
            z++;
        }

        /*
         *
         * sumaLiczb+=liczbyDoZsumowania[0]; sumaLiczb+=liczbyDoZsumowania[1];
         * sumaLiczb+=liczbyDoZsumowania[2]; sumaLiczb+=liczbyDoZsumowania[3];
         * sumaLiczb+=liczbyDoZsumowania[4]; sumaLiczb+=liczbyDoZsumowania[5];
         * sumaLiczb+=liczbyDoZsumowania[6]; sumaLiczb+=liczbyDoZsumowania[7];
         *
         */

        sumaLiczb = 0;
        z = 0;
        while (sumaLiczb < 670) {
            sumaLiczb += liczbyDoZsumowania[z];
            z++;
        }
        System.out.println("Suma wynosi: " + sumaLiczb);

        // for
        /*
         * for(inicjalizacja ; warunek ; inkrementacje ){ instrukcje; }
         *
         * 1. inicjalizacja - wykonuje się tylko jeden raz, na początku 2. sprawdzanie
         * warunku a) jeśli poprawny to wykonywane są instrukcje, po każdym wykonaniu
         * instrukcji inkrementacja i powrót do 2 b) niepoprawny to koniec pętli
         */

        for (int j = 0; j < liczbyDoZsumowania.length; j++) {
            System.out.println(liczbyDoZsumowania[j]);
        }

        // nieskończony warunek, prawdziwy
//		for(;;) {
//			System.out.println("jestem w forze");
//		}

        // identycznie jak w while
//		sumaLiczb=0;
//		z = 0;
//		for ( ; sumaLiczb < 670 ; ) {
//			sumaLiczb += liczbyDoZsumowania[z];
//			z++;
//		}
//		System.out.println("Suma wynosi: " + sumaLiczb);

        //
        sumaLiczb = 0;
        z = 0;
        for (System.out.println("Witaj witaj"); sumaLiczb < 670; System.out.println("skończyłem właśnie którś obiek pętli.")) {
            sumaLiczb += liczbyDoZsumowania[z];
            z++;
        }
        System.out.println("Suma wynosi: " + sumaLiczb);


        // foreach -- przechodzenia przez kolekcje, zbiory (wartości)
        /*
         * for(pojedynczy_element_kolekcji : kolecję/zbiór ){
         * 	instrukcje;
         * }
         *
         */

        for (int wartosc : liczbyDoZsumowania) {
            System.out.println(wartosc);
        }

        // wartosc = liczbyDoZsumowania[0];
        // wartosc = liczbyDoZsumowania[1];
        // wartosc = liczbyDoZsumowania[2];
        // wartosc = liczbyDoZsumowania[3];
        // wartosc = liczbyDoZsumowania[4];
        // wartosc = liczbyDoZsumowania[5];
        // wartosc = liczbyDoZsumowania[6];
        // wartosc = liczbyDoZsumowania[7];


        /*** instrukcje skoku *****/

        /*
         * break;
         * continue;
         * return;
         */

        // gram sobie
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Gra. Podaj 3 liczby parzyste. Jeśli chcesz przerwać grę, wprowadz liczbę -111");
        int ilePodalParzystych = 0;
        do {
            System.out.println("Podaj liczbę: ");
            int liczba = scanner.nextInt();

            if (liczba != -111) {
                if (liczba % 2 == 0) {
                    ilePodalParzystych++;
                }
            } else {
                System.out.println("Gra przerwana.");
                break;
            }
        } while (ilePodalParzystych != 3);

        if (ilePodalParzystych == 3) {
            System.out.println("Wygrałeś!!!");
        }


        // continue - pominięcie jednego obiegu
        System.out.println("\n---------------");
        // wyświetl wszystkie większe od 534
        for (int wartosc : liczbyDoZsumowania) {
            if (wartosc <= 534) {
                continue;
            }

            System.out.println(wartosc);
        }

        // return - powrót do miejsca wywołania
        return;
    }
}