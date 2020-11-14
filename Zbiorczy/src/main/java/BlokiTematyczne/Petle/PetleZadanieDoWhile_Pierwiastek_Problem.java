package BlokiTematyczne.Petle;

import java.util.Scanner;

class PetleZadanieDoWhile_Pierwiastek_Problem {
    public static void main(String[] args) {
       // 2.*Napisz program, który oblicza wartość pierwiastka z wprowadzonej przez użytkownika
        // liczby, dopóki ta przyjmuje wartości większe od 0 (dla uproszczenia przyjmij że użytkownik wprowadza liczby całkowite)
        Scanner scp = new Scanner(System.in);
        System.out.println("podaj liczbe całkowitą");
        int liczba = scp.nextInt();
        double m=0.5;


        do {
           // liczba = ((liczba) / 2);
            liczba = ((liczba) / 2);
            System.out.println(liczba);
            //ok a teraz sam pierwiastek
        } while (liczba != 0);

        //System.out.println(liczba);

    }
}

/*
        System.out.println("podaj n ");
                int n = liczba.nextInt();
                System.out.println("podaj m");
                int m = liczba.nextInt();
                int potega = n;
                if (m != 0) {
                //blad - 3^0 =1
                for (int i = 1; i < m; i++) {
        potega = potega * n;
        }
        } else {
        potega = 1;
        }System.out.println(n + "^" + m + " = " + potega);
        */
