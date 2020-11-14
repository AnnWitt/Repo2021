package Zadania.Zestaw04_Rozne;

import java.util.Scanner;

public class Zestaw04_Zadanie12 {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 20");
        int Liczba=input.nextInt();

        while ((Liczba>20) || (Liczba<1)) {
            System.out.println("Liczba spoza zakresu");
            System.out.println("Podaj liczbę od 1 do 20");
            Liczba=input.nextInt();
        }

        int[] Tablica=new int[Liczba];
        int i=0;
        String Ciag="";
        //Ciag=String.valueOf(Liczba); ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Fajne

        while (i<Liczba) {
            Tablica[i]=(i+1);
            Ciag=Ciag+String.valueOf(Tablica[i]);
            System.out.println(Ciag);
            i++;
        }

    //koniec klasy
    }
}
