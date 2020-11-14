package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy");
        int LiczbaWierszy = input.nextInt();
        while (LiczbaWierszy <= 0) {
            System.out.println("Liczba wierszy musi być większa od zera. Podaj liczbę wierszy");
            LiczbaWierszy = input.nextInt();
        }
        int DlPodstawy = 2 * LiczbaWierszy - 1;
        //System.out.println(DlPodstawy);
        int odstep=0;


        for (int w=1; w<=LiczbaWierszy;w++) {
            odstep=odstep-1;
            if (w==1) {
                odstep=(DlPodstawy-w)/2;
            }

            if (w==LiczbaWierszy) {
                for (int i=1; i<=DlPodstawy;i++) {
                    System.out.print("*");
                }
            } else {
            //pętle z wyrzutem do wiersza
                //lewy
            for (int i=1; i<=odstep;i++) {
                System.out.print(" ");
            }
            //srodek
                for (int i=1; i<=(DlPodstawy-(2*odstep));i++) {
                    System.out.print("*");
                }

                //prawy
                for (int i=1; i<=odstep;i++) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        //koniec klasy
    }
}
