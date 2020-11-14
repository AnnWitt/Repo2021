package Zadania.Zestaw01_Typy_Operatory;

import java.util.Scanner;

public class Zestaw01_Zadanie07 {

    public static void main(String[] args) {

        Scanner ww = new Scanner(System.in);
        System.out.println("Podaj wagę");
        int waga = ww.nextInt();
        System.out.println("Podaj wzrost");
        int wzrost = ww.nextInt();
        System.out.println("Podaj wiek");
        int wiek = ww.nextInt();


        if (waga < 180 && wzrost > 150 && wiek > 10 && wiek < 80 && wzrost < 220) {
            System.out.println("Możesz wejść na kolejkę");
        } else {
            //waga
            if (waga >= 180)
            {
                System.out.println("Za wysoka waga");
            }
            //wzrost
            if (wzrost <= 150)
            {
                System.out.println("Na mały wzrost");
            } else {
                if (wzrost >= 220)
                {
                    System.out.println("zbyt wysoki wzrost");
                }
            }
            //wiek
            if (wiek <= 10)
            {
                System.out.println("Zbyt mały wiek");
            } else{
                if (wiek >= 80)
                {
                    System.out.println("zbyt duży wiek");
                }
            }

            System.out.println("Nie możesz wejść na kolejkę");
        }

    }

}


