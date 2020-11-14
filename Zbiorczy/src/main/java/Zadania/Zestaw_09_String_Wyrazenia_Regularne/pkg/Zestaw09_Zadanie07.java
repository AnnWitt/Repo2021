package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Scanner;

class Zestaw09_Zadanie07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("podaj ciag znakow");
        String tekst = input.next();
        System.out.println("same male" + tekst.toLowerCase());
        System.out.println("same mduze " + tekst.toUpperCase());
    }
}
