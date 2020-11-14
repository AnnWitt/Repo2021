package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Scanner;

public class Zestaw09_Zadanie09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Czesc, jestem kalkulatorem");
        System.out.println("Podaj 1 liczbę");
        int liczba1 = 0;
        int liczba2 = 0;

        while (input.hasNextInt() != true) {
            if (input.hasNextInt() == true) {
            } else {
                System.out.println("Podana wartość nie jest liczba. Podaj liczbę");
                input.next();
            }
        }
        liczba1 = input.nextInt();

        System.out.println("jaką operację chcesz przeprowadzić: +,-,*,/");

        String dzialanie = input.next();
        boolean walidacja=false;

        while (walidacja==false) {
            if (dzialanie.equals("+") || dzialanie.equals("-") || dzialanie.equals("*") || dzialanie.equals("/")) {
                System.out.println("ok " + dzialanie);
                walidacja=true;
            } else {
                System.out.println("nie ok " + dzialanie);
                walidacja=false;
                dzialanie=input.next();
            }
        }


        System.out.println("Podaj 2 liczbę");
        while (input.hasNextInt() != true) {
            if (input.hasNextInt() == true) {
            } else {
                System.out.println("Podana wartość nie jest liczba. Podaj liczbę");
                input.next();
            }
        }
        liczba2 = input.nextInt();

        switch (dzialanie) {
            case "+":
                System.out.println(liczba1 + " + " + liczba2 + " = " + (liczba1 + liczba2));
                break;
            case "-":
                System.out.println(liczba1 + " - " + liczba2 + " = " + (liczba1 - liczba2));
                break;
            case "*":
                System.out.println(liczba1 + " * " + liczba2 + " = " + (liczba1 * liczba2));
                break;
            case "/":
                System.out.println("dzielenie");
                if (liczba2 != 0) {
                    System.out.println(liczba1 + " / " + liczba2 + " = " + (liczba1 / liczba2));
                } else {
                    System.out.println("Nie można dzielić przez zero");
                }

                break;
/*            default:
                System.out.println("zbędne");*/
        }
    }
}
