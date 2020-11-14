package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie06 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[] Tablica=new int[5];
        int Liczba = 0;

        int PodanychLiczb=0;

        //int i=0;
        int minimum=0;

        while (PodanychLiczb<5) {
            System.out.println("Podaj " + (PodanychLiczb+1) + " liczbę większą od zera. ");
            Liczba=input.nextInt();
            if (Liczba>0) {
                Tablica[PodanychLiczb]=Liczba;
                PodanychLiczb++;
            } else {
                System.out.print("Podana liczba nie jest większa od zera. ");
                if (minimum>Liczba) {
                    minimum=Liczba;
                }
            }

        }

        System.out.print("Wprowadzono dodatnie liczby: ");
        for (int t=0;t<(PodanychLiczb);t++) {
            System.out.print(Tablica[t] + "  ");
        }

        int max=0;
        for (int i=0; i<(PodanychLiczb-1);i++) {
            if (Tablica[i]>=Tablica[i+1]) {
                max=Tablica[i];
            } else {
                max=Tablica[i+1];
            }
        }

        if (minimum>=0) {
            for (int i=0; i<(PodanychLiczb-1);i++) {
                if (Tablica[i]<Tablica[i+1]) {
                    minimum=Tablica[i];
                } else {
                    minimum=Tablica[i+1];
                }
            }
        }

        System.out.println("Największą podaną liczbą jest "+max);
        System.out.println("Najmniejszą z wprowadzonych liczbą jest  " + minimum);



//koniec klasy
    }
}
