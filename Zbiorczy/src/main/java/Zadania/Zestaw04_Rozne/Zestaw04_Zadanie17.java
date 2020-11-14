package Zadania.Zestaw04_Rozne;

import java.util.Scanner;

public class Zestaw04_Zadanie17 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int Dlugosc=0;
        String PodanyPesel = null;


        while (Dlugosc!=11) {
            System.out.println("Wpisz 11 cyfrowy PESEL");
            PodanyPesel = input.next();
            Dlugosc = PodanyPesel.length();
            if (Dlugosc!=11) {
                System.out.println("Podany PESEL ma niewłaściwą długość");
            }
        }

        /*String PodanyPesel="85081302182"; //dodaj walidację po długości bo się wywala
        System.out.println(PodanyPesel);*/
        String[] PeselTabela=PodanyPesel.split("",Dlugosc);
        int[] PeselTabelaInt=new int[Dlugosc];
        int[] Walidacja=new int[Dlugosc];
        //System.out.println(PodanyPesel);

        for (int i=0;i<Dlugosc;i++) {
            PeselTabelaInt[i]= Integer.parseInt(PeselTabela[i]); //Tworzenie nowej tablicy integer z tymi wartosciami
        }

        int[] WzorzecTabela=new int[]{1,3,7,9,1,3,7,9,1,3,1}; //11 elementów

        int suma=0;
        for (int i=0;i<11;i++) {
            suma=suma+(PeselTabelaInt[i]*WzorzecTabela[i]);
        }
        //System.out.println("total" + suma);

        if (suma>0 && suma%10==0) {
            System.out.println("Poprawny Pesel");
        } else {
            System.out.println("Niepoprawny pesel");
        }

        // koniec klasy

    }
}
