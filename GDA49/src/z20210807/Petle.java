package z20210807;

import java.util.Random;

public class Petle {

    public static void main(String[] args) {

/*        wyswietlLiczby();
        wyswietlImiona();

        System.out.println(iloscWystapienLiteryWTekscie("window", 'w'));
        System.out.println("liczenie znakow while");
        System.out.println(iloscWystapienWhile("window", 'w'));
        System.out.println("4 wyrzucono za " + IleRazyRzutKostka(4) + " razem");

        wyswietlLiteryAlfabetu();*/
        //WypisLiczb();

        //trojkaty();
        //wyswietlImionaWhile();

        przykladContinue();
    }

    //----------------
    private static void wyswietlLiczby() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("numer " + i);
        }
    }

    private static void wyswietlImiona() {
        String[] imiona = {"Ala", "Adam", "Amdrzej", "Ola", "Pawel", "Ewa"};
        for (String imie : imiona) {
            System.out.println("Imie: " + imie);

        }
        //aby tylko te na A
        System.out.println("tylko na A");
        for (String imie : imiona) {
            if (imie.startsWith("A")) {
                System.out.println("Imie: " + imie);
            }

        }


//        private static void wyswietlliczbyPierwsze () {
//            int dzielna;
//            int dzielnik;
//            for (int i = 1; i <= 10; i++) {
//
//                dzielna = i;
//
//            }
//        } //zrobic
    }

    private static int iloscWystapienLiteryWTekscie(String text, char znak) {
        System.out.println("Liczenie znaków");
        int licznik = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == znak) {
                licznik++;
            }
        }
        return licznik;
    }

    private static int iloscWystapienWhile(String text, char znak) {
        int licznik = 0, i = 0;

        while (i < text.length()) {
            if (text.charAt(i) == znak) {
                licznik++;
            }
            i++;
        }
        return licznik;
    }

    private static int IleRazyRzutKostka(int liczba) {
        System.out.println("rzut kostka");
        Random losowy = new Random();
        int licznik = 0;

        while (true) {
            int kostkaNumer = losowy.nextInt(6) +1;
            if (kostkaNumer == liczba) {
                break;
            } else {
                System.out.println("Wyrzucona liczba to: " + kostkaNumer);
                licznik++;
            }

        }
        return licznik+1;
    }

    private static void wyswietlLiteryAlfabetu () {
        char startCH='a';
        char stopCH='z';
        int startINT=startCH;
        int stopINT=stopCH;
        System.out.println("litery alfabetu");
        //zobacz czy da sie na 2 deklaracjach

        for (int i=startINT;i<=stopINT;i++) {
            System.out.print((char)i + " "); //bez char były liczby integer
        }

        for (int i=startINT;i<=stopINT;i++) {
            System.out.print((char)i + " "); //bez char były liczby integer
        }
    }

    private static void WypisLiczb () {
        System.out.println("Wypisz wszystkie liczby z zakresu 5 - 25.");
        for (int i=5; i<=25;i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Wypisz wszystkie liczby z zakresu 55 - 80.");
        for (int i=55; i<=80;i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(" 3. Wypisz wszystkie liczby z zakresu 1 - 100 zaczynając od 100.");
        for (int i=100; i>=1;i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(". Wypisz wszystkie liczby parzyste z przedziału 0 - 100.");
        for (int i=1; i<=100;i++) {

            if (i%2==0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
        System.out.println("Podaj sumę wszystkich liczb z przedziału 1 - 50 (skorzystaj z pętli for).");
        int suma=0;
        for (int i=1; i<=50;i++) {
            suma=suma+i;
        }
        System.out.println("suma wynosi " + suma);

        System.out.println();
        System.out.println("wartość sumy wyrazów ciągu arytmetycznego. Wartość pierwszego wyrazu\n" +
                "        ciagu to 5, różnica każdych kolejnych dwóch wyrazów to 2. Chcemy zsumować 459\n" +
                "    wyrazów (skorzystaj  z pętli for)");
        int sumaCiagu=5;
        int wyrazCiagu=5;
        int dlugoscCiaguPozaPetle=1;
        for (int dlugoscCiagu=1; dlugoscCiagu<459;dlugoscCiagu++) {

            if (wyrazCiagu==5) {
                System.out.println(5);
            }
            //System.out.println(wyrazCiagu);
                wyrazCiagu=wyrazCiagu+2;
            System.out.println(wyrazCiagu);

            sumaCiagu=sumaCiagu+wyrazCiagu;
            dlugoscCiaguPozaPetle=dlugoscCiagu;
        }
        System.out.println("suma " + sumaCiagu + "  dlugosc ciagu wynosi: " + (dlugoscCiaguPozaPetle+1));


        /* 7. Dla liczb z przedziału 0 - 100 podaj informację, czy są podzielne przez 2, 3 i 5,
            w (dokładnie) następujący sposób:*/
       /* 0, podzielne przez 2, podzielne przez 3, podzielne przez 5
        1
        2, podzielne przez 2
        3, podzielne przez 3
        4, podzielne przez 2
        5, podzielne przez 5
        6, podzielne przez 2, podzielne przez 3
        7
        8, podzielne przez 2
        9, podzielne przez 3
        10, podzielne przez 2, podzielne przez 5*/
        System.out.println();
        System.out.println("Liczby 0 do 100 z info czy podzielne przez 2,3,5");
        for (int i=0;i<=100;i++){
            System.out.print(i);
            if (i%2==0) {
                System.out.print( " podzielne przez 2, ");
            }
            if (i%3==0) {
                System.out.print( " podzielne przez 3, ");
            }
            if (i%5==0) {
                System.out.print( " podzielne przez 5 ");
            }
            System.out.println();



        }
    }

    private static void trojkaty (){

/*        8. Wypisz w konsoli:
*
**
***
****
*****
        Wierszy w takim formacie chcemy uzyskać tyle, ile wynosi wartość przypisana zmiennej x.*/

        System.out.println();
        System.out.println("Trojkaty");
        System.out.println();
        for (int y=1;y<=5;y++) {
            System.out.println();
            for (int x=1;x<=y;x++){
                System.out.print("*");
            }
        }
        System.out.println();
        //------

/*        9. Wypisz w konsoli:
****
***
**
**/
        for (int y=1;y<=5;y++) {
            System.out.println();
            for (int x=5;x>=y;x--){
                System.out.print("*");
            }
        }
        System.out.println();


/*
   10. Podobnie jak poprzednie ale chcemy uzyskać trójkąt z kątem prostokątnym w górnym, prawym rogu:
*****
 ****
  ***
   **
    *

  * */

        for (int y=1;y<=5;y++) {
            System.out.println();
            for (int x=1;x<y;x++){
                System.out.print(" ");
            }
            for (int x=5;x>=y;x--){
                System.out.print("*");
            }
        }

        System.out.println();

        for (int y=1;y<=5;y++) {
            System.out.println();

            for (int x=5;x>y;x--){
                System.out.print(" ");
            }

            for (int x=0;x<y;x++){
                System.out.print("*");
            }
        }


    }

    private static void wyswietlImionaWhile () {
        String[]imiona={"imie1", "imie2","imi3"} ;
        int i= imiona.length;
        int index=0;
        do {
            System.out.println(imiona[index]);
            i++;
        }
        while (i< imiona.length);





/*        System.out.println("wartość sumy wyrazów ciągu arytmetycznego. Wartość pierwszego wyrazu\n" +
                "        ciagu to 5, różnica każdych kolejnych dwóch wyrazów to 2. Chcemy zsumować 459\n" +
                "    wyrazów (skorzystaj  z pętli for)");
        int sumaCiagu=5;
        int wyrazCiagu=5;
        int dlugoscCiaguPozaPetle=1;
        for (int dlugoscCiagu=1; dlugoscCiagu<459;dlugoscCiagu++) {

            if (wyrazCiagu==5) {
                System.out.println(5);
            }
            //System.out.println(wyrazCiagu);
            wyrazCiagu=wyrazCiagu+2;
            System.out.println(wyrazCiagu);

            sumaCiagu=sumaCiagu+wyrazCiagu;
            dlugoscCiaguPozaPetle=dlugoscCiagu;
        }
        System.out.println("suma " + sumaCiagu + "  dlugosc ciagu wynosi: " + (dlugoscCiaguPozaPetle+1));*/



    }


    //continue i break

    private static void przykladBrak() {
        for (int i=0; i<10;i++) {
            if (i==3) {break;}
                System.out.println(i);
        }
    }

    private static void przykladContinue() {
        for (int i=0; i<10;i++) {
            if (i==8) {continue;} //wyswietli bez 8
            System.out.println(i);
        }
    }




/*1. Zadeklaruj dwie zmienne liczbowe (całkowite) i przypisz im wartości.
    Następnie wypisz wartość większej z nich. Do sprawdzenia, która jest większa użyj instrukcji warunkowej.*/


}
