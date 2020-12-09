package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg;

import static java.lang.Math.min;

import BlokiTematyczne.Obiektowosc.Caretaker.Animal;//import z innego pakietu
import BlokiTematyczne.Obiektowosc.Powtorki.Samochod;

public class Kalkulator {
    public static void main(String[] args) {

        double d= dzielenie(13,7);
        Samochod dd=new Samochod("xx");
        Animal animalZinnegoPakietu=new Animal("Wypłosz",14);

        //Nie można stworzyć metody o identycznej nazwie, przyjmującej takie same parametry, różniącej się tylko zwracanym typem! -->dlatego double nie zadziala
        System.out.println("Dodawanie int 5 + 10 = " + dodawanie(5,10));
        System.out.println("Dodawanie double 5 + 10 = " + dodawanie(5,10));
        System.out.println("Odejmowanie int 5 - 10 = " + odejmowanie(5,10));
        System.out.println("Odejmowanie double 5 - 10 = " + odejmowanie(5,10));
        System.out.println("Mnożenie int 5 * 10 = " + mnozenie(5,10));
        System.out.println("Mnożenie double 5 * 10 = " + mnozenie(5,10));
        System.out.println("Dzielenie int 5 / 10 = " + dzielenie(5,10));
        System.out.println("Dzielenie double 5 / 10 = " + dzielenie(5,10));
        System.out.println(d);

    }

    public static int dodawanie(int x, int y) { //jak nie bylo static to nie udawalo sie tego uzyc w mainie
        int dodawanieInt = x + y;
        return dodawanieInt;
    }

    public static double dodawanie(double x, double y) {
        double dodawanieDouble = x + y;
        return dodawanieDouble;
    }

    //
    public static int odejmowanie(int x, int y) {
        int odejmowanie = x - y;
        return odejmowanie;
    }

    public static double odejmowanie(double x, double y) {
        double odejmowanie = x - y;
        return odejmowanie;
    }
    //
    public static int mnozenie(int x, int y) {
        int mnozenie = x * y;
        return mnozenie;
    }

    public static double mnozenie(double x, double y) {
        double mnozenie = x * y;
        return mnozenie;
    }
    //
    public static int dzielenie(int x, int y) {
        if (y!=0) {
            int dzielenie = x / y;
            return dzielenie;
        } else {
            return 0;
        }

    }

    public static double dzielenie(double x, double y) {
        if (y!=0) {
            double dzielenie = x / y;
            return dzielenie;
        } else {
            return 0;
        }

    }



}
