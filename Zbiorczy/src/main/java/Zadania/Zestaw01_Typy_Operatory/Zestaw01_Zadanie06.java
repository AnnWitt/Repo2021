package Zadania.Zestaw01_Typy_Operatory;

import java.util.Scanner;

public class Zestaw01_Zadanie06 {

    public static void main(String[] args) {

        Scanner ww=new Scanner(System.in);
        System.out.println("Podaj wagę");
        int waga=ww.nextInt();
        System.out.println("Podaj wzrost");
        int wzrost=ww.nextInt();

        if (waga<180 && wzrost>150) {
            System.out.println("Możesz wejść na kolejkę");
        }

    }
}
