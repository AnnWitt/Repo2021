package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba= input.nextInt();

        while (liczba>0) {
            System.out.println("Hello World");
            System.out.println("Podaj kolejną liczbę");
            liczba= input.nextInt();
        }

    }



}
