package W_20200919.pkg;

import java.util.Scanner;


public class Nowy1 {   //nazwa musi byc spojna z nazwa pliku
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Wpisz imię");
        String imie = wejscie.nextLine();
        System.out.println(imie);
        System.out.println("Wpisz liczbę");
//!!!! Pomysl jak tu dodac aby sprawdzal czy liczba i ew kazal wpisac ponownie
        Integer liczba = wejscie.nextInt();
        //zajrzyj inteliuj ze skrótów klawiszowych



        if (liczba > 10) {
            System.out.println("duża liczba");
        } else {
            System.out.println("mala liczba");
        }
// biblioteki np math.
        //int i;

        for (int i = 0; i <= liczba; i++) { //w ramach petli, jesli bedzie srednik
            System.out.println(i);
        }


        /*        for (int i=0; i<=liczba; i++); *//* z śrenikiem konczy sie petla i i staje sie nieokreslona i ndlatego
        pojawi sie blad w kolejnej linii, jezeli po petli pojawi sie kolejna deklaracja to bedzie ok*//*
            System.out.println(i);
        }*/


        {
            /*{
                {
                    int j; //konczy sie w ramach klary
                }
                {
                    int j;
                }
            }*/

            //przyklad char jako liczbowa
            char c = 95;
            short s = -95; //long vs short, long zbiera wiecej pamieci wiec jelsi nie trzeba to brac short zwlaszcza w przypadku graficznych
            System.out.println(c);
            System.out.println((int) c); //jako liczba
            c = 's';
            System.out.println(c);
            //sout wystarczy aby uzupelnil system.out.println


        }


    }

}
