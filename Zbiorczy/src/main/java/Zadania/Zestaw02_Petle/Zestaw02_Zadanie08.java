package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie08 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int min=0;
        int max=0;
        int Liczba=0;

//bez tablicy
   do {
       System.out.println("Podaj liczbę");
       Liczba=input.nextInt();
       if (min==0) {
           min=Liczba;
       }
       if (max==0){
           max=Liczba;
       }
       if (Liczba<min && Liczba!=0) {
           min=Liczba;
       }
       if (Liczba>max && Liczba!=0) {
           max=Liczba;
       }
       System.out.println(min+" "+max);
   } while (Liczba!=0);
        //
        System.out.println("min " + min + " max "+ max + " max + min = " + (max+min) + " średnia wynosi: " + ((max+min)/2));


        System.out.println("Metoda z tablicą");

        int[] Tb=new int[2];


        //t0 - min, t1 - max
        //System.out.println("Podaj liczbę (tb)");
        do {
            System.out.println("Podaj liczbę (tb)");
            Liczba=input.nextInt();
            if (Liczba!=0) {
                    if (Liczba<Tb[0]) {
                        Tb[0]=Liczba;
                    }
                    if (Liczba>Tb[1]) {
                        Tb[1]=Liczba;
                    }
            }
        } while (Liczba!=0);

        System.out.println("min " + Tb[0] + " max "+ Tb[1] + " max + min = " + (Tb[1]+Tb[0]) + " średnia wynosi: " + ((Tb[1]+Tb[0])/2));

    }
}
