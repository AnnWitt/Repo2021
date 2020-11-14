package Zadania.Zestaw03_Tablice;

import java.util.Arrays;
import java.util.Random;

public class Zestaw03_Zadanie01 {
    public static void main(String[] args) {

        int[] tablica=new int[10];
        int DolnyZakres=-10;
        int GornyZakres=10;
        int IleLiczb=(GornyZakres-DolnyZakres+1); //od -10 do 10 = liczb pomiędzy nimi 10-(-10)+1=21
        //System.out.println(IleLiczb);
        Random Losowanie=new Random();

        int max=0, min=0, suma=0;

        for (int i=0;i<10;i++) {
        tablica[i]=Losowanie.nextInt(IleLiczb)+DolnyZakres;
        suma=suma+tablica[i];
        if (i==0) {
            max=tablica[i];
            min=max;
        }

        if (tablica[i]>max) {
            max=tablica[i];
        }

        if (tablica[i]<min) {
            min=tablica[i];
        }

        System.out.println(i + " pozycja = " + tablica[i]);}
        System.out.println("Największy element tablicy to " + max + " najmniejszy element tablicy to = " + min);
        float srednia=suma/10f;
        System.out.println("Srednia elementów tablicy to " + srednia);

        //mniejsze lub wieksze od sredniej
        int mniejsze=0, wieksze=0;

        for (int i=0;i<10;i++) {
            if (tablica[i]>srednia) {
                System.out.println(tablica[i] + " jest wieksza od sredniej równej "+srednia);
                wieksze=wieksze+1;
            } else {
                System.out.println(tablica[i] + " jest mniejsza od sredniej równej "+srednia);
                mniejsze=mniejsze+1;
            }

        }

        System.out.println("Wiekszych od średniej " + wieksze + " mniejszych od sredniej "+ mniejsze);
        //tablica w odwrotnej kolejnosci

        System.out.println("Tablica w odwrotnej kolejnosci");
        for (int i=9; i>=0;i--) {
            System.out.println(tablica[i]);
        }

        //wyznaczyc medianę

        Arrays.sort(tablica); //od najmniejszych

        //Obliczanie mediany jezeli parzyste np 6/2 = 3 tj srednia z 3 i 4 elementu
        //jesli nieparzyste to np 7/2=3 -> 3+1 = 4

        System.out.println("Mediana = "+ ((tablica[5]+tablica[6])/2));


/*        int ile_liczb=gorny_zakres-dolny_zakres+1;
        //przedział - <a;b> => ile liczb pomiędzy => b-a+1


        System.out.println("Losowa liczba z przedziału od "+ dolny_zakres+" do "+ gorny_zakres + " to " + (gen.nextInt((ile_liczb))+dolny_zakres))*/




//koniec klasy
    }

}
