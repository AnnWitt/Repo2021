package BlokiTematyczne.Petle;

import java.util.Scanner;

class ZadaniePetlaFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("liczbe");
        int liczba = input.nextInt();
        System.out.println("podaj dzielnik");
        int dzielnik = input.nextInt();

        for (int i = 1; i < liczba; i++) {
            if (i % dzielnik == 0) { //podzielne bez reszty
                System.out.println(i);
            } else {
                //System.out.println("niepodzielne");
            }
        }
    }
}
