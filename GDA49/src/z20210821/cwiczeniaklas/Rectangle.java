package z20210821.cwiczeniaklas;

public class Rectangle {
    private int a,b;

/*    1. Stwórz klasę Rectangle, która będzie miała pola: a, b (długości boków). Do klasy dodaj konstruktor
            (ustawiający wartości wszystkich pól) oraz gettery.*/
//1b. Dodaj do klasy metodę getArea, która zwróci pole powierzchni, oraz metodę getPerimeter zwracającą obwód figury.

public void getArea () {
    System.out.println("Pole wynosi " + getA()*getB());
}

    void getPerimeter () {
        System.out.println("obwód wynosi " + (2*(getA()+getB())));
    }

    public Rectangle(int a, int b) {
        this.a=a;
        this.b=b;
    }

    //--------------------------
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
