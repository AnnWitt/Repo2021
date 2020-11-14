package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie04 {
    public static void main(String[] args) {



    Scanner podSilnie = new Scanner(System.in);
        System.out.println("Podaj liczbę");
    long liczba = podSilnie.nextInt();//bo się w int nie miesci wiecej niz 12
    long liczba2 = liczba;


    long i = 1;
        do

    {
        //i=liczba*liczba;
        i *= liczba;
        liczba--;
    } while(liczba>1);

        System.out.println("Silnia z "+liczba2 +" wynosi "+i);
}
}
