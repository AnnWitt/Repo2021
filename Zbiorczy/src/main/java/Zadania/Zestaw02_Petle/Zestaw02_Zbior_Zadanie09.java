package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie09 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int Liczba=0;
        int i=1;

        while (i<6) {
            System.out.println("Podaj "+ i+ " liczbę.");
            Liczba= Liczba+input.nextInt();
            i++;
        }

        System.out.println("Srednia podanych liczb wynosi: "+ (Liczba/5));

    }
}
