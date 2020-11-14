package Zadania.Zestaw04_Rozne;

import java.util.Scanner;

public class Zestaw04_Zadanie05_bezsplita {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią");

        int Liczba= input.nextInt();
        int Liczba_bkp=Liczba;
        int IloscZnakow=String.valueOf(Liczba).length();
        int[] Skladowe=new int[IloscZnakow+1];

int i=0;

if (String.valueOf(Liczba).length()>1) {
    while ((Liczba / 10) > 0) {
        Skladowe[i] = Liczba - ((Liczba) / 10) * 10;
        Skladowe[i + 1] = (Liczba) / 10;
        Liczba = (Liczba / 10);
        i++;
    }

    int suma = 0;
    for (int k = 0; k < IloscZnakow; k++) {
        if (k == (IloscZnakow - 1)) {
            suma = suma + Skladowe[k];
            System.out.print("'" + Skladowe[k] + "'");
        } else {
            suma = suma + Skladowe[k];
            System.out.print("'" + Skladowe[k] + "'" + " +");
        }
    }
    System.out.println(" wynosi " + suma);
} else {
    System.out.println("Suma wynosi " + Liczba);
}



        //koniec klasy
    }

}
