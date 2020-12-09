package BlokiTematyczne.Obiektowosc.Powtorki;

public class Samochod { //tu bedzixemy ztypy zmiennych robic

    public static int iloscKol=4;
    String nazwa;
    int rocznik;
    String typSilnika;
    String kolor;
    String model;
    //konstruktor - nazwa metody musi byc taka sama jak nazwa klsy

//metoda statyczna nie potrzebuje pracowac na danych obiektu

    public Samochod(String nazwasamochodu, int rocznisamochodu, String kolorsamochodu) {
        int test=10; //dostepna tylko w tej metodzie ale kontruktor ma dostep do wszyskich pol od samochodu
        //dane +operacje
        //nazwa="Seat";
        nazwa=nazwasamochodu;
        //rocznik=2010;
        rocznik=rocznisamochodu;
        //kolor="Czarny";
        kolor=kolorsamochodu;
        typSilnika="1.9 TDI";
        model="Alhambra";
        //uwaga zwroci to samo dla kazdego wywolania jesli tu wpiszemy, musi wejsc w wywolaniu
    }

    public Samochod() {
        //pusty
    }

    public Samochod(String nazwaSamochodu) { //sygnatura metody - nazwa + parametry
        nazwa=nazwaSamochodu;
    }
    //metoda moze miec taka sama nazwe jesli ma inne argumenty

 //alt insert consturktor i wybieramy z listy
    public Samochod(String nazwa, int rocznik, String typSilnika, String kolor, String model) {
        this.nazwa = nazwa; //this ten obiekt - tutaj , bez this to co przyszlo w argumencie
        this.rocznik = rocznik;
        this.typSilnika = typSilnika;
        this.kolor = kolor;
        this.model = model;
    }

    //getter i setter


    public String getNazwa() { //wczytanie
        return nazwa;
    }

    public void setNazwa(String nazwa) { //przypisanie
        this.nazwa = nazwa;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public String getTypSilnika() {
        return typSilnika;
    }

    public void setTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Samochod (Samochod innySamochos) {
        this.nazwa=innySamochos.getNazwa();
        this.rocznik=innySamochos.getRocznik();
    }
}
