package Zadania.Zestaw02_Petle;

import java.util.Arrays;
import java.util.Scanner;

public class Zestaw02_Zbior_Zadanie13 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[] Tablica=new int[5];

        for (int i=0;i<5;i++) {
            System.out.print("Wczytaj " + (i+1) + " liczbę ");
            Tablica[i]=input.nextInt();
        }

        System.out.println();
        for (int i=0;i<5;i++) {
            System.out.print(Tablica[i] + " ");
        }

        Arrays.sort(Tablica);
        System.out.println();
        System.out.println("uporzadkowane");

        for (int i=0;i<5;i++) {
            System.out.print(Tablica[i] + " ");
        }

        System.out.println();
        System.out.println("Bez duplikatów");
        for (int i=0;i<5;i++) {
            if (i==0) {
                System.out.print(Tablica[i]+ " ");
            } else {
                if (Tablica[i]!=Tablica[i-1]) {
                    System.out.print(Tablica[i]+ " ");
                } else {
                    //System.out.print("D ");
                }
            }

        }




        //int CzyUnikat=1;
        /*for (int i=0;i<5;i++) {
            if (i==0) {
                CzyUnikat=1;
                System.out.print(Tablica[i] + " ");
                //System.out.println(i + " " + Tablica[i] + " ");
            }

            CzyUnikat=1;

            for (int j=i;j>=0;j--) {
                if (Tablica[i]==Tablica[j]) {
                    CzyUnikat=0;
                    //System.out.println(i + " " + j + " " +Tablica[i] + " " + Tablica[j]); //Tablica i powinna pojsc
                } else {
                    CzyUnikat=1;
                }

                if (CzyUnikat==1) {
                    System.out.print(Tablica[i] + " ");
                }


            }
        }*/



        //
    }
}
