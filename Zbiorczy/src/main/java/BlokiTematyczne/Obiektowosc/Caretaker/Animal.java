package BlokiTematyczne.Obiektowosc.Caretaker;

public class Animal {

    int id;
    //"pole statyczne współdzielone jest przez wszystkie obiekty, ponieważ należy do klasy a nie do konkretnego obiektu"

    private static int nextId=1; // jak bylo tylko int to byl ten sam numer -> doczytaj co tu sie stalo - to gdzies bylo
    //public static int nextId=1; //wynik wyszedl taki sam jak z powyzszego tj 1,2,3,4

   //public int nextId=1;
    // jak bylo tylko int to byl ten sam numer -> doczytaj co tu sie stalo - to gdzies bylo


/*    public static int RozmiarPlanszy=3; //do ew wywolywania w wieszkej liczbie klas
    public final static int ZmiennaNiezmienna=3; //nie mozna jej modyfokowac po 1 nadaniu wartosci
    */

    String imie;
    int nrKlatki;
    Caretaker opiekun;

    public Animal(String imie, int nrKlatki) { //pbulic aby poruszac się w obrębie pakietu Caretaker.pkg
        id = nextId;
        nextId++;
        this.imie = imie;
        this.nrKlatki = nrKlatki;
    }

    // Gettery i Settery
    public int getId() {
        id = id;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getNrKlatki() {
        return nrKlatki;
    }

    public void setNrKlatki(int nrKlatki) {
        this.nrKlatki = nrKlatki;
    }

    public Caretaker getOpiekun() {
        return opiekun;
    }

    public void setOpiekun(Caretaker opiekun) {
        this.opiekun = opiekun;
    }
}
