package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int IleLiczb = 6;
        int[] Tablica = new int[IleLiczb];


        for (int i=0;i<IleLiczb;i++) {
            System.out.print("Podaj "+ (i+1) + " liczbę ");
            Tablica[i]= input.nextInt();
            if (Tablica[i]<0) {
                System.out.println("jeszcze raz");
                i=i-1;
            }
            }


        int pula = 0;

        for (int t = 0; t < IleLiczb; t++) {
            pula = 0;
            for (int i = 2; i < Tablica[t]; i++) {
                if (Tablica[t] % i == 0) {
                    pula = pula + 1;
                }
            }
            if (pula==0&&Tablica[t]!=1&&Tablica[t]!=0){
                System.out.println("Liczba "+ Tablica[t] + " jest liczbą pierwszą");
            }

        }




/*
        int test=7;
        int pula=0;
        for (int i=2;i<test;i++) {
            if (test % i == 0) {
                pula=pula+1;
            }
        }
        System.out.println("pula " + pula);
*/



        //koniec klasy
    }
}
