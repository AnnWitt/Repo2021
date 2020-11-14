package Zadania.Zestaw04_Rozne;

import java.util.Random;
import java.util.Scanner;


public class Zestaw04_Zadanie14 {

    public static void main(String[] args) {
        Random paliwo = new Random();
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00"); //Dodatkowo wyszukane
        float Zbiornik = 0;
        float x;
        double Cena= 5.12;
        String Odpowiedz = "t";
        //int test = 0;


        System.out.println("Zaczynamy tankowanie");

        while (Odpowiedz.equals("t")) { //wykonuj poki Odpowiedz jest t
            x = (paliwo.nextFloat()) * 10;
            Zbiornik=Zbiornik+x;
            System.out.println("Wlano "+ df.format(x) + " litrów paliwa. Ogółem zatankowano do tej pory " + df.format(Zbiornik) + " Litrów paliwa. Czy chcesz kontyuować t/n");
            Odpowiedz = input.nextLine();
        }
        System.out.println("Koniec tankowania. Zatankowano " + df.format(Zbiornik) + " Litrów paliwa"+" . Obecna cena litra paliwa to " + Cena + " zł." );
        System.out.println("Cena zatankowanego paliwa to: " +df.format(Cena*Zbiornik)+" zł");
        System.out.println(df.format(Zbiornik));


/*     METODA LOMA :)   while (test!=1) {
            System.out.println("t/n");
            Odpowiedz= input.nextLine();
            switch (Odpowiedz){
                case "t":
                    test=0;
                    break;
                case "n":
                    test=1;
                    break;
                default:
                    test=1;
                    break;
            }
            System.out.println("-> "+ Odpowiedz + " "+ test);
        }*/



/*        // Evaluates to false
        fooString1 == fooString2;
// Evaluates to true
        fooString1.equals(fooString2);*/
/*
        In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates
        to the comparison of values in the objects.*/


//koniec klasy
    }

}
