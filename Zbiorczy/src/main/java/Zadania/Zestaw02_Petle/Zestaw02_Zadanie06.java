package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie06 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą, dodatnią");
        int liczba= input.nextInt();

        while (liczba<0) {
            System.out.println("Podaj liczbę całkowitą, dodatnią");
            liczba= input.nextInt();
        }

        int potega=2;
        //int i=0;

        //System.out.println((int) Math.pow(liczba, potega));


        //potegi liczby 2 nie wieksze niz liczba - 1,2,4,8
/*        while (potega<=liczba) {
            System.out.println(potega);
            potega=(int) Math.pow(2,i);
            i++;
        }*/

        for (int i=0;potega<=liczba;i++) {
            potega=(int) Math.pow(2,i);
            if (potega<=liczba) {
                System.out.println(potega);
            }
        }




//Koniec klasy
    }
}
