package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Arrays;
import java.util.Scanner;

// Weryfikacja poprawnego sparowania nawiasów
public class Zestaw09_Zadanie13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz wyrażenie arytmetyczne");
        String l0 = input.nextLine();


        String l1 = "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"; //błędny (liczba nawiasow)
        String l2 = "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))"; //poprawny
        String l3 = ")))((("; //błędny - układ
        String l4=")(";

        String x = l4; //<-------------------------------------------------------------- Ciąg do sprawdzenia

        String[] tbl = x.split("");

        System.out.println(Arrays.toString(tbl));

        int licznikLewy = 0;
        int licznikPrawy = 0;

        for (int i = 0; i < tbl.length; i++) {
            if (tbl[i].equals("(")) {
                licznikLewy = licznikLewy + 1;
            }
            if (tbl[i].equals(")")) {
                licznikPrawy = licznikPrawy + 1;
            }

        }

        int dodatkowe = 0;

        if (licznikLewy != licznikPrawy) {
            System.out.println("Nawiasy źle sparowane - lewych " + licznikLewy + " prawych " + licznikPrawy);
        } else {
            //System.out.println(licznikLewy + licznikPrawy);
            dodatkowe = 1;
        }

        if (dodatkowe == 1) {

            for (int i = 0; i < tbl.length; i++) {

                for (int j = i; j < (tbl.length - 1); j++) {
                    if ((tbl[i].equals("(")) && (tbl[j + 1].equals(")"))) {
                        tbl[i] = "L";
                        tbl[j + 1] = "P";
                        i = 0;
                    }

                }
                //System.out.println(i + " " + Arrays.toString(tbl));
            }

            //System.out.println(Arrays.toString(tbl));

            int walidacja = 0;

            for (int k = 0; k < tbl.length; k++) {
                if (tbl[k].equals("(") || tbl[k].equals(")")) {
                    walidacja = walidacja + 1;
                }
            }
            if (walidacja > 0) {
                System.out.println("Niepoprawne sparowanie nawiasów");
            } else {
                System.out.println("Poprawne sparowanie nawiasów");
            }
        }
//
    }

}


//z redukcja tablicy (niepotrzebna, w sumie tylko do ogladania co sie dzieje bez zbednych znaków
 /*   public static void main(String[] args) {
        String l1 = "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"; //błędny (liczba nawiasow)
        String l2 = "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))"; //poprawny
        String l3 = ")))((("; //błędny - układ

        String x = l2;

        String[] tbl = x.split("");

        System.out.println(Arrays.toString(tbl));

        int licznikLewy = 0;
        int licznikPrawy = 0;

        for (int i = 0; i < tbl.length; i++) {
            if (tbl[i].equals("(")) {
                licznikLewy = licznikLewy + 1;
            }
            if (tbl[i].equals(")")) {
                licznikPrawy = licznikPrawy + 1;
            }

        }

        int dodatkowe = 0;

        if (licznikLewy != licznikPrawy) {
            System.out.println("Nawiasy źle sparowane - lewych " + licznikLewy + " prawych " + licznikPrawy);
        } else {
            //System.out.println(licznikLewy + licznikPrawy);
            dodatkowe = 1;
        }

        if (dodatkowe==1) {
            String[] nawiasy = new String[licznikLewy + licznikPrawy];
            int nowa = 0;
            for (int i = 0; i < tbl.length; i++) {
                if ((tbl[i].equals("(")) || (tbl[i].equals(")"))) {
                    nawiasy[nowa] = tbl[i];
                    nowa = nowa + 1;
                }
            }

            for (int i = 0; i < nawiasy.length; i++) {

                for (int j = i; j < (nawiasy.length - 1); j++) {
                    if ((nawiasy[i].equals("(")) && (nawiasy[j + 1].equals(")"))) {
                        nawiasy[i] = "L";
                        nawiasy[j + 1] = "P";
                        i = 0;
                    }

                }
                //System.out.println(i + " " + Arrays.toString(nawiasy));
            }

            System.out.println("Po redukcji");
            System.out.println(Arrays.toString(nawiasy));

            int walidacja = 0;

            for (int k = 0; k < nawiasy.length; k++) {
                if (nawiasy[k].equals("(") || nawiasy[k].equals(")")) {
                    walidacja = walidacja + 1;
                }

            }

            if (walidacja>0) {
                System.out.println("Niepoprawne sparowanie nawiasów");
            } else {
                System.out.println("Poprawne sparowanie nawiasów");
            }
        }
//
    }*/