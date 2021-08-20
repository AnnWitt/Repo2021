package z20210807.Zadania;

import java.util.Scanner;

public class Zestaw7 {

    public static void main(String[] args) {
        // Metoda71();
        // Metoda72();
        // Metoda73(3);
       // Metoda74(3);;

       /* int[] x= tablicaWywolanaZmetody();
        System.out.println(x[2]);*/

        int [] porownanieTabel1=new int[]{1,6,9};
        int [] porownanieTabel2=new int[]{2,3,8,6};

        Metoda75(porownanieTabel1,porownanieTabel2);

        int[] m71w=Metoda71wart();
        int[] m72w=Metoda72wart();
        System.out.println();
        //System.out.println(m71w[2] + " losowa " + m72w[2]);

        //7.6 Użyj kolejno stworzonych metod, aby zasymulować losowanie lotto - użytkownik dostanie
        // odpowiedź - ile liczb poprawnie "skreślił".
        System.out.println("Zadanie 7.6");
        Metoda75(m71w,m72w);
    }

    //Metody
    //7.1 Stwórz metodę, która zada użytkownikowi 6 pytań o liczbę skreślaną na kuponie. Wartości podawane przez
    //użytkownika będą kolejnymi elementami tablicy, którą metoda zwróci.
    static void Metoda71() {
        Scanner userInput = new Scanner(System.in);
        int[] Tbl1 = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("podaj " + (i + 1) + " liczbę");
            Tbl1[i] = userInput.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(Tbl1[i] + " ");
        }

    }

    static int[] Metoda71wart() {
        Scanner userInput = new Scanner(System.in);
        int[] Tbl1 = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("podaj " + (i + 1) + " liczbę");
            Tbl1[i] = userInput.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(Tbl1[i] + " ");
        }
        System.out.println();
    return Tbl1;
    }


    //7.2 Stwórz metodę, która zwraca tablicę sześcioelementową - wynik losowania lotto (wartości 1 - 49).
    static void Metoda72() {
        int[] Tbl2 = new int[6];
        for (int i = 0; i < 6; i++) {
            Tbl2[i] = (int) (Math.random() * 49) + 1;
            System.out.print(Tbl2[i] + " ");
        }
    }


    static int[] Metoda72wart() {
        int[] Tbl2 = new int[6];
        for (int i = 0; i < 6; i++) {
            Tbl2[i] = (int) (Math.random() * 49) + 1;
            System.out.print(Tbl2[i] + " ");
        }
        return Tbl2;
    }

    // 7.3 Metodę losującą zmodyfikuj tak, aby zwracała tablicę o różnych rozmiarach.
    static void Metoda73(int dlugosc) {
        int[] Tbl2 = new int[dlugosc];
        System.out.println();
        for (int i = 0; i < dlugosc; i++) {
            Tbl2[i] = (int) (Math.random() * 49) + 1;
            System.out.print(Tbl2[i] + " ");
        }
    }
    //7.4 Stwórz metodę sprawdzającą, czy tablica intów zawiera zadany element.
    static void Metoda74(int element) {
        int[] Tbl3 = new int[20];
        System.out.println();
        int czyZawiera = 0;
        for (int i = 0; i < 20; i++) {

            Tbl3[i] = (int) (Math.random() * 49) + 1;
            //System.out.print(Tbl3[i] + " ");
            if (Tbl3[i] == element) {
                czyZawiera = 1;
            };
        }
        switch (czyZawiera) {
            case 0: {
                System.out.println("Tablica nie zawiera elementu: " + element);
                break;
            }
            case 1: {
                System.out.println("Tablica zawiera element " + element);
                break;
            }
        }
    }
    //zwrot wartosci
    static int[] tablicaWywolanaZmetody() {
        int[] tblTest=new int[]{3,5,6,7,2};
        return tblTest;
    };
    //7.5 Stwórz metodę zwracającą, ile elementów jednej tablicy znajduje się w drugiej.

    static void Metoda75 (int[] tbl1,int[] tbl2) {
        int licznik=0;
        System.out.println("tbl1len " + tbl1.length);
        System.out.println("tbl2len " + tbl2.length);
        for (int i=0; i<tbl1.length;i++) {
            for (int j=0;j<tbl2.length;j++) {
                if (tbl1[i]==tbl2[j]) {
                    licznik=licznik+1;
                }
                //i2=0;
            }
        }
        System.out.println(licznik +" elementów tablicy 1 znajduje się w tablicy 2");
    }




//----
}
