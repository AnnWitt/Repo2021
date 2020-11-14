package Zadania.Zestaw03_Tablice;

import java.util.Random;

public class Zestaw03_Zadanie02 {

    public static void main(String[] args) {

        int[] Tablica1=new int[20];

        Random GenLos=new Random();

        int Losowa;

        for (int i=0; i<20;i++) {
            Losowa=GenLos.nextInt(10)+1;
            Tablica1[i]=Losowa; //aby za kazdym odwolaniem nie robil nowego losowania
            System.out.print(Tablica1[i] + " ");
        }
        System.out.println();
        int wystapien=0;

        int[] TablicaWynikow=new int[10];
        for (int i=0;i<10;i++) {
            TablicaWynikow[i]=i+1;
            //System.out.print(TablicaWynikow[i]+ " ");
        }

        System.out.println();
        for (int i_wystapienia=0;i_wystapienia<10;i_wystapienia++) {
            wystapien=0;
            for (int i=0; i<20;i++) {
                if (TablicaWynikow[i_wystapienia]==Tablica1[i]) {
                    wystapien=wystapien+1;
                }
            }
            System.out.println(TablicaWynikow[i_wystapienia]+" występuje " + wystapien + " razy");
        }
        //koniec klasy
    }

}
