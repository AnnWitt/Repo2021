package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Scanner;

public class Zestaw09_Zadanie01_do_Zadanie05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dowolny ciąg znakoów");
        String text = input.nextLine();
        System.out.println("Podaj słowo do wyszukania");
        String searched = input.nextLine();

        System.out.println("pkt 2 do zmiennej text przypisano wartosc " + text);
        //a sprawdź czy w tekście występuje słowo “ania” - contains
        System.out.println("1a czy" + "'ania'" + "w tekscie " + text.contains("ania"));
        //b. sprawdź czy tekst zaczyna się od słowa “ania” - startsWith
        System.out.println("1b czy zaczyna sie od 'ania' " + text.startsWith("ania"));
        //c. sprawdź czy tekst kończy się słowem “ania” - endsWith
        System.out.println("1c czy konczy sie 'ania' " + text.endsWith("ania"));
        //d. sprawdź czy tekst równa się słowu “ania” - equals
        System.out.println("1d czy text = ania " + (text.equals("ania")));
        //e. sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania” -toLowerCase + contains
        System.out.println("1e czy test zawiera ania - niezaleznie od znaku " + (text.toLowerCase()).contains("ania"));
        /*  f. zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście - indexOf*/
        System.out.println("1f pierwsze wystapienie ania " + text.indexOf("ania"));

        System.out.println("3 czy zawartosc searched  w tekscie " + text.contains(searched));

        System.out.println();
        System.out.println("Z4. 'a' do 'z'");
        char zmChar;
        for (int i = 97; i <= 122; i++) {
            zmChar = (char) i;
            System.out.print(zmChar + " ");
        }

 /*       Napisz program który zlicza wystąpienia liter w tekście. Posłuż się do tego pętlami
        for/while. (spróbuj zaimplementować na dwa sposoby).
        a. sposób 1/wskazówka 1: wykorzystaj kody ascii liter i iteruj tekst tyle razy, ile
        mamy liter w alfabecie i porównuj litery z kodami ascii
        b. *sposób 2/wskazówka 2: wykorzystaj do zliczania dodatkową tablicę.*/

        String test = "abtrtraw";
        test.length();
        System.out.println();
        int licznik = 0;
        System.out.println("Zliczanie liter petlami");
        for (char c = 97; c <= 122; c++) {
            //licznik=0;
            if (test.contains(String.valueOf(c))) {
                //System.out.println(c);
                licznik = 0;
                for (int i = 0; i < test.length(); i++) { //charat(i) - wartosc c
                    if (test.charAt(i) == c) {
                        licznik = licznik + 1;
                    }
                }
                System.out.println(c + " " + licznik);
            }
        }

        System.out.println("Zliczanie liter tablicą");
        char[] TablStr = new char[test.length()];

/*        for (int i=0;i<test.length();i++) {
            TablStr[i]=String.valueOf(test.charAt(i));
            System.out.print(TablStr[i]+ " ");
        }*/

        for (int i = 0; i < test.length(); i++) {
            TablStr[i] = test.charAt(i);
            System.out.print(TablStr[i] + " ");
        }

        System.out.println();


        licznik = 0;
        for (char c = 97; c < 122; c++) {
            licznik = 0;
            for (int i = 0; i < test.length(); i++) {
                if (c == TablStr[i]) {
                    licznik = licznik + 1;
                }
            }
            if (licznik != 0) {
                System.out.println(c + " " + licznik);
            }

        }

        //konec klasy
    }
}

/*    Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na
        poszczególne słowa. Następnie aplikacja zlicza ilości wystąpień słów. Np. dla tekstu
        ala lubi koty, ale ala nie jest przez koty lubiana
        ala - 2
        lubi - 1
        koty - 2
        ale -*/



/*        System.out.println("opcja z okreslona kolejnoscia (ktora zwraca za duzo");

                for (int i=0;i<TblStr.length;i++) {
        licznik=0;
        for (int j=i;j<TblStr.length;j++) {
        if (TblStr[i].equals(TblStr[j])) {
        licznik=licznik+1;
        }
        }
        //tu powinna byc decyzja czy wyswielic wartosc tj czy nie jest duplikatem ale ...
        System.out.println(TblStr[i] + " " + licznik);
        }*/
