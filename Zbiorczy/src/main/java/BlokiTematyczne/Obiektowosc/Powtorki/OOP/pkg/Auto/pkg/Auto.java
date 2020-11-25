package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg.Auto.pkg;

import BlokiTematyczne.Obiektowosc.Powtorki.Zaczyty;

public class Auto {

    //pola clasy wraz z modyfikatorami dostepu, zbiór danych
    // pola definiujemy jak zmienne ale dodajemy modyfikatory dostepu
    private String autoMarka;
    private String autoPaliwo;
    private int autoRocznik;
    public int autoIloscDrzwi;

    public static void main(String[] args) { //w maiinie wywolujemy
        Auto klasaAutoMarka = new Auto("Seat"); //klasa utworzona z konstruktora
        String zmiennaAutoMarka = klasaAutoMarka.autoMarka;
        System.out.println(zmiennaAutoMarka);
        System.out.println("wywolanie z konstruktora od liczby drzwi");
        Auto liczbadrzwiRazy10 = new Auto(4); //tu jest liczbowe nie mozna uzyc tego samego co powyzej.
        //dla kazdego pola z klasy public musi byc osobny
        //klasa Auto tak jak klasa Random. Metoda to to z return.
        //na tym etapie mamy mfunkcję autoIloscDrzwi
        int x = liczbadrzwiRazy10.autoIloscDrzwi;
        System.out.println("Liczba dzwi razy 10 " + x);
        Auto klasaPaliwo=new Auto("diesel");
        System.out.println("Paliwo " + klasaPaliwo.autoPaliwo);
        Auto klasaRocznik=new Auto(2010);
        System.out.println("rocznik + 40 tys " + klasaRocznik.autoRocznik);
    }

    //konstruktor stringow
    public Auto(String wartoscString) { //alt int -> tworzenie konstruktora wchodzi z argumentem
        this.autoMarka = wartoscString + " argument (SEAT) + zwrocenie z konstruktora "; //
        // powyzej - to bedzie zwracane przy wywolaniu zmienna.autoMArka
        //w kontruktorze nie jest potrzebny return
        this.autoPaliwo=wartoscString + " napis";
    }

    //konstruktor int
    public Auto(int wartoscInt) { //wartoscInt sie wyswoetli w podpowiedzi
        //this.autoIloscDrzwi = (autoIloscDrzwi * 10); //takie cos da zero bo autoIlosc drzwi =0
        this.autoIloscDrzwi = (wartoscInt * 10); //to da 40, liczba 4 przyszla z wywolania i jest jako "wartoscInt"
        this.autoRocznik=wartoscInt + 40000;
    }

//moze jest mozliwosc ze pojdzie to wszystko zrobic w jednym konstruktorze i bez wprowadzania wartosci przychodzacej
    //sprawdz to pozniej

}

class AutoDrugaKlasa {
    public static void main(String[] args) {
        Auto kontruktor2=new Auto(5);
        System.out.println("wywolanie w drugiej klasie (tej bez wpisania pól " + kontruktor2.autoIloscDrzwi);
        System.out.println(Zaczyty.PString2());
    }

}





// widocznosc:
// w ramach klasy: public, private, protected, brak
// w ramach pakietu : public, protected, brak
// w ramach Inne: public,