package z20210822.varargs;

public class CwVarargs {

    //nie wiemy ile arg pryzjdzie do sumy np
    //bysmy musieli tworzyc kilka + metod i korzystamy w zaleznoaci od ilosci argumentow

    //alternatywa


    //mogloby być tak ale chcemy aby to wyszlo bez tworzenia tablicy
    public int sumaTBL(int[] liczby) {
        int wynik = 0;
        for (int liczba : liczby) {
            wynik += liczba;
        }
        return wynik;
    }

    //chemy osiagnac suma(1,2,3,4)

    public static int sumaV(int... liczby) { //ten zapis zastepuje wswzystkie mozliwe zpaisy dot ilosci argumentow
        int wynik = 0;
        for (int liczba : liczby) {
            wynik += liczba;
        }
        return wynik;
    }

    ///////////////////////////////
    //Wypisac na ekranie dowolną liczbe imion - wypisz imiona

    public static void imionaWypisz(String... imiona) {
        System.out.println("podano imiona: ");
        for (String name : imiona) {
            System.out.print(name + " ");
        }
    }



    //-----------
}