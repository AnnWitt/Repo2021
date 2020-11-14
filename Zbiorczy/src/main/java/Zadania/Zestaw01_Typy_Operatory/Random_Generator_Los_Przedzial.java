package Zadania.Zestaw01_Typy_Operatory;

import java.util.Random;
import java.util.Scanner;

public class Random_Generator_Los_Przedzial {
    public static void main(String[] args) {

        Random gen=new Random();
        int liczba_losowa= gen.nextInt(); //będzie przypisana losowa wartość

        System.out.println("Losowa wartość liczby to " + liczba_losowa);

        liczba_losowa= gen.nextInt(500);
        System.out.println("Liczba losowa z zakresu od 0 do 500 to " + liczba_losowa);

        Scanner zczyt=new Scanner(System.in);
        System.out.println("Podaj dolny zakres przedziału (od)");
        int dolny_zakres=zczyt.nextInt();
        System.out.println("Podaj górny zakres przedziału (do)");
        int gorny_zakres= zczyt.nextInt();

        if (dolny_zakres>gorny_zakres) {
            //zamiana liczb
            System.out.println("podano niepoprawne zakresy - korekta");
            dolny_zakres=dolny_zakres+gorny_zakres;
            gorny_zakres=dolny_zakres-gorny_zakres;
            dolny_zakres=dolny_zakres-gorny_zakres;
            System.out.println("dolny zakres= " + dolny_zakres+" a gorny = "+ gorny_zakres);
        }
        int ile_liczb=gorny_zakres-dolny_zakres+1;
        //przedział - <a;b> => ile liczb pomiędzy => b-a+1

       // System.out.println(ile_liczb + " " + gen.nextInt(ile_liczb)+ " " + (gen.nextInt((ile_liczb))+dolny_zakres)); testowe
       // System.out.println(ile_liczb + " " + gen.nextInt(ile_liczb)+ " " + (gen.nextInt((ile_liczb))+dolny_zakres));
    System.out.println("Losowa liczba z przedziału od "+ dolny_zakres+" do "+ gorny_zakres + " to " + (gen.nextInt((ile_liczb))+dolny_zakres));



       /* // Losowanie liczby z zakresu [a,b] i wyświetlenie jej na konsolę.
       //przedział - <a;b> => ile liczb pomiędzy => b-a+1
        System.out.println(gen.nextInt((b-a+1))+a );
        // b-a+1 - tyle liczb jest w przedziale od a do b,
        // a bo to najmniejsza liczba w zakresie.*/


    }
}
