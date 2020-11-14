package BlokiTematyczne.Metody;

public class Metody {
    public static void main(String[] args) { //void tzn ze nie oddaje zadnego wyniku w return, ew wyswietli
        //metody statyczne -
        System.out.println("Suma trzech liczb " + dodajTrzyLiczby(2,5,6));
        //System.out.println("Suma trzech liczb tabl" + dodajTrzyLiczbyTabl(2,5,6));
        //System.out.println("Suma trzech liczb tabl" + dodajTrzyLiczbyTabl(2,5,6)[0]);
        // zwraca okreslony element z wyniku
    }
    public static int dodajTrzyLiczby (int l1, int l2, int l3) { //metoda ma zwrocic  typ int +
        // nazwa (typ pierwszego potem nazwa, potem drugi itd
        int wynik=l1 +l2+l3; //typ wynik w static-  tu int //jesli tu bysmy wpisali double to bylby blad
        return wynik; //koniec metody, nic dalej nie pojdzie bo poza metoda
        //wywola sie w mainie
    }

    public static int[] dodajTrzyLiczbyTabl (int l1, int l2, int l3) { //metoda ma zwrocic  typ int +
        int[] mojeDwaWyniki=new int[2];
        mojeDwaWyniki[0]=100;
        int wynik=l1 +l2+l3;
        mojeDwaWyniki[1]=100;
        return mojeDwaWyniki;
        //zwraca adres w pamieci tablicy poki co  ale sie ogarnie
    }


    //Varargs = metoda o zmiennej ilosci parametrow

    public static int dodaj(int ... n) { //dowolna ilosc liczb, odwolujemy sie tak jak do tablic
        int x=1;
        return x;
    }

    //w metodzie mozna uzyc drugiej

    public static int xxx(int i, int j, int k) {
        dodajTrzyLiczby(i,j,k);
        int x=i+j+k;
        return x;
    }

    // koniec klasy
}
