package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Scanner;

class Zestaw09_Zadanie06 {

/*    Napisz program który wczytuje od użytkownika tekst, a następnie dla tego tekstu
    zamienia wszystkie wystąpienia przecinków (“, “) na słowo “makarena”. (replaceAll)*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj ciag znakow");
        String tekst = input.next();
        System.out.println(tekst.replace(",", "makarena"));
        System.out.println(tekst.replaceAll(",", " "));

    }
}
