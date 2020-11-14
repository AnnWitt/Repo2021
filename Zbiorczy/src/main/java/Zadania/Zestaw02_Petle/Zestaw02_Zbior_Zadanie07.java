package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie07 {


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

        int suma=0;
        System.out.println("Tablica dodatnich");
        for (int i=0;i<5;i++) {
            System.out.println(TablicaDodatnich[i] + "   ");
            suma=suma+TablicaDodatnich[i];
        }

        System.out.println("Tablica ujemnych");
        for (int i=0;i<5;i++) {
            System.out.println(TablicaUjemnych[i] + "   ");
            suma=suma+TablicaUjemnych[i];
        }

        System.out.println("Suma obu tablic to:" + suma);

        //
    }
}
