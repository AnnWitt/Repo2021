package BlokiTematyczne.Obiektowosc.KalkulatorBezOperatorow;

public class OdejmowanieBezOperatorow {

    public static void main(String[] args) {

        int a = 100, b = 60;


        System.out.println(a + " - " + b);

        while (b > 0) {
            a--;
            b--;
        }

        int wynik = a;
        System.out.println(wynik);

    }


}
