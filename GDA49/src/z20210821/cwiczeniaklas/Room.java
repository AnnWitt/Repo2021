package z20210821.cwiczeniaklas;

public class Room {

    //5. Stwórz klasę Room, która będzie miała pola: area oraz height, konstruktor oraz gettery.

    private int area, height;

    public Room(int area, int height) {
        this.area = area;
        this.height = height;
    }

   void wymiar() {
        System.out.println(getArea() + " " + getHeight());
    }

    //-----------

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
