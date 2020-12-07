package BlokiTematyczne.Petle;

import java.util.Scanner;

class PetlaDoWhile_DoSpelnieniaWarunku {
    public static void main(String[] args) {
        // do {instrukcja} while(warunek); //wykona sie przynajmniejraz - zrob i dopiero sprawdzaj warunek

        //wczytuj tak dlugo az nie jest 13

        Scanner dw = new Scanner(System.in);
        System.out.println("podaj liczbe - pierwszy sposob");
        int liczba = dw.nextInt();

        while (liczba != 13) {
            System.out.println("podaj liczbe");
            liczba = dw.nextInt();
        }
        System.out.println("jest 13"); //powtorka dopoki nie ma 13

        //drugi sposob
        System.out.println("podaj liczbe drugi sposob");
        int liczba2;

        do {
            System.out.println("podaj liczbe");
            liczba2 = dw.nextInt();
        } while (liczba2 != 13);
        System.out.println("liczb2 jest 13");

        System.out.println("Trzeci sposób");
        KonstruktoryAlternatywa ka=new KonstruktoryAlternatywa();
        System.out.println("Podaj liczbę");

        while (ka.CzyLiczba(dw.nextInt())==false) {
            System.out.println(ka.CzyLiczba(dw.nextInt()));
            dw.nextInt();
        }

    }
}



class KonstruktoryAlternatywa {

    public KonstruktoryAlternatywa() {
    }

    public static boolean CzyLiczba (int liczba) {
        if (liczba==13) {
            System.out.println("Zgadłeś");
            return true;
        } else {
            System.out.println("Nie zgadłeś");
            return false;
        }
    }



}
