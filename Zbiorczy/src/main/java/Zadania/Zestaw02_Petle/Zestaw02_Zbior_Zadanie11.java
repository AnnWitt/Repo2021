package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie11 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int Liczba=0;

        do {
            System.out.println("Podaj liczbę"); //+" Liczba "+Liczba);
            Liczba=Liczba+input.nextInt();
        }  while (Liczba!=0);

        System.out.println("Suma wynosi: " + Liczba);
    }
}
