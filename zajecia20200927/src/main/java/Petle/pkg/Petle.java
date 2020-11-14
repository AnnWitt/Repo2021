package Petle.pkg;

import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {

        int warWyjscia = 10;
        int warPocz = 0;

        for (int i = warPocz; i < warWyjscia; i++) { //jak zrobic skok o 2
            System.out.println(i);
        }
    }
}

class ZadaniePetlaFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("liczbe");
        int liczba = input.nextInt();
        System.out.println("podaj dzielnik");
        int dzielnik = input.nextInt();

        for (int i = 1; i < liczba; i++) {
            if (i % dzielnik == 0) { //podzielne bez reszty
                System.out.println(i);
            } else {
                //System.out.println("niepodzielne");
            }
        }
    }
}

class ZadaniePetlaForPotegi {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("podaj n ");
        int n = liczba.nextInt();
        System.out.println("podaj m");
        int m = liczba.nextInt();
        int potega = n;
        if (m != 0) {
            //blad - 3^0 =1
            for (int i = 1; i < m; i++) { //i=i+2  <--> i += 2) //to co było zwiekszone o dwa
                potega = potega * n;
                //potega *=n; zapis skrocony = powyzszemu
            }
        } else {
            potega = 1;
        }
        System.out.println(n + "^" + m + " = " + potega);

    }


}
//// zrob analogicznie dla wyswietlanie liczb pierwszych

class LiczbyPierwsze {
    public static void main(String[] args) {
        boolean czyIjestLiczbaPiersza = true; //zakladamy ze tak poki nie udowodnimy ze jest inaczej
        for (int i = 10; i > 1; i--) {
            czyIjestLiczbaPiersza = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // nie jest liczba pierwsza
                    czyIjestLiczbaPiersza = false;
                }
            }
            if (czyIjestLiczbaPiersza==true) {
                System.out.println("i jest liczba pierwsza" + i);
            }
        }
    }
}

class PodzielnoscPrzez2i3 {
    public static void main(String[] args) {
        //do domu - 100 do 200 podzielne przez 2 i 3
    }
} //!!!!!!!!!!!!!!!

class PetlaWhile { //sprawdz warunek i dopiero rob
    public static void main(String[] args) {
        int i=2;
        while (i<5){ //poki true bedzie sie wykonywac (warunek
            System.out.println(i);
            i++;
        }
        System.out.println("Zadanie");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba=scan2.nextInt();
        //suma wszystkich poprzedzających
        int j=0;
        int suma=liczba;

        while(j<liczba) {
            suma=suma+j;
            j++;
        }
        System.out.println(suma);
    }
}

class PetlaWhileZad2 {
    public static void main(String[] args) {
        Scanner podSilnie=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba=podSilnie.nextInt();

        //liczbs = 3 czyli 3+2+1
        int i=1;

        if (liczba<=12) { //bo się w int nie miesci
            while (liczba > 1) {
                i = i * liczba; //
                liczba--;
            }
            System.out.println("silnia " + i);
        }

//!!!!!!!!!!!przerób to, zaczelas inna koncepcja - podobna jak powyzej
    }
}

class PetlaDoWhile {
    public static void main(String[] args) {
        // do {instrukcja} while(warunek); //wykona sie przynajmniejraz - zrob i dopiero sprawdzaj warunek

        //wczytuj tak dlugo az nie jest 13

        Scanner dw=new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba=dw.nextInt();

        while(liczba!=13) {
            System.out.println("podaj liczbe");
            liczba=dw.nextInt();
        }
        System.out.println("jest 13"); //powtorka dopoki nie ma 13

        System.out.println("podaj liczbe");
        int liczba2=dw.nextInt();

        do {
            System.out.println("podaj liczbe");
            liczba=dw.nextInt();
        } while(liczba2!=13);
        System.out.println("liczb2 jest 13");


//        do {
//            System.out.println("Podaj liczbe");
//            wczytanaLiczba = scanner.nextInt();
//        } while (wczytanaLiczba != 13);
//        System.out.println("Brawo, trafiles!");

        //!!!!!!!!!!!!!!przecwicz
    }
}

class PetleZadanieDoWhile1 {
    public static void main(String[] args) {
        //wszystkie liczby mniejsze od wpisanej od uzytkownika poki wieksze od 0
        Scanner scn=new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int liczba=scn.nextInt();

        do {
            System.out.println(liczba-1);
            liczba--;} while ((liczba-1)>0);//bez zera
            //liczba--;} while ((liczba-1)>0); z zerem
    }
}

class PetleZadanieDoWhile1mod {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int liczbaOdUżytkownika;

        //do {liczbaOdUżytkownika};



    }
}

class PetleZadanieDoWhile2 {
    public static void main(String[] args) {
         //wartosc pierwiastka z wprowadzonej liczby dopoki liczba>0
        Scanner scp=new Scanner(System.in);
        System.out.println("podaj liczbe całkowitą");
        int liczbaC=scp.nextInt();


       do {
          liczbaC=((liczbaC)/2);

          //ok a teraz sam pierwiastek
          //liczbaC--;
        } while (liczbaC>0);

    }
}



