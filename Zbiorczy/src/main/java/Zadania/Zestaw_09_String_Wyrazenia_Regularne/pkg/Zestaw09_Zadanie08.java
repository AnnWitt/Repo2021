package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Arrays;

class Zestaw09_Zadanie08 {
    public static void main(String[] args) {

        String tekst = "ala lubi koty, ale ala nie jest ala koty lubiana";

        //String[] ary = "abc".split(""); ---------------------------->>>>>> !!!!!!!!!!!!
        String[] TblStr = (tekst.replace(",", "")).split(" ");
        String[] TblSort = (tekst.replace(",", "")).split(" ");
        Arrays.sort(TblSort); //jesloby bylo z tbl=tabl to by posortował obie

        for (int i = 0; i < TblStr.length; i++) {
            System.out.println(TblStr[i]);
        }

        int licznik = 1;
        int wystapienie = 0;
        System.out.println("proba podliczenia");


        for (int i = 0; i < (TblStr.length - 1); i++) {
            if (TblSort[i].equals(TblSort[i + 1])) {
                licznik = licznik + 1;
            } else {
                System.out.println(TblSort[i] + " " + licznik);
                licznik = 1;
            }
        }
        System.out.println();
        System.out.println("opcja z okreslona kolejnoscia");

        for (int i = 0; i < TblStr.length; i++) {
            licznik = 0;
            wystapienie = 0;
            for (int j = i; j < TblStr.length; j++) {
                if (TblStr[i].equals(TblStr[j])) {
                    licznik = licznik + 1;
                }
            }

            if (i > 0) {

                for (int k = i; k > 0; k--) {
                    if (TblStr[i].equals(TblStr[k - 1])) { //czyli jest duplikat
                        wystapienie = wystapienie + 1;
                    } else {

                    }
                }
            } else {
            }
            if (wystapienie == 0) {
                // System.out.println(TblStr[i] + " " + licznik + " wsyt "+ wystapienie);
                System.out.println(TblStr[i] + " " + licznik);
            }

        }

        //klasa
    }
}
