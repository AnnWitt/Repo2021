package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie04 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("podaj początek zakresu (OD)");
        int PoczatekZakresu= input.nextInt();
        int PoczatekZakresu_bk=PoczatekZakresu;
        System.out.println("podaj koniec zakresu (DO)");
        int KoniecZakresu= input.nextInt();

        while (KoniecZakresu<PoczatekZakresu) {
            System.out.println("Wprowadzono niepoprawne dane");
            System.out.println("podaj początek zakresu (OD)");
            PoczatekZakresu= input.nextInt();
            System.out.println("podaj koniec zakresu (DO)");
            KoniecZakresu= input.nextInt();
        }
        //a
        System.out.println("Podaj dzielnik");
        int dzielnik= input.nextInt();

        while (PoczatekZakresu<=KoniecZakresu) {

            if (PoczatekZakresu%dzielnik==0) {
                System.out.println(PoczatekZakresu + " jest podzielne przez "+ dzielnik);
            }

            PoczatekZakresu++;
        }

        System.out.println("Podaj liczbę dzielników");
        int IloscDzielników= input.nextInt();
        //b* z tablica
        Integer[] IloscDzielnikówTB;
        IloscDzielnikówTB=new Integer[IloscDzielników];


        //tablica idzie od zera


        for (int i=0;i<IloscDzielników;i++) {
            System.out.println("Podaj "+ (i+1) + " dzielnik");
            IloscDzielnikówTB[i]=input.nextInt();
        }
//mamy uzupelniona tablice


        PoczatekZakresu=PoczatekZakresu_bk;

        int j=0;
        while (PoczatekZakresu<=KoniecZakresu) {
            j=0;
            for(int i=0;i<IloscDzielników;i++) {
                if (PoczatekZakresu % IloscDzielnikówTB[i] == 0) {
                    j++;
                    if (j==IloscDzielników) {
                        System.out.println(PoczatekZakresu + " jest podzielne przez wszystkie podane dzielniki ");
                    }
                }
            }
            PoczatekZakresu++;
        }

//koniec klasy
    }

}
