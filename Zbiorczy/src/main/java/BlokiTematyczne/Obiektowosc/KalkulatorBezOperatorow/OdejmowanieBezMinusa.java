package BlokiTematyczne.Obiektowosc.KalkulatorBezOperatorow;

public class OdejmowanieBezMinusa {

    public static void main(String[] args) {

        int a = 10, b = 60;

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println(a + " - " + b);

        while (a > 0) {
            a--;
            b--;
        }

        int wynik = b;
        System.out.println(wynik);

    }


}
