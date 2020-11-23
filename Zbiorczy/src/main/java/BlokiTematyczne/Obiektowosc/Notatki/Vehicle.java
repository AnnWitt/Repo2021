package BlokiTematyczne.Obiektowosc.Notatki;

class MainVehicle {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(); //obiekt typu Vehicle o nazwie minivan,deklaracja
        Vehicle sportscar = new Vehicle();
        //minivan instancja klasy Vehicle
        //Zmienna minivan nie definiuje obiektu, zawiera jego referencję (parametr new)
        int range1, range2;

        minivan.fuelcap = 65;
        minivan.passengers = minivan.passengers + 7; //tu siegnelam do wartosci z klasy Vehicle i ja zmienilam w obrebie tej klasy
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap = 100;
        sportscar.lkm = 13.8;

        range1 = (int) (minivan.fuelcap / minivan.lkm * 100);
        range2 = (int) (sportscar.fuelcap / sportscar.lkm * 100);
        System.out.println("Minivan przewozi " + minivan.passengers + " na odleglosc do " + range1 + " km");
        System.out.println("Sport Car przewozi " + sportscar.passengers + " na odleglosc do " + range2 + " km");

        System.out.println("Po modyfikacji metody w klasie Vehicle ");

        minivan.rangem(); //wywolanie calej metody

        range2 = sportscar.range2m();
        System.out.println(range2);
        range2 = range2 + 100;
        System.out.println(range2);

        System.out.println("mozna tez tak " + minivan.range2m());

        System.out.println("argumenty");

        ChkNum czyPodzielne = new ChkNum();
        //czyPodzielne.isEven(3);
        System.out.println(czyPodzielne.isEven(3)); // <-- 3 jest argumentem wywolania


        System.out.println("na ile km minivan " + minivan.fuelneeded(150) + " na ile sportcar " + sportscar.fuelneeded(150));

    }
}


//////////////////////////////////////////////////////////////////////
class Vehicle {

    int passengers = 10; //liczba pasazerow
    int fuelcap; //podejmnosc zbiornika paliwa w litrach
    double lkm; //zuzycie paliwa w litrach na 100 km

    void rangem() { //metoda bez parametrow
        System.out.println("Zasieg z void range " + (int) (fuelcap / lkm * 100) + "test pasazerowie " + (passengers + 4));
        System.out.println("dupa");
    }

    int range2m() {
        return (int) (fuelcap / lkm * 100);
    }

    double fuelneeded (int km) {
     return (double) km/100*lkm;

    }


// koniec Vehicle
}

class ChkNum {
    boolean isEven(int x) {//<---- parametr metody isEven
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
