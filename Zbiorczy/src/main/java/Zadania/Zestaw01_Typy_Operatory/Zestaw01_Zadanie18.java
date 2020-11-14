package Zadania.Zestaw01_Typy_Operatory;

import java.util.Random;
import java.util.Scanner;

public class Zestaw01_Zadanie18 {

    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    Random losowa=new Random();

    int A=losowa.nextInt(500);
    int B= losowa.nextInt(500);

        System.out.println("A = "+ A+ " B = "+ B + " .Czy A>B? Tak/Nie");
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

        if (A>B && odpowiedz=="Tak") {
            System.out.println("Zgadza się, A jest większe od B");
        }
        if (A>B && odpowiedz=="Nie"){
            System.out.println("Nieprawda, A jest większe od B");
        }
        if (A<B && odpowiedz=="Nie") {
            System.out.println("Zgadza się, A jest mniejsze od B");
        }
        if (A<B && odpowiedz=="Tak") {
            System.out.println("Nieprawda, A nie jest większe od B");
        }
    }
}
