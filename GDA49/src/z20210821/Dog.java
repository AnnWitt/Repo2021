package z20210821;

public class Dog {
     private String name;

     //final String name; //moze byc zadeklarowana tylko raz, niezmienna //setter nie bedzie dzialac

//jezeli brak konsturktora to jest bezparametrowy, domyuslny


    private Dog(String name) {
        this.name = name;
    }

    public static Dog stworzPsa(String name){ //metoda statyczna danej klasy, tu dopiero tworzymy obiekt Dog
        return new Dog(name); // tędy tworzymy psa i tu jest publiczny, wywolujemy w ramach klasy prywatna bo tu sie da
       // przy statycznej nie jest koniecznie utworzenie obiektu (Dog utworzony nie został), wystarczy odwolac sie bezposrednio do klasy
    }

    //---------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
