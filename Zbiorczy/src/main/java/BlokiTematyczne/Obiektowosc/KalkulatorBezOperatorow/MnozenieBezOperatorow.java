package BlokiTematyczne.Obiektowosc.KalkulatorBezOperatorow;

public class MnozenieBezOperatorow {
    public static void main(String[] args) {

        int liczba = 3, mnoznik = 3;
        int doLiczby = liczba;
        int cykl = liczba;

        while (mnoznik > 1) {
            doLiczby = cykl;
            while (doLiczby > 0) {
                liczba++;
                doLiczby--;
            }
            mnoznik--;
        }

        int wynik = liczba;

        System.out.println(wynik);

    }
}
