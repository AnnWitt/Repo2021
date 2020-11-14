package BlokiTematyczne.Petle;

import java.util.Scanner;

class PetleZadanieDoWhile1mod {
    //zrobic tak aby pytal az sie nie wpisze zera
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //System.out.println("Wpisz liczbe1");

        int liczbaOdUżytkownika;

        //do {liczbaOdUżytkownika};

        do {
            System.out.println("Wpisz liczbe");
            liczbaOdUżytkownika = scn.nextInt();
            if (liczbaOdUżytkownika > 0) {
                do {
                    System.out.println(liczbaOdUżytkownika - 1);
                    liczbaOdUżytkownika--;
                } while ((liczbaOdUżytkownika - 1) > 0);//bez zera
                //liczba--;} while ((liczba-1)>0); z zerem
            } else {
                if (liczbaOdUżytkownika == 0) {
                    System.out.println(liczbaOdUżytkownika + " wpisano zero - koniec");
                } else {
                    System.out.println(liczbaOdUżytkownika + " wpisano liczbe ujemna - jeszcze raz");
                }
            }
        } while (liczbaOdUżytkownika != 0);

    }
}