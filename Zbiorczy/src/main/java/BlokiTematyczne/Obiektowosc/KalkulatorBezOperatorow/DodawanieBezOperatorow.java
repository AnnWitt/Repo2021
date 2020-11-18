package BlokiTematyczne.Obiektowosc.KalkulatorBezOperatorow;

public class DodawanieBezOperatorow {

   /* WAGA 3 !!!!!!! przy rozwiązaniu zadania WOLNO korzystać TYLKO ! z operatorów i++, ++i, i--, --i -
    NIE WOLNO KORZYSTAĆ Z innych operatorów arytmetycznych tj. +, -, *, /, %*/

    public static void main(String[] args) {
        int a = 48, b = 60;

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println(a + " + " + b);

        while (a > 0) {
            a--;
            b++;
        }
        int wynik = b;
        System.out.println(wynik);
    }
}
