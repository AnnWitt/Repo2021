package Z_20200926.pkg;

import org.w3c.dom.ls.LSOutput;

public class HelloWorld { //klasa moze zawierac wiele metod,tu nie piszemy kodu. Kod tylko w metodach
    //miejsce na zmienne dost. w kazzdej metodzie
    private int xxxprivate; //private akcesor, kto widzi zmienną, argument opcjonalny.
    int xxx = 99;
    static int x = 99;
    public int xxxpublic;
    //zmienne dostepne dla calej klasy, mozna tylko deklarowac
    //Jak wywolac w metodzie


    public static void main(String[] args) { //psvm skrot - metoda

        System.out.println("Witaj Swiecie");
        //projekt mavenowy domyslnie ma v5 javy, trzeba zmienic w pom.xml - screen w onenote

        //private int liczba; //private akcesor, kto widzi zmienną, argument opcjonalny.
        // W tym położeniu nie działa - dlaczego

        int liczba2 = 7; //
        String imie;

        System.out.println(liczba2);
        //System.out.println(static); //do poszukania dla deklaracji w class

    }

}
    //class Log {

