package BlokiTematyczne.Obiektowosc.KopiaSamPrez;

import java.util.ArrayList;

public class Z1Opiekun {

    String name;
    String surname;
    int age;
    int id;
    String nameZw;
    int nrKlatki;
    //lista obiektow
    ArrayList<Z1Zwierze> animals =new ArrayList();


    public void registerAnimal (int ID, String nameZw, int cageNumber, String name, String surname, int age) {
       setAge(age);
       setName(name);
       setSurname(surname);
       setId(ID);
       setNameZw(nameZw);
       setNrKlatki(cageNumber);

    }

    //konsturktory
    public Z1Opiekun(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Z1Opiekun() {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

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

    public ArrayList<Z1Zwierze> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Z1Zwierze> animals) {
        this.animals = animals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameZw() {
        return nameZw;
    }

    public void setNameZw(String nameZw) {
        this.nameZw = nameZw;
    }

    public int getNrKlatki() {
        return nrKlatki;
    }

    public void setNrKlatki(int nrKlatki) {
        this.nrKlatki = nrKlatki;
    }

}
