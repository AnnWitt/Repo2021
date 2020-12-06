package BlokiTematyczne.Metody;

public class Metoda_zadanie {

    public static void main(String[] args) {

        System.out.println("wieksza liczba " + wieksza(13, 8));

        System.out.println("Potega");
        System.out.println(potega(3, 2));
        System.out.println(potega(2, 3));

        System.out.println("Proba Zadanie 5");
        int[] liczby = new int[]{200, 1, 500, 50, 234};
        int[] test = new int[liczby.length];
        zTablicy(liczby); //samo wywolanie, sout jest juz w metodzie
        System.out.println("Zwrocenie tablicy odwrotnej");
        //System.out.println(Zad6(liczby));
        test = Zad6(liczby); //referencja !

        for (int i = 0; i < liczby.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println();
        System.out.println("Zadanie 7 - sekundy na godziny");
        int czas = 86399;
        System.out.println(Z7czas(czas));

        System.out.println("suma cyfr skladowych");
        int x = 512;
        System.out.println(sumaCyfr(x));

        System.out.println("ddd");
        System.out.println(ddd(1,1));
    } //koniec metody

    public static int wieksza(int a1, int a2) {//metodas przymuje 2 liczby i zwraca wieksza
        int wynik;
        if (a1 > a2) {
            wynik = a1;
        } else {
            wynik = a2;
        }
        return wynik;
    }

/*    Zadanie 4: Napisać metodę która policzy potęge danej liczby całkowitej. Tj. przyjmuje
    dwa argumenty typu int i zwraca typ long. Nie używać gotowych funkcji w javie.
    Wywołać stworzoną funkcje kilka razy w metodzie main każdy wynik działania wypisać na konsole.
    Oczekiwane działanie:
    pow(3, 2) = 9             (3 do potęgi drugiej)
    pow(2, 3) = 8             (2 do potęgi 3)
    */

    public static long potega(int Liczba, int x) {
        int Liczba2 = Liczba;
        for (int i = 1; i < x; i++) {
            Liczba = Liczba2 * Liczba;
        }
        return Liczba;
    }

/*    Zadanie 5. Napisz metodę, która przyjmuje talicę int-ów i nic nie zwraca za
    to wypisuje na konsoli te liczby z tablicy które są większe od 100.
    Oczekiwane działanie:
    int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
    printGratedThenHundred(liczby)
    Wynik:
            564 itd
*/

    public static void zTablicy(int liczby[]) { //void bo nie bedzie returna tutaj

        int dl = liczby.length;
        //int[] Tabl2=new int[dl];

        for (int i = 0; i < dl; i++) {
            if (liczby[i] > 100) {
                //return liczby[i];
                System.out.println(liczby[i]); //tylko wyrzut na ekran
            }
        }

    }

/*    Zadanie 6. Napisz program, który przyjmuje tablicę liczb (int) i
    zwraca też tablicę, liczb która jest odwróconą tablicę tej która przyszła jako argumenty
    Oczekiwane działanie:
    int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
    reverseTable(liczby) = (210, 5456, 34, 7867, 564, 45, 1)*/

    public static int[] Zad6(int liczby[]) {

        int dl = liczby.length;
        int[] Revliczby = new int[dl];

        //int[] Revliczby=new int[]{5,5,5,5,6};

        for (int i = (dl - 1); i >= 0; i--) {
            Revliczby[i] = liczby[dl - 1 - i];
            //System.out.print(Revliczby[i] + " ");
        }

        return Revliczby;
    }

/*    Zadanie 7.
            7. Napisz metodę która przyjmuje liczbę całkowitą (int), która będzie
    oznaczać liczbę sekund. Metoda ma zwracać string który będzie wskazywał ile
    to jest godzin minut i sekund. Oczekiwany rezultat:
    calculateSecondsToTime(86399) = "23:59:59"          (bo 86399 sekund to 23
    godziny, 59 minut i 59 sekund)*/

    public static String Z7czas(int czas) {
        int sek = czas;
        int min = czas / 60;
        sek = sek - (min * 60);
        int godz = min / 60;
        min = min - (godz * 60);

        String zwracanyCzas = godz + ":" + min + ":" + sek;
        return zwracanyCzas;

    }

/*    8. Napisać metodę która przyjmuje jedną liczbę (int) i zwraca sumę cyfr tej liczby.
    Oczekiwany rezultat:
    sumOfDigits(45) = 9    ----> (4 + 5 = 9)
    sumOfDigits(28) = 10    ----> (2 + 8 = 10)
    sumOfDigits(11) = 2    ----> (1 + 1 = 2)*/

    public static int sumaCyfr(int liczba_8) {
        String test = Integer.toString(liczba_8);
        int dl = test.length();
        int[] elementyLiczby = new int[dl];

        int suma = 0;

        for (int i = 0; i < dl; i++) {
            elementyLiczby[i] = Integer.parseInt(String.valueOf(test.charAt(i)));
            suma = suma + elementyLiczby[i];
        }
        return suma;

    }

    // dostaje ze zbioru 3 liczbowego max, ze zbioru 4 liczbowego max i max z max
    public static int ddd(int a1, int a2) {//metodas przymuje 2 liczby i zwraca wieksza
        int wynik;
        a1=max3(2,4,7);
        a2=max4(0,4,7,9);
        if (a1 > a2) {
            wynik = a1;
        } else {
            wynik = a2;
        }
        return wynik;
    }

    public static int max3(int l31, int l32, int l33) {
        int a1 = 0;
        if (l31 > l32) {
            a1 = l31;
        } else {
            a1 = l32;
        }
        if (l33 > a1) {
            a1 = l33;
        }
        return a1;
    }

    public static int max4(int l41, int l42, int l43, int l44) {
        int a2 = 0;
        if (l41 > l42) {
            a2 = l41;
        } else {
            a2 = l42;
        }
        if (l43 > a2) {
            a2 = l43;
        }
        if (l44 > a2) {
            a2 = l44;
        }
        return a2;
    }


    // kolejne cwiczenie
    //wywolanie w 3 i 4 to z dwojki czyli jak mam 3 to za pomoca dwojka sprawdzam
    // pierwsze dwa znaki i potem max z trzecim
    /*Zadanie 9:
    a) Napisać metodę która przyjmuje 3 liczy i zwraca największą z nich
    b) Napisać metodę, która przyjmuje 4 liczby i zwraca największą z nich.
    Wskazówka: Wykorzystać metodę która przyjmuje 2 liczby i zwraca większą z nich z zadania 2
*/


// dodatkowo - fibonaczi

    //koniec klasy
}
