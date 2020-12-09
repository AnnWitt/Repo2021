package BlokiTematyczne.Obiektowosc.Powtorki;

public class Obiektowosc {
    public static void main(String[] args) {
        //tworzenie swojego typu danych ->  mozna w klasie ale zwykle osobny plik

        Samochod moj1Samochod=new Samochod("Seat",2010,"czarny"); //wywolanie konstruktora
       //Samochod moj2Samochod=new Samochod(); //wywolanie konstruktora

/*        moj1Samochod.kolor="Czarny";
        moj1Samochod.rocznik=2010;
        moj1Samochod.nazwa="Seat";*/
        //tak raczej sie nie robi
        //dodaje sie metode konnstruktor
        System.out.println("tu");
        System.out.println(moj1Samochod.nazwa);
        //System.out.println(moj1Samochod.model);
        System.out.println(moj1Samochod.rocznik);
        System.out.println(moj1Samochod.kolor);
        //System.out.println(moj1Samochod.typSilnika);

        Samochod mojsam=new Samochod(); //ten pusty - drugi konstruktor
        Samochod s3=new Samochod("rrr");
        System.out.println("mojsam " + mojsam.nazwa);
        System.out.println("s3 " + s3.nazwa);
//do tej pory wywolania statyczne

        s3.setNazwa("ddd"); //wywolanie metody
        s3.setTypSilnika("na wode"); //mozna tu dac w metodzie ze np if equals to lub to to ustawia cos
        // na typ silnika. troche zabezpieczenie przed niepoprawnymi, bezsensownymi danymi

        //czemu setnazwa - w tym przypadku nie ma roznicy ale np jak typsilnika
        //!!!!overloading vw overwritting - WAZNE


Samochod m1=new Samochod("seat");
Samochod m2=new Samochod("se2at");
Samochod m3=new Samochod("sea3t");


        System.out.println(m1.getNazwa());
        System.out.println(m2.getNazwa());
        m1.setNazwa("ddddddd");
        System.out.println(m1.getNazwa());
        System.out.println(m2.getNazwa());
        System.out.println("kola " + m2.iloscKol); //tu trzeba bylo wpisac recznie, nie chcial podpowiadac


        //klakulator
        Kalkulator k=new Kalkulator();
        int plus=Kalkulator.dodaj(2,3);
        System.out.println(plus);


    }//main

}// klas
