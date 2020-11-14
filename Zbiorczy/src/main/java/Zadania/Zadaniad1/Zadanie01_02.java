package Zadania.Zadaniad1;

import java.util.Scanner;

public class Zadanie01_02 {

    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba=input.nextInt();

        for (int i=1; i<5;i++) {
            System.out.println(liczba + " x " + i + " = " + liczba*i);
        }

        System.out.println("Czy liczba " + liczba + " jest liczba piersza");

        int licznik=0;
       for (int i=liczba-1;i>1;i--) {
           if (liczba%i==0) {
              // System.out.println("liczba nie jest liczba pierszą");
               licznik=1;
           }
       }

       if (licznik==0) {
           System.out.println("Liczba jest liczba pierwszą");
       } else {
           System.out.println("Liczba nie jest liczbą pierwszą");
       }

    }
}
