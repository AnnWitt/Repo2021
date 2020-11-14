package Zadania.Zestaw01_Typy_Operatory;

import java.util.Scanner;

public class Zestaw01_Zadanie14 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        double dliczba= input.nextDouble();
        int iliczba=(int) dliczba;

        System.out.println("a. wartość bezwzględna liczby "+ iliczba + " to " + Math.abs(iliczba));
        System.out.println("b. wartość przeciwna liczby "+ iliczba + " to " + (iliczba*(-1)));
        System.out.println("c. wartość odwrotna liczby "+ iliczba + " to " +(1/dliczba));

    }
}
