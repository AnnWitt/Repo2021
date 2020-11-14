package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie03 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("podaj a ");
        int a = liczba.nextInt();
        System.out.println("podaj b");
        int b = liczba.nextInt();
        int potega = a;
        if (b != 0) {
            for (int i = 1; i < b; i++) {
                potega = potega * a;
            }
        } else {
            potega = 1;
        }
        System.out.println(a + " do potęgi " + b + " = " + potega);

    }

}
