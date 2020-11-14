package Zadania.Zestaw02_Petle;

import java.util.Arrays;
import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie12 {

    public static void main(String[] args) {

        int IleLiczb = 12;
        int[] Tablica = new int[IleLiczb];
        //int[] Tablica2=new int[4];

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < IleLiczb; i++) {
            System.out.print("podaj liczbe ");
            Tablica[i]=input.nextInt();
        }

        for (int i = 0; i < IleLiczb; i++) {
            System.out.print(Tablica[i] + " ");
        }

        //pod sama medianę
        Arrays.sort(Tablica);
        System.out.println();

        System.out.println();
        for (int i = 0; i < IleLiczb; i++) {
            System.out.print(Tablica[i] + " ");
        }

        float Mediana;


        if (IleLiczb%2==0) {
            Mediana=(Tablica[IleLiczb/2]+Tablica[(IleLiczb/2)-1])/2f;
/*            System.out.println(Tablica[IleLiczb/2]);
            System.out.println(Tablica[(IleLiczb/2)-1]);*/
        } else {
            Mediana=Tablica[(IleLiczb/2)];
        }
        System.out.println("Mediana wynosi: " +Mediana);

//pod sama medianę




/*        for (int i=0;i<3;i++) {
             if(Tablica[i]>Tablica[i+1]) {
                 wiekszy=Tablica[i];
                 Tablica[i]=Tablica[i+1];
                 Tablica[i+1]=wiekszy;
             }
        }*/

/*
        for (int i=0;i<4;i++) {
            System.out.print(Tablica[i]+ " ");
        }
*/

/*




        for (int i=0;i<4;i++) {
            System.out.print(Tablica[i]+ " ");
        }
*/


        // koniec klasy
    }
}
