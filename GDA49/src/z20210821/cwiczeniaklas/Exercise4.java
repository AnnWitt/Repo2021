package z20210821.cwiczeniaklas;

public class Exercise4 {

/*    4. Utwórz klasę o nazwie Exercise4. W klasie zapisz kod, który wyświetli:
    Wynik dzielenia 13 przez 5 to : _X_, reszta: _Y_
    gdzie _X_ to wynik dzielenia (użyj operatora dzielenia), a _Y_ to reszta z dzielenia (użyj operatora modulo)*/

    private final String tekst="Wynik dzielenia 13 przez 5 to : ";

    public void display() {
        System.out.println(tekst + " " + 13/5 + " reszta " + 13%5);
    }

}
