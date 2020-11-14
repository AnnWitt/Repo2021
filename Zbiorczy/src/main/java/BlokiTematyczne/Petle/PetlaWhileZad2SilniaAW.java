package BlokiTematyczne.Petle;

import java.util.Scanner;

class PetlaWhileZad2SilniaAW {
    public static void main(String[] args) {
        Scanner podSilnie = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        long liczba = podSilnie.nextInt();//bo się w int nie miesci wiecej niz 12
long liczba2=liczba;


        long i = 1;
        do {
            //i=liczba*liczba;
            i*=liczba;
            liczba--;
        } while (liczba>1);

        System.out.println("Silnia z " + liczba2 + " wynosi " +i);



/* inna petla
  long silnia=1;
        while (1 < liczba) {
            silnia = silnia * liczba;
            liczba--;
        }
        System.out.println(silnia);*/



        }

    }

