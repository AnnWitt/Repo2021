package Zadania.Zestaw03_Tablice;

import java.util.Scanner;

public class Zestaw03_Zadanie03 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int LiczbaInt= input.nextInt();
        int[] TablicaPomocnicza=new int[32];

        String znak;
        if (LiczbaInt<0) {
            znak="1."; //dla ujemnej
            LiczbaInt=LiczbaInt*(-1);
        } else {
            znak=""; //dla dodatniej nic
        }

        for (int i=0;i<32;i++) {
            TablicaPomocnicza[i]=5; //dowolna liczba pomiedzy 2 a 9 - na potrzeby wykoszenia zbednych zer na koniec
        }

       // System.out.print(znak); //"L"iczba -75 binarnie: 1.1001011" - kalkulator pokazuje 1001011 - wyjanij skad to 1.
// wyjasnienie  56
//jedynka z przodu w kodzie binarny ZM oznacza liczbę ujemną
//7:56
//a 0 nieujemną

        for (int i=0;i<32;i++) {
            if (LiczbaInt!=0) {
                    if (LiczbaInt % 2 == 0) {
                        TablicaPomocnicza[i] = 0;
                    } else {
                        TablicaPomocnicza[i] = 1;
                    }
                LiczbaInt = LiczbaInt / 2;
            System.out.println(i + " Liczba " + LiczbaInt + " " + TablicaPomocnicza[i]);
                }
        }

        System.out.print(znak); //doklejka z przodu

        for (int i=31;i>=0;i--) {
            if (TablicaPomocnicza[i]!=5) {
                System.out.print(TablicaPomocnicza[i]);
            }
        }

        //Uwaga na boku: System.out.println(Integer.toBinaryString(LiczbaInt)); sposób funkcją


        //koniec klasy

    }

}


// bardziej elegancko - przeanalizuj w wolnej chwili

/*
    int liczbaWejsciowa = -75;
    String znak = liczbaWejsciowa < 0 ? "1." : "0.";
liczbaWejsciowa = Math.abs(liczbaWejsciowa);
        int[] TablicaPomocnicza2 = new int[32];
        int dlugoscLiczbyBinarnej = 0;
        for (int i = 0; i < 32; i++) {
        if (liczbaWejsciowa != 0) {
        dlugoscLiczbyBinarnej++;
        TablicaPomocnicza2[i] = liczbaWejsciowa % 2;
        liczbaWejsciowa /= 2;
        }
        }
        System.out.print(znak);
        for (int i = dlugoscLiczbyBinarnej - 1; i >= 0; i--) {
        System.out.print(TablicaPomocnicza2[i]);
        }*/
