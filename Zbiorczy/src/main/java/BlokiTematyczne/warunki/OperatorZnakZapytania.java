package BlokiTematyczne.warunki;

public class OperatorZnakZapytania {
    public static void main(String[] args) {

        int wartosc=4;
        int bezwzgledna;

        System.out.println("warunek if else");
        if (wartosc<0) {
            bezwzgledna=-wartosc;
        } else {
            bezwzgledna=wartosc;
        }
        System.out.println(bezwzgledna);

        System.out.println("operator ?"); //musza byc te same typy wszystkich trzech

       bezwzgledna = wartosc<0 ? -wartosc: wartosc;

        System.out.println(bezwzgledna);




    }
}
