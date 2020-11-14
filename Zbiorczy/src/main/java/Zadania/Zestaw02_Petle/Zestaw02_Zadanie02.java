package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int ilosc= input.nextInt();
        int i=1;

        System.out.println("Pętlą while ");
        while (i<=ilosc) {
            System.out.println(i + " Hello World");
            i++;
        }

        System.out.println();
        System.out.println("Pętlą For");
        for (i=1;i<=ilosc;i++) {
            System.out.println((i + " Hello World"));
        }

        //koniec klasy
    }
}
