package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg.KlasaWKlasie.pkg;

public class ZewnetrznaKlasa {

    private String nazwa = "Test klas";

    public class wewnetrznaKlasa { //do niej siegamy tak jakby to były metody
        public void wypiszTekst() { //konstruktor
            System.out.println(nazwa);
        }

        public void dupa() { //konstruktor
            System.out.println(nazwa + " duppa");
        }
    }

    public wewnetrznaKlasa wywolanie() {
        return new wewnetrznaKlasa();
    }
}
/*
public class MyOuterClass {
    private int outerNumber = 5;
    public class MyInnerClass {
        public void printNumber() {
            System.out.println(outerNumber+10);
        }
    }
    public MyInnerClass init() {
        return new MyInnerClass();  // = this.new MyInnerClass()
    }
}*/
