package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] Tablica=new int[5];
        int suma=0;

        for (int i=0; i<5;i++) {
            System.out.println("Podaj " + (i+1) + " liczbę");
            Tablica[i]= input.nextInt();
            suma=suma+Tablica[i];
        }

        System.out.println("Suma podanych liczb wynosi " +suma);

        //koniec klasy
    }

}
