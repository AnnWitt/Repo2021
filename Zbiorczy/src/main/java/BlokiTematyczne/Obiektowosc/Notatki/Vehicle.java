package BlokiTematyczne.Obiektowosc.Notatki;

class MainVehicle {
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle(); //obiekt typu Vehicle o nazwie minivan,deklaracja
        Vehicle sportscar= new Vehicle();
        //minivan instancja klasy Vehicle
        //Zmienna minivan nie definiuje obiektu, zawiera jego referencję (parametr new)
        int range1, range2;

        minivan.fuelcap=65;
        minivan.passengers=minivan.passengers+ 7; //tu siegnelam do wartosci z klasy i ja zmienilam w obrebie tej klasy
        minivan.lkm=9.1;

        sportscar.passengers=2;
        sportscar.fuelcap=100;
        sportscar.lkm=13.8;

        range1=(int) (minivan.fuelcap/ minivan.lkm*100);
        range2=(int) (sportscar.fuelcap/ sportscar.lkm*100);
        System.out.println("Minivan przewozi " + minivan.passengers + " na odleglosc do " + range1 + " km");
        System.out.println("Sport Car przewozi " + sportscar.passengers + " na odleglosc do " + range2 + " km");



    }
}



//////////////////////////////////////////////////////////////////////
class Vehicle {

    int passengers=10; //liczba pasazerow
    int fuelcap; //podejmnosc zbiornika paliwa w litrach
    double lkm; //zuzycie paliwa w litrach na 100 km


}
