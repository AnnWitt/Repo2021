package Zadania.Zestaw04_Rozne;

import java.util.Scanner;

public class Zestaw04_Zadanie05 {

    public static void main(String[] args) {

       /* 5. Napisz program, który oblicza sumę liczb cyfry tj.
                dla liczby 52 suma jej pojedynczych cyfr wynosi ‘5’ + ‘2’ -> ‘7’. Podpowiedź: Użyj metody split na obiekcie typu String
        */

        Scanner input=new Scanner(System.in);
        System.out.println("podaj liczbę");
        String LiczbaString= input.next();
        //int LiczbaInt= input.nextInt();
        //System.out.println(LiczbaString);
        int Dlugosc= LiczbaString.length();
        //System.out.println(Dlugosc);
        String[] Tablica=LiczbaString.split("",Dlugosc);
        int[] TablicaInt=new int[Dlugosc];

        int suma=0;

        System.out.print("Suma wartości ");
        for (int i=0;i<Dlugosc;i++) {
            TablicaInt[i]= Integer.parseInt(Tablica[i]);
            suma=suma+TablicaInt[i];

            if (i==(Dlugosc-1)) {
                System.out.print("'"+Tablica[i]+"'");
            } else {

                System.out.print("'" + Tablica[i]+ "'" + " + ");
            }

        }
        System.out.print(" wynosi " + "'" + suma+"'");




//koniec klasy
    }
}
