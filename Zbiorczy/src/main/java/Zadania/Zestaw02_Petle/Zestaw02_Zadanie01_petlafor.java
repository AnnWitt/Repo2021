package Zadania.Zestaw02_Petle;

public class Zestaw02_Zadanie01_petlafor {
    public static void main(String[] args) {


        //a
        System.out.println("a. liczby od 1 do 100 w nowych liniach");

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
        //b
        System.out.println("b.liczby od 1000 do 1020 w tel samej lini oddzielone przecinkami i spacją");

        System.out.print("1000, ");
        for (int i = 1001; i < 1021; i++) {

            System.out.print(i + ", ");
        }
        //c

        System.out.println();
        System.out.println("c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach");

        for (int i = -30; i < 1001; i++) {

            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        //d
        System.out.println("d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach");

        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        //e
        System.out.println("e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach");

        for (int i = 30; i < 300; i++) {

            if (i%3 == 0 && i%5==0) {
                System.out.println(i);
            }
        }
        //f
        System.out.println("f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami");

        for (int i=-300; i<301;i++){
            if (i%2!=0) {
                //System.out.print("");
                System.out.print(i+ ";");
            }
        }
        System.out.println();
        //g
        System.out.println("g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami");
        for (int i=-100; i<101;i++){
            if (i%2==0) {
                //System.out.print("");
                System.out.print(i+ ";");
            }
        }
        System.out.println();

        //h
        System.out.println("h litery od 'a' do 'z'");

        for(char i=97;i<=122;i++) {  //ascii od 97 do 122
            System.out.println(i);
        }

        //i
        System.out.println("i litery od 'A' do 'Z'");

        for(char i=65;i<=90;i++) {
            System.out.println(i);
        }

        //j
        System.out.println("j litery od 'A' do 'Z'");

        for(char i=65;i<=90;i+=2) { //co drugie
            System.out.println(i);
        }

        //k
        System.out.println("litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest\n" +
                "podzielny przez 5");

        for(char i=98;i<=122;i+=2) {

            if (i%5==0) {
                System.out.println(i);
            }
        }

        //l
        System.out.println("l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania)");
        for (int i=1; i<=100;i++) {
            System.out.println(i+ " Hello World");
        }





        //koniec klasy
    }
}
