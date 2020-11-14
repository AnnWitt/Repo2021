package BlokiTematyczne.Petle;

import java.util.Scanner;

class PetlaWhile_SumaWszystkichPoprzednich { //sprawdz warunek i dopiero rob
    public static void main(String[] args) {
        int i = 2;
        while (i < 5) { //poki true bedzie sie wykonywac (warunek
            System.out.println(i);
            i++;
        }
        System.out.println("Zadanie");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scan2.nextInt();
        //suma wszystkich poprzedzających
        int j = 0;
        int suma = liczba;

        while (j < liczba) {
            suma = suma + j;
            j++;
        }
        System.out.println(suma);
    }
}
