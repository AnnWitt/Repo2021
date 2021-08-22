package z20210821.cwiczeniaklas;

public class Person {

/*
    3. Stwórz klasę Person, która będzie miała pola: firstName, lastName oraz age oraz konstruktor (ustawiający wartości
     wszystkich pól), gettery i setter dla wieku.
*/
    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
