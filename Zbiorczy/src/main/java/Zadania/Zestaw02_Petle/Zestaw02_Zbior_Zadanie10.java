package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie10 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int Liczba=0;

        while (Liczba!=10) {
            System.out.println("Podaj liczbę");//" Liczba "+Liczba);
            Liczba=Liczba+input.nextInt();
        }
        System.out.println("Suma wynosi: " + Liczba);
    }

}
