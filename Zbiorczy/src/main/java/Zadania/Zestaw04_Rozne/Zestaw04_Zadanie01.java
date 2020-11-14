package Zadania.Zestaw04_Rozne;

import java.util.Random;
import java.util.Scanner;

public class Zestaw04_Zadanie01 {

    public static void main(String[] args) {
        //Gra w lotto
        Scanner input=new Scanner(System.in);
        int[] LiczbyUsera=new int[6];
        int[] LiczbyWylosowane=new int[6];
        Random GenLos=new Random();


//a Użytkownik typuje 6 cyfr (moga sie powtarzac) --------> działa
/*        for (int i=0;i<6;i++) {
            System.out.println("Podaj " + (i + 1) + " Liczbe");
            LiczbyUsera[i] = input.nextInt();
        }*/



        //f Użytkownik typuje 6 cyfr bez powtorek (podejscie 2)
        int[] pomocnicza=new int[6];
        int j;

       for (int i=0;i<6;i++) {
           if (i==0) {
               System.out.println("Podaj " + (i + 1) + " Liczbe");
               LiczbyUsera[i] = input.nextInt();
               pomocnicza[i]=LiczbyUsera[i];
               //System.out.println("kontrolka "+ pomocnicza[i]); --> pomocnicze
           } else {
               System.out.println("Podaj " + (i + 1) + " Liczbe");
               j=i-1; //licznik po 2 tabeli
               LiczbyUsera[i] = input.nextInt();
               while (j>=0) {
                   //System.out.println("usera " + LiczbyUsera[i] + " pomocnicza wczesniejsza " + pomocnicza[j] + " i=" + i + " j="+j);--> pomocnicze
                   if (LiczbyUsera[i]==pomocnicza[j]) {
                       System.out.println("Ta liczba już została wprowadzona. Podaj ponownie " + (i + 1) + " Liczbe");
                       LiczbyUsera[i] = input.nextInt();
                       j=i-1;
                   } else {
                       j--;
                   }
                   //System.out.println("j= " +j);--> pomocnicze
               }
               //System.out.println("rozne"); --> pomocnicze
               pomocnicza[i]=LiczbyUsera[i]; //dopisanie do tabeli pomocniczej
           }

       }
//bedzie mozna wyciac pozniej
        System.out.print("Tablica pomocnicza po userze "); //do sprawdzenia
       for (int i=0;i<6;i++) {
           System.out.print(pomocnicza[i]+",");
       }
        System.out.println();
//wywalic




/*//b wylosowanie 6 liczb -----------> działa
        for (int i=0;i<6;i++) {
            LiczbyWylosowane[i] = GenLos.nextInt(9)+1; //aby wyszlo 49 bo losuje od zera
        }*/

        //g wylosowanie 6 liczb bez powtorek
        for (int i=0;i<6;i++) {
            if (i==0) {
                LiczbyWylosowane[i] = GenLos.nextInt(9)+1; // +
                pomocnicza[i]=LiczbyWylosowane[i];
            } else {
                LiczbyWylosowane[i] = GenLos.nextInt(9)+1; // +
                pomocnicza[i]=LiczbyWylosowane[i];
                j=i-1; //rozni sie od powyzszego tym ze zaczynamy zapis do tebeli pomocniczej z cofnieciem
                while (j>=0) {
                    if (LiczbyWylosowane[i]==pomocnicza[j]) {
                        LiczbyWylosowane[i] = GenLos.nextInt(9)+1; // +
                        j=i-1;
                    } else {
                        j--;
                    }
                }
                pomocnicza[i]=LiczbyWylosowane[i];
            }
        }



//c Program wypisuje na ekranie wytypowane przez użytkownika cyfry
        System.out.print("Wprowadzono liczby: ");
        for (int i=0;i<6;i++) {
            if (i != 5) {
                System.out.print(LiczbyUsera[i] + ",");
            } else {
                System.out.print(LiczbyUsera[i]);
            }
        }
        System.out.println();
        System.out.print("Tablica pomocnicza po losowaniu "); //do sprawdzenia
        for (int i=0;i<6;i++) {
            System.out.print(pomocnicza[i]+",");
        }


        // d wypisanie wylosowanych cyfr
        System.out.println();
        System.out.print("Wylosowano liczby: ");
        for (int i=0;i<6;i++) {
            if (i != 5) {
                System.out.print(LiczbyWylosowane[i] + ",");
            } else {
                System.out.print(LiczbyWylosowane[i]);
            }
        }

        //e. Program wyświetla wynik użytkownika w poniższej formie: Trafiono n z 6 cyfr
        System.out.println();
        int trafienia=0;

        for (int i_user=0; i_user<6;i_user++) {
            for (int i_losowane=0;i_losowane<6;i_losowane++) {
                if (LiczbyUsera[i_user]==LiczbyWylosowane[i_losowane]) {
                    trafienia=trafienia+1;
                }
            }
        }

        System.out.println("Trafiono " +trafienia+ " z 6 liczb");


//koniec klasy
    }
}
