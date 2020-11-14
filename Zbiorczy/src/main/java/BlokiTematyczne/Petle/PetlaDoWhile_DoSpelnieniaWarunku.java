package BlokiTematyczne.Petle;

import java.util.Scanner;

class PetlaDoWhile_DoSpelnieniaWarunku {
    public static void main(String[] args) {
        // do {instrukcja} while(warunek); //wykona sie przynajmniejraz - zrob i dopiero sprawdzaj warunek

        //wczytuj tak dlugo az nie jest 13

        Scanner dw = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba = dw.nextInt();

        while (liczba != 13) {
            System.out.println("podaj liczbe");
            liczba = dw.nextInt();
        }
        System.out.println("jest 13"); //powtorka dopoki nie ma 13

        //drugi sposob
        System.out.println("podaj liczbe");
        int liczba2 = dw.nextInt();

        do {
            System.out.println("podaj liczbe");
            liczba = dw.nextInt();
        } while (liczba2 != 13);
        System.out.println("liczb2 jest 13");


//        do {
//            System.out.println("Podaj liczbe");
//            wczytanaLiczba = scanner.nextInt();
//        } while (wczytanaLiczba != 13);
//        System.out.println("Brawo, trafiles!");

        //!!!!!!!!!!!!!!przecwicz
    }
}
