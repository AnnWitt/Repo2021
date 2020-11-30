package BlokiTematyczne.Obiektowosc.Caretaker;

public class Main {

    public static void main(String[] args) {

        Caretaker opiekun1 = new Caretaker();
        //System.out.println(opiekun.age);
        Animal zwierze1 = new Animal("Bestia", 1);
        Animal zwierze2 = new Animal("Kamikadze", 5);
        Animal zwierze3 = new Animal("Bikini", 2);
        Animal zwierze4 = new Animal("Wypłosz", 5);
//obiekty zwierze 1,2,3
        opiekun1.registerAnimal(zwierze1);
        opiekun1.registerAnimal(zwierze2);
        opiekun1.registerAnimal(zwierze3);
        opiekun1.registerAnimal(zwierze4);

        zwierze1.getOpiekun().setName("Ania");
        zwierze1.getOpiekun().setSurname("Wittmann");
        zwierze1.getOpiekun().setAge(35);

        Animal[] tablica = new Animal[]{zwierze1, zwierze2, zwierze3, zwierze4};

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i].getId() + " " + " " + tablica[i].getImie() + " " + tablica[i].getNrKlatki() + " " + tablica[i].getOpiekun().getName() + " " + tablica[i].getOpiekun().getSurname() + " " + tablica[i].getOpiekun().getAge());

        }
    }

}
