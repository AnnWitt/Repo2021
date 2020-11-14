package Zadania.Zestaw02_Petle;

import java.util.Scanner;

public class Zestaw02_Zadanie05 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Podaj A");
        int A= input.nextInt();
        System.out.println("Podaj B wieksze od A");
        int B=input.nextInt();


        while (A>B) {
            System.out.println("Podaj A");
            A= input.nextInt();
            System.out.println("Podaj B większe od A");
            B=input.nextInt();
        }
        //System.out.println(A+" " +B);

        int suma=0;

        //sumowanie petla for

        for (int i=A; i<=B;i++) {
            suma=suma+i;
        }
        System.out.println("Suma pętlą for " +suma);

        //suma petla while

        suma=0;
        int i=A;
        while (i<=B) {
            suma=suma+i;
            i++;
        }
        System.out.println("Suma pętlą while " +suma);




        //koniec klasy
    }
}
