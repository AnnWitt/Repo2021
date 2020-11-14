package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie07 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Ile liczb chcesz wpisac?");
        int N_int= input.nextInt();
        float N=(float) N_int;
        int [] tablica;
        tablica=new int[N_int];
        int min=0;
        int max=0;
        int suma=0;

        for (int i=0;i<N_int;i++) {
            System.out.println("podaj " + (i+1) + " liczbę");
            tablica[i]= input.nextInt();
            suma=suma+tablica[i];
            if (tablica[i]>max) {
                max=tablica[i];
                if (i==0) {
                min=max;
                suma=max;

                }
            } else {
                if (i==0) {
                    min = max;
                    suma=max;

                }
            }
            if (tablica[i]<min) {
                min=tablica[i];
            }

            //System.out.println("minimum = "+min + " maksimum = "+ max); //kontrolny
        }
        System.out.println("Suma najmniejszej i największej = "+ (min+max));
        System.out.println("Srednia wszystkich liczb = " + (suma/N));

     //koniec klasy
    }
}
