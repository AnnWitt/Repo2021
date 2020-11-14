package Zadania.Zestaw04_Rozne;

import java.util.Scanner;

public class Zestaw04_Zadanie15 {

    public static void main(String[] args) {

 Scanner input=new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int A = input.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int B = input.nextInt();

        int DlugoscA = 0;
        for (int i = A; i > 0; i--) {
            if (A % i == 0) {
                DlugoscA = DlugoscA + 1;
               // System.out.println(i);
            }
        }

        int t=DlugoscA-1;
        //System.out.println("uzupelnienie tabeli" +DlugoscA);
        int[] DzielnikiLiczbyA = new int[DlugoscA];
        for (int i = A; i > 0; i--) {
            if (A % i == 0) {
                DzielnikiLiczbyA[t]=(A/i);
                t=t-1;
            }
            }

/*        System.out.println("sprawdzamy zawartosc A");
        for (int test=0;test<DlugoscA;test++) {
            System.out.print(DzielnikiLiczbyA[test] + ",");
        }
        System.out.println("end");*/


        int DlugoscB = 0;
        for (int i = B; i > 0; i--) {
            if (B % i == 0) {
                DlugoscB = DlugoscB + 1;
                //System.out.println(i);
            }
        }

        t=DlugoscB-1;

        //System.out.println("uzupelnienie tabeli" +DlugoscB);
        int[] DzielnikiLiczbyB = new int[DlugoscB];
        for (int i = B; i > 0; i--) {
            if (B % i == 0) {
                DzielnikiLiczbyB[t]=(B/i);
                t=t-1;
            }
        }

/*        System.out.println("sprawdzamy zawartosc B");
        for (int test=0;test<DlugoscB;test++) {
            System.out.print(DzielnikiLiczbyB[test] + ",");
        }
        System.out.println("end2");*/






        //to juz mmamy, teraz sama stworzenie tabeli


        int Dzielnik = 1;


        for (int i = (DlugoscA - 1); i >= 0; i--) {
            for (int j = (DlugoscB - 1); j >= 0; j--) {
                if (DzielnikiLiczbyA[i] == DzielnikiLiczbyB[j]) {
                    Dzielnik = DzielnikiLiczbyA[i];
                    //System.out.println("petla" + Dzielnik);
                }
            }
        }
        System.out.println("Największy wspólny dzielnik Liczb "+ A + " i " + B+ " wynosi " + Dzielnik);


        //koniec klasy
    }
}
