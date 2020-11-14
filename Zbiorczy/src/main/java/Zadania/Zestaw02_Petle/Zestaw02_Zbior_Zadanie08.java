package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie08 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] TablicaDodatnich=new int[5];
        int[] TablicaUjemnych=new int[5];
        int LicznikDodatnie=0;
        int LicznikUjemne=0;
        int Liczba=0;

        while((LicznikDodatnie+LicznikUjemne)<10) {
            System.out.println("Podaj liczbę.");
            Liczba=input.nextInt();
            if (Liczba>=0) { //dodatnie
                if (LicznikDodatnie<5) {
                    TablicaDodatnich[LicznikDodatnie]=Liczba;
                    LicznikDodatnie++;
                } else {
                    System.out.println("Podano już 5 liczb dodatnich. Podaj liczbę ujemną");
                }
            } else { //ujemne
                if (LicznikUjemne<5) {
                    TablicaUjemnych[LicznikUjemne]=Liczba;
                    LicznikUjemne++;
                } else {
                    System.out.println("Podano już 5 liczb ujemnych. Podaj liczbę dodatnię.");
                }
            }
        }

        int max=0;
        int min=0;
        System.out.println("Tablica dodatnich");
        for (int i=0;i<5;i++) {
            System.out.print(TablicaDodatnich[i] + "   ");
            for (int j=0;j<5;j++) {
                if (TablicaDodatnich[j] >= max) {
                    max = TablicaDodatnich[j];
                }
            }
        }


        System.out.println("Tablica ujemnych");
        for (int i=0;i<5;i++) {
            System.out.print(TablicaUjemnych[i] + "   ");
            for (int j=0;j<5;j++) {
                if (TablicaUjemnych[j] <= min) {
                    min = TablicaUjemnych[j];
                }
            }
        }


        System.out.println("Minimum wynosi " + min + " Maksimum wynosi " + max );

        //
    }
}
