package BlokiTematyczne.Obiektowosc.Caretaker;

import java.util.ArrayList;

public class Caretaker {

    String name;
    String surname;
    int age;
    ArrayList<Animal> zwierzeta = new ArrayList<>(); //Animal z osobnej klasy


    private String imie;
    private int nrklatki;

    public Caretaker() {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Caretaker(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void registerAnimal(Animal zwierze) { //AW:przeanalizuj to jeszcze dokładniej abys sie upewniła, że wiesz jak z tego korzystac (poeksperymentuj,zrob na trzech klasach, dodatkowe pola itd)
        zwierzeta.add(zwierze);
        zwierze.setOpiekun(this); // ---> do wyjasnienia co to dokaldnie robilo

    }

    // Gettery i Settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //
}
