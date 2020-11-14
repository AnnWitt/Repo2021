package Zadania.Zestaw02_Petle;

public class Zestaw02_Zadanie01_petlawhile {

    public static void main(String[] args) {

        //a
        System.out.println("a. liczby od 1 do 100 w nowych liniach");

        int i=1;

        while (i<=100) {
            System.out.println(i);
            i++;
        }
        //b
        System.out.println();
        System.out.println("b.liczby od 1000 do 1020 w tel samej lini oddzielone przecinkami i spacją");
        //System.out.print("1000, ");
        i=1000;
        while (i<=1020) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
        System.out.println();

        //c
        System.out.println("c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach");

        i=-30;
        while (i<=1000) {
            if (i%5==0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println();
        //d
        System.out.println("d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach");
        i=1;
        while (i<=100) {
            if (i%3==0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        //e
        System.out.println("e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach");
        i=30;
        while (i<=300) {
            if ((i%3==0) && (i%5==0)) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        //f
        System.out.println("f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami");
        i=-300;
        while (i<=300) {
            if (i%2!=0) {
                System.out.print(i+";");
            }
            i++;
        }

        System.out.println();
        System.out.println();

        //g
        System.out.println("g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami");

        i=-100;
        while (i<=100) {
            if (i%2==0) {
                System.out.print(i+";");
            }
            i++;
        }

        System.out.println();
        System.out.println();

        //h
        System.out.println("h litery od 'a' do 'z'"); //ascii od 97 do 122

        char j=97;
        while (j<=122) {
            System.out.println(j);
            j++;
        }
        System.out.println();
        //i
        System.out.println("i litery od 'A' do 'Z'");
        j=65;
        while (j<=90) {
            System.out.println(j);
            j++;
        }
        System.out.println();

        //j
        System.out.println("j litery od 'A' do 'Z' - co druga");
        j=65;
        while (j<=90) {
            System.out.println(j);
            j+=2;
        }
        System.out.println();
        //k
        System.out.println("litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest\n" +
                "podzielny przez 5");

        j=98;
        while (j<=122) {

            if (j%5==0) {
                System.out.println(j);
            }
            j+=2;
        }
        System.out.println();
        //l
        System.out.println("l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania)");
        i=1;
        while (i<=100) {
            System.out.println(i + " Hello World");
            i++;
        }

    // Koniec klasy
    }
}

