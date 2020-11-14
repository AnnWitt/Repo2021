package Zadania.Zestaw02_Petle;

import java.util.Random;
import java.util.Scanner;

public class Zestaw02_Zadanie09 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int Liczba= random.nextInt(100);
        //System.out.println(Liczba);
        System.out.println("Zgadnij liczę");
        int LiczbaZG= input.nextInt();

        int i=1;
        while (LiczbaZG!=Liczba) {
            if (LiczbaZG>Liczba){
                System.out.println("Liczba, którą zgadujesz jest mniejsza. Spróbuj ponownie");
                LiczbaZG= input.nextInt();
            }
            if (LiczbaZG<Liczba) {
                System.out.println("Liczba, którą zgadujesz jest większa. Spróbuj ponownie");
                LiczbaZG= input.nextInt();
            }
            i++;
        }
        System.out.println("Gratulacje: Zgadłeś liczbę");


    }
}
