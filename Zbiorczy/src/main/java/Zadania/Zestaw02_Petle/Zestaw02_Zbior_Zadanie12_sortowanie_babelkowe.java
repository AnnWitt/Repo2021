package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie12_sortowanie_babelkowe {


    public static void main(String[] args) {

        int IleLiczb = 8;
        int[] Tablica = new int[IleLiczb];

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < IleLiczb; i++) {
            System.out.print("podaj liczbe ");
            Tablica[i] = input.nextInt();
        }

        System.out.println("Tablica nieuporządkowana");
        for (int i = 0; i < IleLiczb; i++) {
            System.out.print(Tablica[i] + " ");
        }
        System.out.println();

        int Powtorka=0;
        //Zamiany wartości
        int wiekszy = 0; //tak, wiem, można bardziej elegancko ale mi się nie chciało :)



        do {
            Powtorka=0;
            for (int i = 0; i < (IleLiczb - 1); i++) {
                //System.out.println("i = " + i + " Przed if " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                if (Tablica[i] > Tablica[i + 1]) {
                    //System.out.println("konieczność zamiany");
                    //System.out.println("i = " + i + " Przed zamianą " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                    wiekszy = Tablica[i];
                    Tablica[i] = Tablica[i + 1];
                    Tablica[i + 1] = wiekszy;
                    //System.out.println("i = " + i + " Po zamianie " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                    Powtorka = 1;
                } else {
                    //System.out.println("i = " + i + " Brak koniecznosci zamiany " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                   // Powtorka = 0;
                }
            }
        } while (Powtorka!=0); //powtorka musi byc zerem aby wyjsc z petli



/*        do {
            for (int i = 0; i < (IleLiczb - 1); i++) {
                System.out.println("i = " + i + " Przed if " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                if (Tablica[i] > Tablica[i + 1]) {
                    System.out.println("konieczność zamiany");
                    System.out.println("i = " + i + " Przed zamianą " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                    wiekszy = Tablica[i];
                    Tablica[i] = Tablica[i + 1];
                    Tablica[i + 1] = wiekszy;
                    System.out.println("i = " + i + " Po zamianie " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                    Powtorka = 1;
                } else {
                    System.out.println("i = " + i + " Brak koniecznosci zamiany " + " Tablica[i] " + Tablica[i] + " Tablica [i+1] " + Tablica[i + 1]);
                    Powtorka = 0;
                }
            }

        } while (Powtorka!=0);*/


        //koniec zamiany wartości

        System.out.println();
        //System.out.println("Tu mialaby byc uporządkowana ale coś niebardzo");

        for (int i = 0; i < (IleLiczb); i++) {
            System.out.print(Tablica[i] + " ");
        }


        //pod samą medianę
        System.out.println();
        float Mediana;

        if (IleLiczb % 2 == 0) {
            Mediana = (Tablica[IleLiczb / 2] + Tablica[(IleLiczb / 2) - 1]) / 2f;
        } else {
            Mediana = Tablica[(IleLiczb / 2)];
        }
        System.out.println("Mediana wynosi: " + Mediana);

        // koniec klasy
    }
}
