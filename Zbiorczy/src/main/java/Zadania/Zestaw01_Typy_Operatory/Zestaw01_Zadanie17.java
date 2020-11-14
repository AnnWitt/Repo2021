package Zadania.Zestaw01_Typy_Operatory;

import java.util.Random;
import java.util.Scanner;

public class Zestaw01_Zadanie17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random losowanie = new Random();
        int A = losowanie.nextInt(1000);
        System.out.println("Liczba A wynosi ->  " + A + ". Czy jest ona większa od 100? Tak/Nie");
        String odpowiedz = input.nextLine();

        switch (odpowiedz) {
            case "Tak":
                odpowiedz = "Tak";
                break;
            case "TAK":
                odpowiedz = "Tak";
                break;
            case "Nie":
                odpowiedz = "Nie";
                break;
            case "NIE":
                odpowiedz = "Nie";
                break;
            case "N":
                odpowiedz = "Nie";
                break;
            case "n":
                odpowiedz = "Nie";
                break;
            case "T":
                odpowiedz = "Tak";
                break;
            case "t":
                odpowiedz = "Tak";
                break;
            default:
                System.out.println("Podano niepoprawką odpowiedź");
                break;
        }

        if (A > 100 && odpowiedz == "Tak") {
            System.out.println("Zgadza się, A jest większe od 100");
        }
        if (A > 100 && odpowiedz == "Nie") {
            System.out.println("Nieprawda, A jest większe od 100");
        }
        if (A < 100 && odpowiedz == "Nie") {
            System.out.println("Zgadza się, A jest mniejsze od 100");
        }
        if (A < 100 && odpowiedz == "Tak") {
            System.out.println("Nieprawda, A jest mniejsze od 100");
        }
    }

}
