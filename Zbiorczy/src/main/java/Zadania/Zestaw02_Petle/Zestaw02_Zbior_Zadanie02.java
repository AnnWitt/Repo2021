package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie02 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ile liczb chcesz wczytać?");
        int IleLiczb=input.nextInt();
        int[] Tablica=new int[IleLiczb];
        int suma=0;

        for (int i=0; i<IleLiczb;i++) {
            System.out.println("Podaj " + (i+1) + " liczbę");
            Tablica[i]= input.nextInt();
            suma=suma+Tablica[i];
        }

        System.out.println("Suma podanych liczb wynosi " +suma);

        //koniec klasy
    }


}
