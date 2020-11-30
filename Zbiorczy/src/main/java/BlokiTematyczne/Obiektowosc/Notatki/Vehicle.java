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

        System.out.println();
        System.out.println("Konsturktory itd");
        Vehicle k1 = new Vehicle(3, 65, 9.1);
        System.out.println(k1.fuelneeded(150));

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

    double fuelneeded(int km) {
        return (double) km / 100 * lkm;

    }

    Vehicle() {
        System.out.println("cokolwiek");
    }

    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
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

/////Konstruktory////////////

//-------wywolanie
class MyClassMain {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        MyClass t3 = new MyClass(4);

        System.out.println("t1.x " + t1.x + " t2.y " + t2.getY() + " t3.x " + t3.x + " t3.z gdzie z static " + t3.getZ());
    }
}


//----------- klasa z konsturktorami
class MyClass {
    public int x; //zmienne do wywolania w klasie main
    private int y;
    private static int z = 40;

    //konstruktor - public (brak typu) nazwa - () brak argumentow
    MyClass() {
        x = 10;
        y = 30;
        z = getZ(); //ciekawostka -> wyjdzie 43 na koniec bo po kazdym prxejsciu przez to getter zwieksza o jeden
    }

    MyClass(int i) {
        x = i * 10;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) { //daję set 10
        //y = y+1; // y =30
        this.y = y+1; // y =11
    }

    public static int getZ() {
        return z + 1;
    }

    public static void setZ(int z) {
        MyClass.z = z + 10;
    }
}

//masowe definiowanie obiektów (gorzej, że tylko w pętli można z nich korzystać
class TestDeklaracjiIteracja {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            MyClass ti = new MyClass();
            ti.setY(10);
            System.out.println("iteracja " + i + " " + ti.getY());
        }

    }
}
