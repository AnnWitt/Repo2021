package BlokiTematyczne.Obiektowosc.KopiaSamPrez;

public class Z1Zwierze {

    public static void main(String[] args) {
        Z1Opiekun opiekun=new Z1Opiekun();

        opiekun.registerAnimal(1,"Wypłosz",4,"Imie opiekuna","nazwisko opiekuna",40);
        System.out.println(opiekun.getId()+" " +opiekun.getNameZw()+" " +opiekun.getNrKlatki()+" " +opiekun.getName()+" " +opiekun.getSurname()+" " + opiekun.getAge());

    }


    //
}
