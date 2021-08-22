package z20210821.cwiczeniaklas;

public class CoffeMaker {

/*    4. Stwórz klasę CoffeeMaker (ekspres do kawy). W klasie mamy pola: manufacturer (producent),
    grindSize (stopień mielenia). W klasie mamy konstruktor ustawiający wartości pól zgodnie z wartościami parametrów.
    Klasa oferuje metodę makeCoffee, która niczego nie zwraca. Metoda wypisuje w konsoli tekst: Ekspres firmy ... mieli ziarna
    na grubość ... i parzy kawę.*/
private static String manufacturer, grindsize;

    public CoffeMaker(String manufacturer, String grindsize) {
        this.manufacturer=manufacturer;
        this.grindsize=grindsize;
    }

    static void makeCoffee () {
        System.out.println("Ekspres firmy " + getManufacturer() + " mieli ziarna na grubosc " + getGrindsize() + " i parzy kawe");
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        CoffeMaker.manufacturer = manufacturer;
    }

    public static String getGrindsize() {
        return grindsize;
    }

    public static void setGrindsize(String grindsize) {
        CoffeMaker.grindsize = grindsize;
    }




}
