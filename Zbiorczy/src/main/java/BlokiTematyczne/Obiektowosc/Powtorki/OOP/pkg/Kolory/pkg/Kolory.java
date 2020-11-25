package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg.Kolory.pkg;

import java.util.Scanner;

public class Kolory {
    private String kolor;
    private String faktura;
    private int ilosc;


    //konstruktor
    public Kolory() {
        Scanner scan=new Scanner(System.in);
        System.out.println("podaj kolor");
        kolor= scan.next(); //ooook czyli w konstruktorze mozna tez wywolac wprowadzenie zmiennej z zewnatrz
        this.kolor = kolor + " kolor z konstruktora";
        this.faktura = faktura + "faktura z konstruktora";
        this.ilosc = ilosc + 10;
    }
}


