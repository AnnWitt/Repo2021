package BlokiTematyczne.Petle;

import java.util.Scanner;

class PetleZadanieDoWhile1 {
    public static void main(String[] args) {
        //wszystkie liczby mniejsze od wpisanej od uzytkownika poki wieksze od 0
        Scanner scn = new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int liczba = scn.nextInt();

        do {
            System.out.println(liczba - 1);
            liczba--;
        } while ((liczba - 1) > 0);//bez zera
        //liczba--;} while ((liczba-1)>0); z zerem
    }
}
